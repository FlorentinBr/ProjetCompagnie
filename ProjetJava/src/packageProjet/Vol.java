package packageProjet;

import java.util.ArrayList;
import java.util.List;

public class Vol {
	
	private int idVol;
	private Avion avion;
	private Equipage equipage;
	private Aeroport aeroportD;
	private Aeroport aeroportA;
 	private ArrayList<Voyageur> listVoyageur;
 	private List<Boolean> listPlaces;
 	private int date;
 	private boolean statut;
 	private static int CPT_VOL = 0;
 	
 	
 	
 	public Vol(Aeroport D, Aeroport A, int date) {
 		CPT_VOL ++;
 		this.idVol = CPT_VOL;
 		this.aeroportD = D;
 		this.aeroportA = A;
 		this.listPlaces = new ArrayList<Boolean>();
 		this.date = date;
 		this.listVoyageur = new ArrayList<Voyageur>();
 		this.statut = false;
 	}
 	
 	
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
	 * @return the equipage
	 */
	public Equipage getEquipage() {
		return equipage;
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
	
	public List<Boolean> getListplaces() {
		return this.listPlaces;
	}
	
	public void setListlace(List<Boolean> listPlaces) {
		this.listPlaces = listPlaces;
	}
	
	
	/**
	 * @return the listVoyageur
	 */
	public ArrayList<Voyageur> getListVoyageur() {
		return listVoyageur;
	}

	/**
	 * @return the date
	 */
	public int getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(int date) {
		this.date = date;
	} 
 	
	/**
	 * @param v le voyageur que l'on ajoute a la liste des passagers du vol
	 */
	public void addVoyageur(Voyageur v) {
		this.listVoyageur.add(v);
	}
	
	/**
	 * 
	 * @return
	 */
	public double calculDistance() {
		return Math.sqrt(Math.pow(this.aeroportA.getCoordonneeX() - this.aeroportD.getCoordonneeX(), 2) + Math.pow(this.aeroportA.getCoordonneeY() - this.aeroportD.getCoordonneeY(), 2) );
	}
	
	
	/**
	 * @param avion l'avion que l'on affrète au vol
	 */
	public void addAvion(Avion avion) {
		this.avion = avion;
	}
	
	/**
	 * @param equipage l'équipage que l'on affrète au vol 
	 */
	public void addEquipage(Equipage equipage) {
		this.equipage = equipage;
	}
	
	/**
	 * 
	 */
	public void volEffectue() {
		this.statut = true;
		
	}
 	
	
 	
}
