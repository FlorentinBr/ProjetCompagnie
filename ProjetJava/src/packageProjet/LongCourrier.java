package packageProjet;

import java.util.List;

public abstract class LongCourrier extends Avion{
	
	private double rayondaction;
	
	
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
