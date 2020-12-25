package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
 private String nom;
 private String prenom;
 private String adresse;
 private String tel;
 private String mail;
public Client() {
	super();
	// TODO Auto-generated constructor stub
}
public Client(String nom, String prenom, String adresse, String tel, String mail) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.tel = tel;
	this.mail = mail;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}

 
 




}
