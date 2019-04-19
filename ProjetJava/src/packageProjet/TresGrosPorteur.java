package packageProjet;


public class TresGrosPorteur extends LongCourrier {
	
	private int capacitee;
	public Modele modele;
	private double coeff;
	private double prixkm;
	
	/**
	 * @param matricule
	 * @param modele
	 * @param localisation
	 * @param capaciteeMax
	 * @param rayondaction
	 * @param capacitee
	 * @param coeff
	 * @param prixkm
	 */
	public TresGrosPorteur(String matricule, Modele modele, Aeroport localisation, double rayondaction, int capacitee, double coeff, double prixkm) {
		super(matricule, modele, localisation, rayondaction);
		this.capacitee = capacitee;
		this.coeff = coeff;
		this.prixkm = prixkm;
	}
	

	
}
