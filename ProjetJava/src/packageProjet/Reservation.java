package packageProjet;

import java.util.ArrayList;

public class Reservation {

	private int idReservation;
	private Vol vol;
	private ArrayList<Voyageur> listVoyageur;
	private ArrayList<Integer> listPlaces;
	private double prix;
	private String dateVoyage;
	private Aeroport aeroportD;
	private Aeroport aeroportA;
	
	
	
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
	 * @return the listPlaces
	 */
	public ArrayList<Integer> getListPlaces() {
		return listPlaces;
	}
	/**
	 * @param listPlaces the listPlaces to set
	 */
	public void setListPlaces(ArrayList<Integer> listPlaces) {
		this.listPlaces = listPlaces;
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
	public String getDateVoyage() {
		return dateVoyage;
	}
	/**
	 * @param dateVoyage the dateVoyage to set
	 */
	public void setDateVoyage(String dateVoyage) {
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
	
	
	public double calculPrix(Vol v, double p) {
		
	}
	
}
