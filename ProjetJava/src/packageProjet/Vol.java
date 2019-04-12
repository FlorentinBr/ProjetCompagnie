package packageProjet;

import java.util.ArrayList;

public class Vol {
	
	private int idVol;
	private Avion avion;
	private Equipage equipage;
	private Aeroport aeroportD;
	private Aeroport aeroportA;
 	private ArrayList<Voyageur> listVoyageur;
 	private int date;
 	
 	
 	
 	public Vol(Aeroport D, Aeroport A, int date) {
 		this.aeroportD = D;
 		this.aeroportA = A;
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
 	
	public void createVol(Aeroport D, Aeroport A, int date, Compagnie c) {
		Vol v = new Vol(D, A, date);
		double dist = v.calculDistance();
		if(dist > 2000) {
			for(Avion a : D.getListAvion()) {
				if(a.getCapacitee() > 399) {
					this.addAvion(a);
					break;
				}else System.out.println("Il n'y a pas d'avion adéquat disponible");
				break;
			}
		}else if(dist > 1000) {
			for(Avion a : D.getListAvion()) {
				if(a.getCapacitee() > 149 && a.getCapacitee() < 399) {
					this.addAvion(a);
					break;
				}else if(a.getCapacitee() > 149) {
					this.addAvion(a);
					break;
				}else System.out.println("Il n'y a pas d'avion adéquat disponible");
				break;
			}
		}else {
			for(Avion a : D.getListAvion()) {
				if(a.getCapacitee() < 149) {
					this.addAvion(a);
					break;
				}else if(a.getCapacitee() > 149 && a.getCapacitee() < 399) {
					this.addAvion(a);
					break;
				}else if(a.getCapacitee() > 399) {
					this.addAvion(a);
					break;
				}else System.out.println("Il n'y a pas d'avion adéquat disponible");
				break;
			}
		}
		
	}
 	
}
