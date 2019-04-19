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
	 * @param capaciteeMax
	 * @param rayondaction
	 */
	public LongCourrier(String matricule, Modele modele, Aeroport localisation, double rayondaction) {
		super(matricule, modele, localisation);
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
