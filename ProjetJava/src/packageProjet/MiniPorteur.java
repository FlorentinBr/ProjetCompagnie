package packageProjet;



public class MiniPorteur extends CourtesDistances{
	
	private int capacitee;
	public Modele modele;
	private double coeff;
	private double prixkm;
	/**
	 * @param matricule
	 * @param modele
	 * @param rayondaction
	 * @param capacitee
	 * @param coeff
	 * @param prixkm
	 */
	public MiniPorteur(String matricule, Modele modele, double rayondaction, int capacitee, double coeff, double prixkm) {
		super(matricule, modele, rayondaction);
		this.capacitee = capacitee;
		this.coeff = coeff;
		this.prixkm = prixkm;
	}
	
	

}
