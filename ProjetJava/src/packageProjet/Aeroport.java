package packageProjet;

import java.util.ArrayList;

public class Aeroport {
	
	
	private String nom;
	private String ville;
	private String pays;
	private int capaciteAccueil;
	private ArrayList<Equipage> listEquipage;
	private double[] coordonnees;
	
	
	/**
	 * @param nom
	 * @param ville
	 * @param pays
	 * @param capaciteAccueil
	 * @param listEquipage
	 * @param coordonnees
	 */
	public Aeroport(String nom, String ville, String pays, int capaciteAccueil, ArrayList<Equipage> listEquipage,
			double[] coordonnees) {
		super();
		this.nom = nom;
		this.ville = ville;
		this.pays = pays;
		this.capaciteAccueil = capaciteAccueil;
		this.listEquipage = listEquipage;
		this.coordonnees = coordonnees;
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
	 * @return the coordonnees
	 */
	public double[] getCoordonnees() {
		return coordonnees;
	}


	/**
	 * @param coordonnees the coordonnees to set
	 */
	public void setCoordonnees(double[] coordonnees) {
		this.coordonnees = coordonnees;
	}


	
	
}
