/**
 * 
 */
package packageProjet;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author formation
 *
 */
public abstract class Avion {
	
	private String matricule;
	public Modele modele;
	private Map<Integer, Aeroport> mapLocalisation;
	private double rayondaction;
	private double prixkm;
	private List<Vol> listVol;
	private double coeff;
	private int capacitee;
	
	
	
	
	
	public Avion(String matricule, Modele modele) {
		this.matricule = matricule;
		this.modele = modele;
		this.listVol = new ArrayList<Vol>();
		this.mapLocalisation = new HashMap<Integer, Aeroport>();
	}


	/**
	 * @param date
	 * @return
	
	public boolean enVol(int date) {
		for(Vol v : this.listVol) {
			if(v.getDate() == date) {
				return true;
			}
		}
		return false;	
	}
	
	*/
	
	
	public String getMatricule() {
		return matricule;
	}
	
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	public Modele getModele() {
		return modele;
	}
	
	public void setModele(Modele modele) {
		this.modele = modele;
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
	
	public void setRayondaction(double rayondaction) {
		this.rayondaction = rayondaction;
	}
	
	public double getPrixkm() {
		return prixkm;
	}
	
	public void setPrixkm(double prixkm) {
		this.prixkm = prixkm;
	}
	

	public double getCoeff() {
		return coeff;
	}
	
	public void setCoeff(double coeff) {
		this.coeff = coeff;
	}
	
	public double getCapacitee() {
		return capacitee;
	}
	
	public void setCapacitee(int capacitee) {
		this.capacitee = capacitee;
	}
	
	public String toString(){
 		return "\n Appareil "+this.matricule+", de type "+ modele.toString() +", \n Rayon d'action: "+ this.getRayondaction() +"\n prix au km: "+ this.getPrixkm() +"\n Capacité d'acceuil: " + this.getCapacitee() ;
 	}
}
