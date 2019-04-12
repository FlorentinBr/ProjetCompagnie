/**
 * 
 */
package packageProjet;

import java.util.List;
import java.util.ArrayList;

/**
 * @author formation
 *
 */
public abstract class Avion {
	
	private String matricule;
	public Modele modele;
	private Aeroport localisation;
	private double rayondaction;
	private double prixkm;
	private List<Vol> listVol;
	private double coeff;
	private int capacitee;
	
	
	
	
	
	public Avion(String matricule, Modele modele, Aeroport localisation) {
		this.matricule = matricule;
		this.modele = modele;
		this.localisation = localisation;
		this.listVol = new ArrayList<Vol>();
	}


	/**
	 * @param date
	 * @return
	 */
	public boolean enVol(int date) {
		for(Vol v : this.listVol) {
			if(v.getDate() == date) {
				return true;
			}
		}
		return false;	
	}
	
	
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
	
	public Aeroport getLocalisation() {
		return localisation;
	}
	
	public void setLocalisation(Aeroport localisation) {
		this.localisation = localisation;
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
}
