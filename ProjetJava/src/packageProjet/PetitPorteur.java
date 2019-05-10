package packageProjet;



public class PetitPorteur extends CourtesDistances {

	/**
	 * constructeur de la classe PetitPorteur
	 * @param matricule
	 * @param modele
	 * @param rayondaction
	 * @param capacitee
	 * @param coeff
	 * @param prixkm
	 */
	public PetitPorteur(String matricule, Modele modele, double rayondaction, int capacitee, double coeff, double prixkm) {
		super(matricule, modele, rayondaction);
		this.setCapacitee(capacitee);
		this.setCoeff(coeff);
		this.setPrixkm(prixkm);
	}
	
	

}
