package packageProjet;


public class TresGrosPorteur extends LongCourrier {
	
	
	/**
	 * constructeur de la classe TresGrosPorteur
	 * @param matricule
	 * @param modele
	 * @param capaciteeMax
	 * @param rayondaction
	 * @param capacitee
	 * @param coeff
	 * @param prixkm
	 */
	public TresGrosPorteur(String matricule, Modele modele, double rayondaction, int capacitee, double coeff, double prixkm) {
		super(matricule, modele, rayondaction);
		this.setCapacitee(capacitee);
		this.setCoeff(coeff);
		this.setPrixkm(prixkm);
	}
	

	
}
