package packageProjet;

import java.util.ArrayList;

public class Aeroport {
	
	
	private String nom;
	private String ville;
	private String pays;
	private int capaciteAccueil;
	private ArrayList<Equipage> listEquipage;
	private ArrayList<Avion> listAvion;
	private double coordonneeX;
	private double coordonneeY;
	
	/**
	 * @param nom
	 * @param ville
	 * @param pays
	 * @param capaciteAccueil
	 * @param listEquipage
	 * @param coordonnees
	 */
	public Aeroport(String nom, String ville, String pays, int capaciteAccueil, double coordonneeX, double coordonneeY) {
		this.nom = nom;
		this.ville = ville;
		this.pays = pays;
		this.capaciteAccueil = capaciteAccueil;
		this.listEquipage = new ArrayList<Equipage>();
		this.listAvion = new ArrayList<Avion>();
		this.coordonneeX = coordonneeX;
		this.coordonneeY = coordonneeY;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}


	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}


	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}


	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}


	/**
	 * @return the capaciteAccueil
	 */
	public int getCapaciteAccueil() {
		return capaciteAccueil;
	}


	/**
	 * @param capaciteAccueil the capaciteAccueil to set
	 */
	public void setCapaciteAccueil(int capaciteAccueil) {
		this.capaciteAccueil = capaciteAccueil;
	}


	/**
	 * @return the listEquipage
	 */
	public ArrayList<Equipage> getListEquipage() {
		return listEquipage;
	}


	/**
	 * @param listEquipage the listEquipage to set
	 */
	public void setListEquipage(ArrayList<Equipage> listEquipage) {
		this.listEquipage = listEquipage;
	}


	/**
	 * @return the listEquipage
	 */
	public ArrayList<Avion> getListAvion() {
		return listAvion;
	}


	/**
	 * @param listEquipage the listEquipage to set
	 */
	public void setListAvion(ArrayList<Avion> listAvion) {
		this.listAvion = listAvion;
	}

	
	/**
	 * @return the coordonneeX
	 */
	public double getCoordonneeX() {
		return coordonneeX;
	}


	/**
	 * @param coordonnees the coordonneeX to set
	 */
	public void setCoordonneeX(double coordonneeX) {
		this.coordonneeX = coordonneeX;
	}

	/**
	 * @return the coordonneeY
	 */
	public double getCoordonneeY() {
		return coordonneeY;
	}


	/**
	 * @param coordonnees the coordonneeY to set
	 */
	public void setCoordonneeY(double coordonneeY) {
		this.coordonneeY = coordonneeY;
	}
	
	
}
