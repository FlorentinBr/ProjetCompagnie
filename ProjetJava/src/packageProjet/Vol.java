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
 	private ArrayList<Boolean> listPlaces;
 	private int date;
 	private static int CPT_VOL = 0;
 	
 	
 	
 	public Vol(Aeroport D, Aeroport A, int date) {
 		CPT_VOL ++;
 		this.idVol = CPT_VOL;
 		this.aeroportD = D;
 		this.aeroportA = A;
 		this.listPlaces = new ArrayList<Boolean>();
 		this.date = date;
 		this.listVoyageur = new ArrayList<Voyageur>();
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
	
	public void setListplaces(ArrayList<Boolean> listPlaces) {
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
    	double R=6378137;
    	double t=Math.PI/180;
    	
    	double Phi1= this.getAeroportD().getCoordonneeY()*t;
    	double L1= this.getAeroportD().getCoordonneeX();
    	
    	double Phi2= this.getAeroportA().getCoordonneeY()*t;
    	double L2= this.getAeroportA().getCoordonneeX();
    	
    	double dL=(L2-L1)*t;
    	
    	double dist= Math.acos(Math.sin(Phi1)*Math.sin(Phi2) + Math.cos(Phi1)*Math.cos(Phi2)*Math.cos(dL))*R;
    	
    	return dist/1000;
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

 	public String toString(){
 		return "Vol "+this.idVol+", départ le "+Integer.toString(this.date)+" \n depuis " + this.aeroportD.getNom()+", "+this.aeroportD.getVille()+", "+this.aeroportD.getPays()+",\n destination" + this.aeroportA.getNom()+", "+this.aeroportA.getVille()+", "+this.aeroportA.getPays();
 	}
 
 	public double benefice() {
 		double coutTotal = this.calculDistance() * this.getAvion().getPrixkm();
 		double prixBillet = 0;
 		for(Voyageur voy : this.getListVoyageur()) {
 			prixBillet += voy.calculPrix(this);
 		}
 		return prixBillet - coutTotal;
 	}
}
