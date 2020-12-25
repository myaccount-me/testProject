<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="style.css" />
<meta charset="ISO-8859-1">
<c:import url="Menu.jsp"></c:import>
<style>
body, p, legend, label, input {
font: normal 8pt verdana, helvetica, sans-serif;}

fieldset {
padding: 10px;
border: 1px #0568CD solid;
margin: 10px;
}
legend {
font-weight: bold;
color: #0568CD;
}
form label {
float: left;
width: 200px;
margin: 3px 0px 0px 0px;
}
form input {
margin: 3px 3px 0px 0px;
border: 1px #999 solid;
}
form input.sansLabel {
margin-left: 200px;
}

.requis {
color: #c00;
}
.erreur {
color: #900;
}
.succes {
color: #090;
}
.info {
font-style: italic;
color: #E8A22B;
}
</style>
<title>TP1- Groupe4</title>
</head>
<body>
<div>
<p class="info" >${message}</p></br>
<form method="get" action="ClientServlet">
<fieldset>
<legend>Informations client :</legend>
<label for="nomClient">Nom <span class="requis">*</span></label> <input
type="text" id="nom" name="nom" value="${param.nom}" size="20"
maxlength="20" /><span style="font-size:11px;color:red;">${erreurs["nom"]}</span><br /> 
<label for="prenomClient">Prénom</label> <input type="text" id="prenom" name="prenom" value="${param.prenom}"
size="20" maxlength="20" /> <br /> 
<label for="adresseClient">Adressede livraison<span class="requis">*</span></label>
 <input type="text" id="adresse" name="adresse" value="${param.adresse}"size="20" maxlength="20" /><span style="font-size:11px;color:red;">${erreurs['adresse']}</span> <br />
  <label for="telephoneClient">Numéro de telephone <span class="requis">*</span>
</label> <input type="text" id="tel" name="tel" value="${param.tel}" size="20" maxlength="20" /><span style="font-size:11px;color:red;">${erreurs['tel']}</span> <br /> 
<label for="emailClient">Adresse email</label> 
<input type="email" id="mail" name="mail" value="${param.mail}" size="20" maxlength="60" /> <br />
</fieldset>
<!--  
 <fieldset>
<legend>Informations commande :</legend>
<label for="dateCommande">Date <span class="requis">*</span></label>
<input type="text" id="date" name="date" value=""size="20" maxlength="20" disabled /> <br /> 
<label for="montantCommande">Montant <span class="requis">*</span></label>
<input type="text" id="montant" name="montant" value="" size="20" maxlength="20" /> <br /> 
<label for="modePaiementCommande">Mode de paiement <span
class="requis">*</span></label> <input type="text" id="modeP" name="modeP" value="" size="20" maxlength="20" /> <br />
 <label for="statutPaiementCommande">Statut du paiement</label> 
 <input type="text" id="statutP" name="statutP" value="" size="20" maxlength="20" /><br />
  <label for="modeLivraisonCommande">Mode de livraison <span class="requis">*</span>
</label> <input type="text" id="modeL" name="modeL" value="" size="20" maxlength="20" /><br />
 <label for="statutLivraisonCommande">Statut de la livraison</label>
 <input type="text" id="statutL" name="statutL" value="" size="20" maxlength="20" /> <br />
</fieldset> -->
<input type="submit" value="Valider" />
 <input type="reset" value="Remettre à zéro" /> <br />
</form>
</div>


</body>
</html>