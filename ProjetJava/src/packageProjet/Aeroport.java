package packageProjet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aeroport {
	
	
	private String nom;
	private String ville;
	private String pays;
	private int capaciteAccueil;//nombre d'avions maximum que l'aéroport peut acceuillir
	private Map<Integer, ArrayList<Equipage>> mapEquipage;//equipage localisés sur l'aéroport
	private Map<Integer, ArrayList<Avion>> mapAvion;//avion localisés sur l'aéroport
	private double coordonneeX;
	private double coordonneeY;
	
	/**
	 * constructeur de la classe Aeroport
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
		this.mapEquipage = new HashMap<Integer, ArrayList<Equipage>>();
		this.mapAvion = new HashMap<Integer, ArrayList<Avion>>();
		this.coordonneeX = coordonneeX;
		this.coordonneeY = coordonneeY;
	}
	
	//Methodes de modification(set) et de renvoi(get) des attributs de la classe Aeroport
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
	public Map<Integer, ArrayList<Equipage>> getMapEquipage() {
		return mapEquipage;
	}
	/**
	 * @param listEquipage the listEquipage to set
	 */
	public void setMapEquipage(Map<Integer, ArrayList<Equipage>> mapEquipage) {
		this.mapEquipage = mapEquipage;
	}
	/**
	 * @return the listEquipage
	 */
	public Map<Integer, ArrayList<Avion>> getMapAvion() {
		return mapAvion;
	}
	/**
	 * @param listEquipage the listEquipage to set
	 */
	public void setMapAvion(Map<Integer, ArrayList<Avion>> mapAvion) {
		this.mapAvion = mapAvion;	
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
	
	//Méthode toString de la classe aéroport
	public String toString(){
		return this.nom+", "+this.ville+", "+this.pays;
	}
		
}
