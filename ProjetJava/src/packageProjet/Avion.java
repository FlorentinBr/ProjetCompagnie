package packageProjet;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;


public abstract class Avion {
	
	private String matricule;
	public Modele modele;
	private Map<Integer, Aeroport> mapLocalisation;//localisation de l'avion
	private double rayondaction;//portée maximale de l'avion en kilomètres
	private double prixkm;//prix au kilomètre de l'avion en vol ( prix de la consommation de carburant)
	private List<Vol> listVol;// list des vols 
	private double coeff;//coefficient de rentabilité de l'avion (peut être calculé en fonction de prix d'achat et d'entretient)
	private int capacitee; //nombre maximum de passagers
	
	
	
	
	//constructeur
	public Avion(String matricule, Modele modele) {
		this.matricule = matricule;
		this.modele = modele;
		this.listVol = new ArrayList<Vol>();
		this.mapLocalisation = new HashMap<Integer, Aeroport>();
	}

	//Methodes de modification(set) et de renvoi(get) des attributs de Avion
	public String getMatricule() {
		return matricule;
	}
	public Modele getModele() {
		return modele;
	}
	public Map<Integer, Aeroport> getMapLocalisation() {
		return mapLocalisation;
	}
	public void setMapLocalisation(Map<Integer, Aeroport> mapLocalisation) {
		this.mapLocalisation = mapLocalisation;
	}
	public double getRayondaction() {
		return rayondaction;
	}
	public double getPrixkm() {
		return prixkm;
	}
	public double getCoeff() {
		return coeff;
	}
	public double getCapacitee() {
		return capacitee;
	}
	public List<Vol> getListVol() {
		return listVol;
	}
    public void setListVol(List<Vol> listVol) {
		this.listVol = listVol;
	}
	public void setCapacitee(int c) {
		this.capacitee=c;
	}
	public void setCoeff(double c) {
		this.coeff=c;
	}
	public void setPrixkm(double c) {
		this.prixkm=c;
	}
	public void setRayondaction(double c) {
		this.rayondaction=c;
	}
	
    //methode toString de la classe Avion
	public String toString(){
 		return "\n Appareil "+this.matricule+", de type "+ modele.toString() +", \n Rayon d'action: "+ this.getRayondaction() +"\n prix au km: "+ this.getPrixkm() +"\n Capacité d'acceuil: " + this.getCapacitee();
 	}
	
}
