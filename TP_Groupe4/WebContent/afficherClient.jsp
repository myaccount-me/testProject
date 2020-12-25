<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="style.css" />
<meta charset="ISO-8859-1">

<title>Cas valide</title>
<style>




</style>
</head>
<body>
<jsp:useBean id="client" type="models.Client" scope="request" />

 <h2 style="  margin: 0px 10px; color:black;font-family:Bahnschrift Light;font-size:18px;color:#0568CD;"><strong><u>Informations Clients :</u></strong></h2>
<ul>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"><strong>Nom :</strong>  <jsp:getProperty name='client' property='nom'/></li> 
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"><strong>Prénom : </strong> <jsp:getProperty name='client' property='prenom' /> </li>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"><strong> Adresse Livraison:</strong>  <jsp:getProperty name="client" property="adresse" />​​</li>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"><strong>Numéro de téléphone: </strong> <jsp:getProperty name="client" property="tel" /></li>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"> <strong> Adresse email : </strong>  <jsp:getProperty name="client" property="mail" />​​</li>
</ul>


 
 
 
 
 
 
 
 
 
 
 
 
 
 

</body>
</html>