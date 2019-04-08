package packageProjet;

import java.util.List;

public abstract class CourtesDistances extends Avion{
	
	private int capaciteeMax;
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
	public CourtesDistances(String matricule, Modele modele, Aeroport localisation, int capaciteeMax, double rayondaction) {
		super(matricule, modele, localisation);
		this.capaciteeMax = capaciteeMax;
		this.rayondaction = rayondaction;
	}
	/**
	 * @return the capaciteeMax
	 */
	public int getCapaciteeMax() {
		return capaciteeMax;
	}
	/**
	 * @param capaciteeMax the capaciteeMax to set
	 */
	public void setCapaciteeMax(int capaciteeMax) {
		this.capaciteeMax = capaciteeMax;
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
