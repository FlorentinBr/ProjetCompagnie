package packageProjet;


public class AssezGrosPorteur extends MoyenCourrier {
	
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
	public AssezGrosPorteur(String matricule, Modele modele, Aeroport localisation, int capaciteeMax, double rayondaction, int capacitee, double coeff, double prixkm) {
		super(matricule, modele, localisation, capaciteeMax, rayondaction);
		this.capacitee = capacitee;
		this.coeff = coeff;
		this.prixkm = prixkm;
	}
	
	
}
