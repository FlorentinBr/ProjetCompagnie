package packageProjet;


public abstract class CourtesDistances extends Avion{

	
	
	
	/**
	 * @param matricule
	 * @param modele
	 * @param localisation
	 * @param listPlaces
	 * @param listVol
	 * @param capaciteeMax
	 * @param rayondaction
	 */
	public CourtesDistances(String matricule, Modele modele, double rayondaction) {
		super(matricule, modele);
		this.setRayondaction(rayondaction);
	}

	
	
}
