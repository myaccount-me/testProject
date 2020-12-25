package models;

import java.io.Serializable;
import java.util.Date;

public class Commande implements Serializable {
	private Client client; 
	private Date  date ;
	 private  double montant;
	 private String modeP;
	 private String statutP;
	 private String modeL;
	 private String statutL;
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(Client client, Date date, double montant, String modeP, String statutP, String modeL,
			String statutL) {
		super();
		this.client = client;
		this.date = date;
		this.montant = montant;
		this.modeP = modeP;
		this.statutP = statutP;
		this.modeL = modeL;
		this.statutL = statutL;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getModeP() {
		return modeP;
	}
	public void setModeP(String modeP) {
		this.modeP = modeP;
	}
	public String getStatutP() {
		return statutP;
	}
	public void setStatutP(String statutP) {
		this.statutP = statutP;
	}
	public String getModeL() {
		return modeL;
	}
	public void setModeL(String modeL) {
		this.modeL = modeL;
	}
	public String getStatutL() {
		return statutL;
	}
	public void setStatutL(String statutL) {
		this.statutL = statutL;
	}
	
}
