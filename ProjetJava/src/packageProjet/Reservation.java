package packageProjet;

import java.util.ArrayList;

public class Reservation {

	private int idReservation;
	private Vol vol;
	private ArrayList<Voyageur> listVoyageur;
	private double prix;
	private int dateVoyage;
	private Aeroport aeroportD;
	private Aeroport aeroportA;
	
	
	
	
	/**
	 * Constructeur de la Reservation
	 * @param idReservation
	 * @param vol
	 * @param listVoyageur
	 * @param dateVoyage
	 * @param aeroportD
	 * @param aeroportA
	 */
	public Reservation(Vol vol, ArrayList<Voyageur> listVoyageur) {
		this.idReservation = vol.getListVoyageur().size();
		this.vol = vol;
		this.dateVoyage = vol.getDate();
		this.aeroportD = vol.getAeroportD();
		this.aeroportA = vol.getAeroportA();
		double prix = 0;
		for(Voyageur v : listVoyageur) {
			prix += v.calculPrix(vol);
		}
		this.prix = prix;
		for(Voyageur v : listVoyageur) {
			vol.addVoyageur(v);
		}
	}

	//Methodes de modification(set) et de renvoi(get) des attributs de Voyageurs
	
	/**
	 * @return the idReservation
	 */
	public int getIdReservation() {
		return idReservation;
	}
	/**
	 * @param idReservation the idReservation to set
	 */
	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
	/**
	 * @return the vol
	 */
	public Vol getVol() {
		return vol;
	}
	/**
	 * @param vol the vol to set
	 */
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	/**
	 * @return the listVoyageur
	 */
	public ArrayList<Voyageur> getListVoyageur() {
		return listVoyageur;
	}
	/**
	 * @param listVoyageur the listVoyageur to set
	 */
	public void setListVoyageur(ArrayList<Voyageur> listVoyageur) {
		this.listVoyageur = listVoyageur;
	}
	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}
	/**
	 * @return the dateVoyage
	 */
	public int getDateVoyage() {
		return dateVoyage;
	}
	/**
	 * @param dateVoyage the dateVoyage to set
	 */
	public void setDateVoyage(int dateVoyage) {
		this.dateVoyage = dateVoyage;
	}
	/**
	 * @return the aeroportD
	 */
	public Aeroport getAeroportD() {
		return aeroportD;
	}
	/**
	 * @param aeroportD the aeroportD to set
	 */
	public void setAeroportD(Aeroport aeroportD) {
		this.aeroportD = aeroportD;
	}
	/**
	 * @return the aeroportA
	 */
	public Aeroport getAeroportA() {
		return aeroportA;
	}
	/**
	 * @param aeroportA the aeroportA to set
	 */
	public void setAeroportA(Aeroport aeroportA) {
		this.aeroportA = aeroportA;
	}
	
	
	
	
	
}
