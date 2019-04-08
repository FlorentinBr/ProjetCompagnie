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
public class Avion {
	
	private String matricule;
	private String modèle;
	private Aeroport localisation;
	private int capacite;
	private double rayondaction;
	private double prixkm;
	private List<Boolean> listPlace;
	private List<Vol> listVol;
	
	
	
	/**
	 * @param date
	 * @return
	 */
	public boolean enVol(String date) {
		//TODOimplementer la methode
		for(Vol v : this.listVol) {
			if(v.getDate().equals(date)) {
				return true;
			}
		}return false;
	}
	
	
	public String getMatricule() {
		return matricule;
	}
	
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	public String getModèle() {
		return modèle;
	}
	
	public void setModèle(String modèle) {
		this.modèle = modèle;
	}
	
	public Aeroport getLocalisation() {
		return localisation;
	}
	
	public void setLocalisation(Aeroport localisation) {
		this.localisation = localisation;
	}
	
	public int getCapacite() {
		return capacite;
	}
	
	public void setCapacite(int capacite) {
		this.capacite = capacite;
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
	
	public List<Boolean> getListplace() {
		return this.listPlace;
	}
	
	public void setListplace(List<Boolean> listplace) {
		this.listPlace = listplace;
	}
}
