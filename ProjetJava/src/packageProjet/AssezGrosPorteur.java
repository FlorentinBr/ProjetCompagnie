package packageProjet;


public class AssezGrosPorteur extends MoyenCourrier {
	
	/**
	 * constructeur de la classe AssezGrosPorteur
	 * @param matricule
	 * @param modele
	 * @param rayondaction
	 * @param capacitee
	 * @param coeff
	 * @param prixkm
	 */
	public AssezGrosPorteur(String matricule, Modele modele, double rayondaction, int capacitee, double coeff, double prixkm) {
		super(matricule, modele, rayondaction);
		this.setCapacitee(capacitee);
		this.setCoeff(coeff);
		this.setPrixkm(prixkm);
	}
	
	
}
