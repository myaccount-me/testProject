package servlets;

import java.io.IOException;
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
import models.Commande;

/**
 * Servlet implementation class CommandeServlet
 */
@WebServlet("/CommandeServlet")
public class CommandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommandeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    String message = "" ;
		    String nom = request.getParameter( "nom" );
	        String prenom = request.getParameter( "prenom" );
	        String adresse = request.getParameter( "adresse" );
	        String tel = request.getParameter( "tel");
	        String mail = request.getParameter( "mail" );
	        String modeP = request.getParameter( "modeP" );
	        String statutP=request.getParameter( "statutP" );
	        String modeL =request.getParameter( "modeL" ); 
	        String statutL =request.getParameter( "statutL" ); 
	        
	        
	        Map<String, String> erreurs = new HashMap <String, String>();
	       double montant;
	        try {
	           
	           montant = Double.parseDouble( request.getParameter( "montant") );
	       } catch ( NumberFormatException e ) {
	          
	        montant=-1.0;
	        	
	           
	        }

	       if(montant==-1) {
	    	   erreurs.put("montant", "Merci d'entrer le Montant");
	       }
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
	          try {
		            validationModeP( modeP);
		        } catch ( Exception e ) {
		            erreurs.put( "modeP", e.getMessage() );
		            }
	          try {
		            validationModeL(modeL);
		        } catch ( Exception e ) {
		            erreurs.put( "modeL", e.getMessage() );
		            }
	         
	         
	         
	        
	          if ( erreurs.isEmpty() ) {
	        	
	        	 Client c = new Client();
	             c.setNom( nom );
	             c.setPrenom( prenom);
	             c.setAdresse( adresse);
	             c.setTel( tel );
	             c.setMail( mail );
	        	Commande cd = new Commande(); 
	        	// SimpleDateFormat formater = null;
	            Date d=new Date(); 
	           // formater = new SimpleDateFormat("dd-MM-yy");
	            cd.setClient(c);
	            cd.setDate( d);
	          
			    cd.setMontant(montant);
			  //  System.out.println(cd.getMontant());
			    cd.setModeP(modeP);
		        cd.setStatutP(statutP);
		        cd.setModeL(modeL);
		        cd.setStatutL(statutL);
		        request.setAttribute( "commande", cd);
		        request.setAttribute( "client", c);
	            String adress="/afficherCommande.jsp";
	            RequestDispatcher dispatcher =
	   				 request.getRequestDispatcher(adress);
	   				 dispatcher.forward(request, response);} else {
	   				  message="echec de creation d'un client";
	   				  request.setAttribute( "erreurs", erreurs );
	   				 request.setAttribute( "message", message );
	     		        this.getServletContext().getRequestDispatcher("/Commande.jsp" ).forward( request, response );	
	   				 
	        } 
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	private void validationNom( String nom ) throws Exception {
	    if ( nom.equals("") ) {
	        throw new Exception( "Merci d'entrer votre nom");
	    } else if(nom.length() <2){
	    	  throw new Exception( "Le nom d'utilisateur doit contenir au moins 2 caractéres");
	    }
	}
	
	private void validationModeP( String modeP ) throws Exception {
	    if ( modeP.equals("") ) {
	        throw new Exception( "Merci d'entrer votre mode de paiment ");
	   
	} }
	private void validationModeL( String modeL ) throws Exception {
	    if ( modeL.equals("") ) {
	        throw new Exception( "Merci d'entrer votre mode de livraison");
	 
	}}
   
	
	
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


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
