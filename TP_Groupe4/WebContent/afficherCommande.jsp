<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet" href="style.css" />
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="commande" type="models.Commande" scope="request" />
<jsp:useBean id="client" type="models.Client" scope="request" />
 <h2 style="  margin: 0px 10px; color:black;font-family:Bahnschrift Light;font-size:18px;color:#0568CD;"><strong><u>Informations Clients :</u></strong></h2>
<ul>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"><strong>Nom :</strong>  <jsp:getProperty name='client' property='nom'/></li> 
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"><strong>Prénom : </strong> <jsp:getProperty name='client' property='prenom' /> </li>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"><strong> Adresse Livraison:</strong>  <jsp:getProperty name="client" property="adresse" />​​</li>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"><strong>Numéro de téléphone: </strong> <jsp:getProperty name="client" property="tel" /></li>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"> <strong> Adresse email : </strong>  <jsp:getProperty name="client" property="mail" />​​</li>


</ul>
<br/>
<h2 style="  margin: 0px 10px; color:black;font-family:Bahnschrift Light;font-size:18px;color:#0568CD;"><strong><u>Informations Commande :</u></strong></h2>
<ul>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"><strong>Date :</strong>  <jsp:getProperty name='commande' property='date'/></li> 
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"><strong>Montant : </strong> <jsp:getProperty name='commande' property="montant"/> </li>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"><strong>Mode Paiment:</strong>  <jsp:getProperty name="commande" property="modeP" />​​</li>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"><strong>statut Paiment: </strong> <jsp:getProperty name="commande" property="statutP" /></li>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"> <strong>Mode Livraison : </strong>  <jsp:getProperty name="commande" property="modeL" />​​</li>
<li style=" font: normal 10pt verdana, helvetica, sans-serif;"> <strong>Statut Livraison : </strong>  <jsp:getProperty name="commande" property="statutL" />​​</li>
</ul>

</body>
</html>