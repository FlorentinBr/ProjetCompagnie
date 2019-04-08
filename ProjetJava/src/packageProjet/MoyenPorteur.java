package packageProjet;

import java.util.List;

public class MoyenPorteur extends MoyenCourrier {
	
	private int capacitee;
	private List<Boolean> listPlaces;
	public Modele modele;
	private double coeff;
	private double prixkm;
	/**
	 * @param matricule
	 * @param modele
	 * @param localisation
	 * @param listPlaces
	 * @param listVol
	 * @param capaciteeMax
	 * @param rayondaction
	 * @param capacitee
	 * @param coeff
	 * @param prixkm
	 */
	public MoyenPorteur(String matricule, Modele modele, Aeroport localisation, List<Boolean> listPlaces,
			List<Vol> listVol, int capaciteeMax, double rayondaction, int capacitee, double coeff, double prixkm) {
		super(matricule, modele, localisation, listPlaces, listVol, capaciteeMax, rayondaction);
		this.capacitee = capacitee;
		this.coeff = coeff;
		this.prixkm = prixkm;
	}
	
	

}
