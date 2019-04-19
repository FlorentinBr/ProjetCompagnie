package packageProjet;

import java.util.List;

public class GrosPorteur extends LongCourrier {
	
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
	public GrosPorteur(String matricule, Modele modele, int capacitee, double rayondaction, double coeff, double prixkm) {
		super(matricule, modele, rayondaction);
		this.capacitee = capacitee;
		this.coeff = coeff;
		this.prixkm = prixkm;
	}
	
	
	
	
    
}
