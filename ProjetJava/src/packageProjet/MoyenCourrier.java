package packageProjet;

import java.util.List;

public abstract class MoyenCourrier extends Avion {
	
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
	public MoyenCourrier(String matricule, Modele modele, Aeroport localisation, List<Boolean> listPlaces,
			List<Vol> listVol, int capaciteeMax, double rayondaction) {
		super(matricule, modele, localisation, listPlaces, listVol);
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
