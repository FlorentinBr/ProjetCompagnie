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
	private List<Boolean> listPlaces;
	private List<Vol> listVol;
	
	
	
	
	
	public Avion(String matricule, Modele modele, Aeroport localisation, List<Boolean> listPlaces, List<Vol> listVol) {
		this.matricule = matricule;
		this.modele = modele;
		this.localisation = localisation;
		this.listPlaces = listPlaces;
		this.listVol = listVol;
	}


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
	
	public List<Boolean> getListplaces() {
		return this.listPlaces;
	}
	
	public void setListlace(List<Boolean> listPlaces) {
		this.listPlaces = listPlaces;
	}
	

}
