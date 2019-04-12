package packageProjet;

public class Voyageur {
	
	private int idVoyageur;
	private String nom;
	private String prenom;
	private String dateNaissance;
	private double poidsBagage;
	
	
	
	/**
	 * @param idVoyageur
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param poidsBagage
	 */
	public Voyageur(int idVoyageur, String nom, String prenom, String dateNaissance, double poidsBagage) {
		this.idVoyageur = idVoyageur;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.poidsBagage = poidsBagage;
	}
	
	
	/**
	 * @return the idVoyageur
	 */
	public int getIdVoyageur() {
		return idVoyageur;
	}
	/**
	 * @param idVoyageur the idVoyageur to set
	 */
	public void setIdVoyageur(int idVoyageur) {
		this.idVoyageur = idVoyageur;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the dateNaissance
	 */
	public String getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * @return the poidsBagage
	 */
	public double getPoidsBagage() {
		return poidsBagage;
	}
	/**
	 * @param poidsBagage the poidsBagage to set
	 */
	public void setPoidsBagage(double poidsBagage) {
		this.poidsBagage = poidsBagage;
	}
	
	public void rechercherVol(int date, Aeroport aeroportD, Aeroport aeroportA) {
		
	}



}
