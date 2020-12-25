package servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import models.Client;




/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ClientServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message="" ;
		
		
        String nom = request.getParameter( "nom" );
        String prenom = request.getParameter( "prenom" );
        String adresse = request.getParameter( "adresse" );
        String tel = request.getParameter( "tel");
        String mail = request.getParameter( "mail" );
        Map<String, String> erreurs = new HashMap <String, String>();
         try {
            validationNom( nom );
        } catch ( Exception e ) {
            erreurs.put( "nom", e.getMessage() );   }
        
        try {
            validationAdrs( adresse );
        } catch ( Exception e ) {
            erreurs.put( "adresse", e.getMessage() );  }
          try {
            validationTel( tel);
        } catch ( Exception e ) {
            erreurs.put( "tel", e.getMessage() );
            }
      
   if ( erreurs.isEmpty() ) {
            Client c = new Client();
            c.setNom( nom );
            c.setPrenom( prenom);
            c.setAdresse( adresse);
            c.setTel( tel );
            c.setMail( mail );
          
            request.setAttribute( "client", c );
            String adress="/afficherClient.jsp";
            RequestDispatcher dispatcher =
   				 request.getRequestDispatcher(adress);
   				 dispatcher.forward(request, response);} 
   							 
   				  else {
   					  message="echec de creation d'un client";
   				  request.setAttribute( "erreurs", erreurs );
   				 request.setAttribute( "message", message );
   		        this.getServletContext().getRequestDispatcher("/client.jsp" ).forward( request, response );	
   		  
   				 }
   				 
   			// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	
	private void validationNom( String nom ) throws Exception {
	    if ( nom.equals("") ) {
	        throw new Exception( "Merci d'entrer votre nom");
	    } else if(nom.length() <2){
	    	  throw new Exception( "Le nom d'utilisateur doit contenir au moins 2 caractéres");
	    }
	}
   
	
	
	private void validationAdrs( String adresse) throws Exception {
	    if ( adresse.equals("")  ) {
	        throw new Exception( "Merci d'entrer une adresse de livraison ");
	    } else if( adresse.length() <10) {
	    	  throw new Exception("L'adresse de livraison doit contenir au moins 10 caractéres");
	    }
	}
	
	private void validationTel( String tel) throws Exception {
		
		
		if(tel.equals("")) {
			 throw new Exception( "Merci d'entrer votre numéro de télephone");
		} else 
	    if (!tel.matches("[0-9]+") ) {
	        throw new Exception( "le numéro de téléphone doit uniqument  contenir des chiffres");
	    } else if(tel.length() != 8){
	    	  throw new Exception( "le numéro de téléphone doit contenir 8 chiffres");}
	    
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
