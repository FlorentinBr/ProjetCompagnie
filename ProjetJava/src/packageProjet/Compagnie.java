package packageProjet;

import java.util.ArrayList;

public class Compagnie {
	
	
	private ArrayList<Vol> listVol;
	private ArrayList<Aeroport> listAeroport;
	private ArrayList<Equipage> listEquipage;
	private ArrayList<Avion> listAvion;
	
	/**
	 * 
	 * @param listVol
	 * @param listAeroport
	 * @param listEquipage
	 * @param listAvion
	 */
	public Compagnie(ArrayList<Vol> listVol, ArrayList<Aeroport> listAeroport, ArrayList<Equipage> listEquipage,
			ArrayList<Avion> listAvion) {
		this.listVol = listVol;
		this.listAeroport = listAeroport;
		this.listEquipage = listEquipage;
		this.listAvion = listAvion;
	}
	
	
	/**
	 * @return the listVol
	 */
	public ArrayList<Vol> getListVol() {
		return listVol;
	}

	/**
	 * @param listVol the listVol to set
	 */
	public void setListVol(ArrayList<Vol> listVol) {
		this.listVol = listVol;
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
	 * ajoute un vol à la liste de ceux
	 *  que la compagnie propose déjà
	 * @param v
	 */
	public void addVol(Vol v) {
		this.listVol.add(v);
	}
	
	/**
	 * 
	 * @param e
	 */
	public void addEquipage(Equipage e) {
		this.listEquipage.add(e);
		//ajoute un nouvel equipage à la liste de
		//ceux qui existent déjà dans la compagnie...
		//Pas utile
	}
	/**
	 * moi je propose:
	 * public void addEquipage(Equipage e){
	 *     for (Vol v : this.listV
	 * @param a
	 */
	
	public void addAeroport(Aeroport a) {
		this.listAeroport.add(a);
		//mm chose que pour la methode precedente
	}
	
	public void addAviob(Avion a) {
		this.listAvion.add(a);
		//mm chose que les deux autres
	}

}
