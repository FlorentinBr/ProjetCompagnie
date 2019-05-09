package packageProjet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Compagnie {
	
	
	private Map<Integer, ArrayList<Vol>> mapVol;
	private ArrayList<Aeroport> listAeroport;
	private ArrayList<Equipage> listEquipage;
	private ArrayList<Avion> listAvion;
	
	/**
	 * capacitee
	 * @param listVol
	 * @param listAeroport
	 * @param listEquipage
	 * @param listAvion
	 */
	public Compagnie() {
		this.mapVol = new HashMap<Integer, ArrayList<Vol>>();
		this.listAeroport = new ArrayList<Aeroport>();
		this.listEquipage = new ArrayList<Equipage>();
		this.listAvion = new ArrayList<Avion>();
	}
	
	

	/**
	 * @return the mapVol
	 */
	public Map<Integer, ArrayList<Vol>> getMapVol() {
		return mapVol;
	}



	/**
	 * @param mapVol the mapVol to set
	 */
	public void setMapVol(Map<Integer, ArrayList<Vol>> mapVol) {
		this.mapVol = mapVol;
	}



	/**
	 * @return the listAeroport
	 */
	public ArrayList<Aeroport> getListAeroport() {
		return listAeroport;
	}
	
	/**
	 * @param listAeroport the listAeroport to set
	 */
	public void setListAeroport(ArrayList<Aeroport> listAeroport) {
		this.listAeroport = listAeroport;
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
	 * @return the listAvion
	 */
	public ArrayList<Avion> getListAvion() {
		return listAvion;
	}
	
	
	/**
	 * @param listAvion the listAvion to set
	 */
	public void setListAvion(ArrayList<Avion> listAvion) {
		this.listAvion = listAvion;
	}
	
	/**
	 * ajoute un vol à la liste de ceuxv.getAeroportA().getMapAvion().get(i).add(v.getAvion());
	 *  que la compagnie propose déjà
	 * @param v
	 */
	public void addVol(Vol v, int date, Avion a, Equipage e) {
		this.getMapVol().get(date).add(v);
		v.getAvion().getListVol().add(v);
		v.addAvion(a);
		v.addEquipage(e);
		for(int i = v.getDate(); i<30; i++) {
			v.getAeroportD().getMapAvion().get(i).remove(v.getAvion());
			v.getAeroportD().getMapEquipage().get(i).remove(v.getEquipage());
			v.getAeroportA().getMapAvion().get(i).add(v.getAvion());
			v.getAeroportA().getMapEquipage().get(i).add(v.getEquipage());
			
		}
	}
	
	
	public Aeroport getAeroportByName(String aeroport) {
		for(Aeroport i : this.listAeroport) {
			if(i.getNom().equals(aeroport)) {
				return i;
			}
		}
		return null;
	}
	


	
//	public void createVol(Aeroport D, Aeroport A, int date) {
//		Vol v = new Vol(D, A, date);
//		double dist = v.calculDistance();
//		if(dist > 2000) {
//			for(Avion a : D.getMapAvion().get(date)) {
//				if(a.getCapacitee() > 399) {
//					v.addAvion(a);
//					this.addVol(v, date);
//					break;
//				}else System.out.println("Il n'y a pas d'avion adéquat disponible");
//				break;
//			}
//		}else if(dist > 1000) {
//			for(Avion a : D.getMapAvion().get(date)) {
//				if(a.getCapacitee() > 149 && a.getCapacitee() < 399) {
//					v.addAvion(a);
//					this.addVol(v, date);
//					break;
//				}else if(a.getCapacitee() > 399) {
//					v.addAvion(a);
//					this.addVol(v, date);
//					break;
//				}else System.out.println("Il n'y a pas d'avion adéquat disponible");
//				break;
//			}
//		}else {
//			for(Avion a : D.getMapAvion().get(date)) {
//				if(a.getCapacitee() < 149) {
//					v.addAvion(a);
//					this.addVol(v, date);
//					break;
//				}else if(a.getCapacitee() > 149 && a.getCapacitee() < 399) {
//					v.addAvion(a);
//					this.addVol(v, date);
//					break;
//				}else if(a.getCapacitee() > 399) {
//					v.addAvion(a);
//					this.addVol(v, date);
//					break;
//				}else System.out.println("Il n'y a pas d'avion adéquat disponible");
//				break;
//			}
//		}
//		
//	}
	
	public ArrayList<Avion> avionDispo(Aeroport D, Aeroport A, int date) {
		Vol v = new Vol(D, A, date);
		ArrayList<Avion> dispo = new ArrayList<Avion>();
		double dist = v.calculDistance();
		for(Avion a : D.getMapAvion().get(date)) {
			if(a.getRayondaction() >= dist) {
				dispo.add(a);
			}
		}return dispo;
	}
	
}
