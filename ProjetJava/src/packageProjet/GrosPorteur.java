package packageProjet;


public class GrosPorteur extends LongCourrier {

	/**
	 * constructeur de la classe GrosPorteur
	 * @param matricule
	 * @param modele
	 * @param rayondaction
	 * @param capacitee
	 * @param coeff
	 * @param prixkm
	 */
	public GrosPorteur(String matricule, Modele modele, int capacitee, double rayondaction, double coeff, double prixkm) {
		super(matricule, modele, rayondaction);
		this.setCapacitee(capacitee);
		this.setCoeff(coeff);
		this.setPrixkm(prixkm);
	}
	
	
	
	
    
}
