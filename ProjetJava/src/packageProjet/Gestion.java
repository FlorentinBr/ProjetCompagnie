/**


package packageProjet;


public class Gestion {
	
	private int date;

	
	public Gestion() {
		this.date = 0;
	}

	public void changeDate(Compagnie c) {
		this.date += 1;
		this.miseAJour(c);
	}
	
	
	public void miseAJour(Compagnie c) {
		for(Vol v : c.getListVol()) {
			if(v.getDate() == this.date) {
				v.getAvion().setLocalisation(v.getAeroportA());//met à jour la localisation de l'avion
				v.getEquipage().setLocalisation(v.getAeroportA());//met à jour la localisation de l'equipage
				v.getAeroportA().getListAvion().add(v.getAvion());//met à jour la liste des avions stationnés dans l'aéroport d'arivée en ajoutant l'avion du vol v
				v.getAeroportA().getListEquipage().add(v.getEquipage());//met à jour la liste des equipages stationnés dans l'aéroport d'arivée en ajoutant l'equipage du vol v
				v.getAeroportD().getListAvion().remove(v.getAvion());//met à jour la liste des avions stationnés dans l'aéroport de départ en supprimant l'avion du vol v
				v.getAeroportD().getListEquipage().remove(v.getEquipage());//met à jour la liste des EQUiPAGES stationnés dans l'aéroport de départ en supprimant l'equipage du vol v
				
				
			}
		}
	}
*/




//A SUPPRIMER?
