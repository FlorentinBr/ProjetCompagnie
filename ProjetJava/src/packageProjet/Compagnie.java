package packageProjet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Compagnie {
	
	
	private Map<Integer, ArrayList<Vol>> mapVol;//Tout les vols programés par la compagnie
	private ArrayList<Aeroport> listAeroport;//tout les aéroports que dessert la compagnie
	private ArrayList<Equipage> listEquipage;//tout les equipages de la compagnie 
	private ArrayList<Avion> listAvion;//touts les avions de la compagnie
	
	/**
	 * Constructeur de la classe Compagnie
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

	//Methodes de modification(set) et de renvoi(get) des attributs de Compagnie
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
	 * ajoute un vol à la liste de ceux que la compagnie propose déjà
	 * @param v
	 */
	public void addVol(Vol v) {
		v.addAvion(this.avionDispo(v.getAeroportD(), v.getAeroportA(), v.getDate()));
		v.addEquipage(v.getAeroportD().getMapEquipage().get(v.getDate()).get(0));
		this.getMapVol().get(v.getDate()).add(v);
		v.getAvion().getListVol().add(v);
		for(int i = v.getDate(); i<30; i++) {
			v.getAeroportD().getMapAvion().get(i).remove(v.getAvion());
			v.getAeroportD().getMapEquipage().get(i).remove(v.getEquipage());
			v.getAeroportA().getMapAvion().get(i).add(v.getAvion());
			v.getAeroportA().getMapEquipage().get(i).add(v.getEquipage());
		}
	}
	
	/**
	 * permet de récupérer un objet aéroport à partir de son nom (une chaine de caractère)
	 * @param aeroport
	 * @return un ojet Aéroport
	 */
	public Aeroport getAeroportByName(String aeroport) {
		for(Aeroport i : this.listAeroport) {
			if(i.getNom().equals(aeroport)) {
				return i;
			}
		}
		return null;
	}
	
	/**
	 * même chose que la méthode précédente mais pour l'interface
	 * @param aeroport
	 * @return
	 */
	public Aeroport stringToAeroport(String aeroport) {
		for(Aeroport i : this.listAeroport) {
			if(i.toString().equals(aeroport)) {
				return i;
			}
		}
		return null;
	}

	/**
	 * permet de disposer d'une liste d'avion capables d'effectuer un voyage pour des aéroports 
	 * d'arrivé et de départ donnés à une date précise.
	 * @param D
	 * @param A
	 * @param date
	 * @return
	 */
	public Avion avionDispo(Aeroport D, Aeroport A, int date) {
		Vol v = new Vol(D, A, date);
		ArrayList<Avion> dispo = new ArrayList<Avion>();
		double dist = v.calculDistance();
		for(Avion a : D.getMapAvion().get(date)) {
			if(a.getRayondaction() >= dist) {
				dispo.add(a);
			}
		}
		if(dispo.isEmpty()) {
			return null;
		}
		else {
			for(Avion a : dispo) {
				if(a.getCapacitee() < dispo.get(0).getCapacitee()) {
					dispo.set(0, a);
				}
			}
		}return dispo.get(0);
		

	}
	
	/**
	 * permet de créer un nouveau voyageur en fonction des informations qu'il donne
	 * @return un noveau voyageur
	 */
	public Voyageur identification() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Votre nom:");
		String nom = scan.next();
		scan.nextLine();
		
		System.out.println("Votre prenom:");
		String prenom = scan.next();
		scan.nextLine();
		
		System.out.println("Votre date de naissance (jj/mm/aaaa):");
		String datedenaissance = scan.next();
		scan.nextLine();
		
		System.out.println("Le poid de vos bagages:");
		double poids = scan.nextDouble();
		scan.nextLine();
		
		
		
		scan.close();
		
		Voyageur voyageur = new Voyageur(nom, prenom,datedenaissance,poids);
		return voyageur;
		
	}
	
}
