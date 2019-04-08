package packageProjet;

import java.util.ArrayList;

public class Vol {
	
	private int idVol;
	private Avion avion;
	private Equipage equipage;
	private Aeroport aeroportD;
	private Aeroport aeroportA;
 	private ArrayList<Voyageur> listVoyageur;
 	private String date;
 	
 	
 	
 	
 	
 	
	/**
	 * @return the idVol
	 */
	public int getIdVol() {
		return idVol;
	}
	/**
	 * @param idVol the idVol to set
	 */
	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}
	/**
	 * @return the avion
	 */
	public Avion getAvion() {
		return avion;
	}
	/**
	 * @param avion the avion to set
	 */
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	/**
	 * @return the equipage
	 */
	public Equipage getEquipage() {
		return equipage;
	}
	/**
	 * @param equipage the equipage to set
	 */
	public void setEquipage(Equipage equipage) {
		this.equipage = equipage;
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
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	} 
 	

	public void addVoyageur(Voyageur v) {
		this.listVoyageur.add(v);
	}
	
	public double calculDistance() {
		return Math.sqrt(Math.pow(this.aeroportA.getCoordonneeX() - this.aeroportD.getCoordonneeX(), 2) + Math.pow(this.aeroportA.getCoordonneeY() - this.aeroportD.getCoordonneeY(), 2) );
	}
	
	
 	
 	
 	
 	
}
