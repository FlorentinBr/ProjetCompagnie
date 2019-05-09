package packageProjet;

import java.util.ArrayList;
import java.util.Scanner;

public class Voyageur {
	
	private int idVoyageur;
	private String nom;
	private String prenom;
	private String dateNaissance;
	private double poidsBagage;
	
	
	
	/**
	 * @param idVoyageur
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param poidsBagage
	 */
	public Voyageur(int idVoyageur, String nom, String prenom, String dateNaissance, double poidsBagage) {
		this.idVoyageur = idVoyageur;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.poidsBagage = poidsBagage;
	}
	
	
	/**
	 * @return the idVoyageur
	 */
	public int getIdVoyageur() {
		return idVoyageur;
	}
	/**
	 * @param idVoyageur the idVoyageur to set
	 */
	public void setIdVoyageur(int idVoyageur) {
		this.idVoyageur = idVoyageur;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the dateNaissance
	 */
	public String getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * @return the poidsBagage
	 */
	public double getPoidsBagage() {
		return poidsBagage;
	}
	/**
	 * @param poidsBagage the poidsBagage to set
	 */
	public void setPoidsBagage(double poidsBagage) {
		this.poidsBagage = poidsBagage;
	}
	
	public double calculPrix(Vol v) {
		return (v.calculDistance() * 0.1) * v.getAvion().getCoeff() + v.getAvion().getCapacitee() /(v.getAvion().getCapacitee() - v.getListVoyageur().size()) + this.getPoidsBagage();
	}


	public String toString() {
		return "Identifiant: "+this.idVoyageur+"\n Nom: "+this.nom+"\n Prenom:"+this.prenom+"\n date de naissance: "+this.dateNaissance+"\n Poid des bagages: "+this.poidsBagage;
	}
	
	
	public ArrayList<Vol> rechercherVol(Compagnie c) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Choix dans la date (jj/mm/aaaa)");
		int date =scan.nextInt();
		scan.nextLine();
		
		System.out.println("Aéroport de départ (Ville):");
		String nomAeroportD= scan.next();
		scan.nextLine();
		
		Aeroport aeroportD = c.getAeroportByName(nomAeroportD);
		
		System.out.println("Aéroport d'arrivée (Ville):");
		String nomAeroportA= scan.next();
		scan.nextLine();
		
		Aeroport aeroportA = c.getAeroportByName(nomAeroportA);
		
		scan.close();
		
		ArrayList<Vol> list = new ArrayList<Vol>();
		for(Vol v : c.getMapVol().get(date)) {
			if(date < v.getDate() + 2 || date > v.getDate() -2) {
				list.add(v);
			}
		}
		if(list.isEmpty()) {
			Vol nouveauVol = new Vol(aeroportD, aeroportA, date);
			list.add(nouveauVol);
		}
		return list;
		
	}
	
	

}
