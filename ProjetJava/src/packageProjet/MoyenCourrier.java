package packageProjet;


public abstract class MoyenCourrier extends Avion {
	

	/**
	 * @param matricule
	 * @param modele
	 * @param rayondaction
	 */
	public MoyenCourrier(String matricule, Modele modele,double rayondaction) {
		super(matricule, modele);
		this.setRayondaction(rayondaction);
	}

	
}
