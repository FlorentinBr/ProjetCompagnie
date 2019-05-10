package packageProjet;



public class MoyenPorteur extends MoyenCourrier {
	
	
	/**
	 * constructeur de la classe MoyenPorteur
	 * @param matricule
	 * @param modele
	 * @param rayondaction
	 * @param capacitee
	 * @param coeff
	 * @param prixkm
	 */
	public MoyenPorteur(String matricule, Modele modele, double rayondaction, int capacitee, double coeff, double prixkm) {
		super(matricule, modele, rayondaction);
		this.setCapacitee(capacitee);
		this.setCoeff(coeff);
		this.setPrixkm(prixkm);
	}
	
	

}
