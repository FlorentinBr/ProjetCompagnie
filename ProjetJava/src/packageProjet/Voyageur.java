package packageProjet;

import java.util.ArrayList;
import java.util.Scanner;

public class Voyageur {
	
	
	
	private int idVoyageur;
	private String nom;
	private String prenom;
	private String dateNaissance;
	private double poidsBagage;
	private static int CPT_VOY = 0;//vas permettre de fabriquer les identifiants des voyageurs 
	
	
	
	/**
	 * Constructeur de la classe Voyageur
	 * @param idVoyageur
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param poidsBagage
	 */
	public Voyageur(String nom, String prenom, String dateNaissance, double poidsBagage) {
		CPT_VOY++;//a chaque nouveau voyageur le compteur ajoute +1
		this.idVoyageur = CPT_VOY;//ainsi les voyageurs ont chacun un identifiant entier différent
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.poidsBagage = poidsBagage;
	}
	
	
	//Methodes de modification(set) et de renvoi(get) des attributs de Voyageurs
	
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
	
	
	/**
	 * Méthode de calcul du prix de la réservation en fonctionde plusieurs parametres:
	 * -La distance parcourue
	 * -Le coefficient propre à l'avion. Nous l'avons determiné arbitrairement mais il 
	 *     serait calculé en fonction de ce que l'avion coûte à l'achat et en entretient afin de le rentabiliser
	 * -Le prix au kilomètre qui représente la consomation d'essence à amortir de l'avion et qui ne rentre pas en
	 *     compte dans le coefficient, car le prix du carburant n'est pas propre à l'avion. 
	 *-Le remplissage de l'avion. Plus l'avion est rempli plus le prix augmente.
	 *-Le poid des bagages   
	 * @param v
	 * @return
	 */
	public double calculPrix(Vol v) {
		return (v.calculDistance() * 0.1) * v.getAvion().getCoeff() + v.getAvion().getCapacitee() /(v.getAvion().getCapacitee() - v.getListVoyageur().size()) + this.getPoidsBagage();
	}

    /**
     *Méthode to String de la Classe Voyageur
     */
	public String toString() {
		return "Identifiant: "+this.idVoyageur+"\n Nom: "+this.nom+"\n Prenom:"+this.prenom+"\n date de naissance: "+this.dateNaissance+"\n Poids des bagages: "+this.poidsBagage;
	}
	
	/**
	 * Méthode grâce à laquelle le voyageur peut chercher un vol disponible en entrant la date de son choix,
	 * son lieu de départ et sa destination.
	 * @param c la compagnie aériene
	 * @return retourne la liste des vols disponibles dans un intervale de cinq jours (le troisième étant le jours désiré)
	 * retourne, si aucun avion n'est disponible dans cet intervalle de temps, un message. 
	 */
	public ArrayList<Vol> rechercherVol(Compagnie c) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Choix de votre date");
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
			try {
				c.avionDispo(aeroportD, aeroportA, date);
			}catch(NullPointerException e) {
				System.out.println("Pas d'avion disponible pour un vol à cette date");
				return null;
			}

		}
		return list;
		
	}
	
	/**
	 * 
	 * @param c
	 * @param v
	 * @return
	 */
	public Reservation reserver(Compagnie c ,Vol v) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nombre de voyageur ?");
		int nbVoy = scan.nextInt();
		scan.nextLine();
		
		scan.close();
		
		ArrayList<Voyageur> listVoy = new ArrayList<Voyageur>();
		for(int i = 0; i < nbVoy; i++) {
			Voyageur voy = c.identification();
			listVoy.add(voy);
		}
		
		Reservation res = new Reservation(v, listVoy);
		
		System.out.println("La reservation vous coutera :" + res.getPrix() + "€" + "\n Confirmer la commande (oui/non)");
		Scanner scan2 = new Scanner(System.in);
		String rep = scan.next();
		scan2.nextLine();
		scan2.close();
		if(rep.equals("oui")) {
			return res;
		}
		else{
			return null;
		}
	
	}
	
	public void annulerReservation(Compagnie c, Vol v) {
		v.getListVoyageur().remove(this);
		System.out.println("Vous serez remboursé de :" + this.calculPrix(v));
		
	}
	
}
