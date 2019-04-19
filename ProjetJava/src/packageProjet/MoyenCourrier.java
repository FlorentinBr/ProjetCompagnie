package packageProjet;


public abstract class MoyenCourrier extends Avion {
	
	private double rayondaction;
	
	
	
	/**
	 * @param matricule
	 * @param modele
	 * @param rayondaction
	 */
	public MoyenCourrier(String matricule, Modele modele,double rayondaction) {
		super(matricule, modele);
		this.rayondaction = rayondaction;
	}
	
	/**
	 * @return the rayondaction
	 */
	public double getRayondaction() {
		return rayondaction;
	}
	/**
	 * @param rayondaction the rayondaction to set
	 */
	public void setRayondaction(double rayondaction) {
		this.rayondaction = rayondaction;
	}

	
}
