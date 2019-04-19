package packageProjet;

import java.util.HashMap;
import java.util.Map;

public class Equipage {
	
	private int idEquipage;
	private Map<Integer, Aeroport> mapLocalisation;
	
	
	
	
	/**
	 * @param idEquipage
	 * @param mapLocalisation
	 */
	public Equipage(int idEquipage) {
		this.idEquipage = idEquipage;
		this.mapLocalisation = new HashMap<Integer, Aeroport>();
	}
	/**
	 * @return the idEquipage
	 */
	public int getIdEquipage() {
		return idEquipage;
	}
	/**
	 * @param idEquipage the idEquipage to set
	 */
	public void setIdEquipage(int idEquipage) {
		this.idEquipage = idEquipage;
	}
	/**
	 * @return the localisation
	 */
	public Map<Integer, Aeroport> getLocalisation() {
		return mapLocalisation;
	}
	/**
	 * @param localisation the localisation to set
	 */
	public void setLocalisation(Map<Integer, Aeroport> mapLocalisation) {
		this.mapLocalisation = mapLocalisation;
	}
	

}
