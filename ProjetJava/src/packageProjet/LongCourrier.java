package packageProjet;



public abstract class LongCourrier extends Avion{
	

	
	
	/**
	 * @param matricule
	 * @param modele
	 * @param localisation
	 * @param listPlaces
	 * @param listVol
	 * @param rayondaction
	 */
	public LongCourrier(String matricule, Modele modele, double rayondaction) {
		super(matricule, modele);
		this.setRayondaction(rayondaction);
	}

	

}
