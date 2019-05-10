package packageProjet;


/**
 * https://www.jmdoudoux.fr/java/dej/chap-swing.htm
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URL;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.util.ArrayList;

public abstract class Main {
	public static void main(String [] args){
	
	

	Compagnie FonctionnAir = new Compagnie();
	 
	 Aeroport CDG = new Aeroport("Paris","Charles de Gaulle", "France", 10 , 2.542496 , 49.011138 );
	 Aeroport Orly = new Aeroport("Paris","Orly", "France", 9 , 2.365247, 48.726243);
	 Aeroport Rennes = new Aeroport("Rennes","Rennes Bretagne", "France", 5 , -1.734365, 48.069784 );
	 Aeroport Marseille = new Aeroport ("Marseille","Aéroport Marseille Provence", "France", 7, 5.215455, 43.438625  );
	 Aeroport Lyon = new Aeroport ("Lyon","Aéroport Lyon-Saint Exupéry","France",7, 5.088840, 45.722843 );
	 Aeroport Reykjavik = new Aeroport ("Reykjavik", "Aeroport de Reykjavik", "Islande", 7, -21.941025, 64.130871);
	 Aeroport Heathrow = new Aeroport ("Londres","London Heathrow", "Royaume-Uni", 10,  -0.453781, 51.472154);
	 Aeroport City = new Aeroport ("Londres","London City", "Royaume-Uni", 9, 0.049346, 51.504938);
	 Aeroport Ynukovo = new Aeroport ("Moscou", "Ynukovo", "Russie", 10, 37.269231, 55.593667);
	 Aeroport Sheremtyevo = new Aeroport ("Moscou", "Sheremtyevo", "Russie", 9, 37.415413, 55.970676);
	 Aeroport Barajas = new Aeroport("Madrid","Barajas","Espagne",10, -3.566803, 40.475159);
	 Aeroport CuatroVientos = new Aeroport("Madrid","Cuatro Vientos","Espagne", 7, -3.783952, 40.372121);
	 Aeroport Ciampino = new Aeroport("Rome","Ciampino","Italie",7 , 12.592080, 41.800635);
	 Aeroport Fiumicino = new Aeroport("Rome","Fiumicino","Italie", 10, 12.254526, 41.802016);
	 Aeroport Barcelona = new Aeroport("Barcelone","Barcelona","Espagne", 10, 2.083673, 41.299550);
	 Aeroport Gerona = new Aeroport("Barcelone","Gerona Costa Brava","Espagne", 5, 2.764088, 41.905315);
	 Aeroport Borispol = new Aeroport("Kiev","Kiev-Borispol","Ukraine", 9, 30.889141, 50.339394);
	 Aeroport Zhulyany = new Aeroport("Kiev","Zhulyany","Ukraine", 7, 30.448649, 50.406787);
	 Aeroport Okecie = new Aeroport("Varsovie","Okecie","Pologne", 9, 20.967777, 52.165279);
	 Aeroport Bemowo = new Aeroport("Varsovie","Bemowo","Pologne", 6, 20.907784, 52.270640);
	 Aeroport Bromma = new Aeroport("Stockolm","Bromma","Suède", 9, 17.943465, 59.353765);
	 Aeroport Barkarby = new Aeroport("Stockolm","Barkarby","Suède", 6, 17.882575, 59.414531);
	 Aeroport Oslo = new Aeroport("Oslo","Aéroport d'Oslo","Norvège", 9, 11.101272, 60.199300);
	 Aeroport Helsinki = new Aeroport("Helsinki","Aéroport d'Helsinki","Finlande", 10, 24.945275, 60.314848);
	 Aeroport Porto = new Aeroport("Porto","Aéroport de Porto","Portugal", 9, -8.677172, 41.239308);
	 Aeroport Lisbonne = new Aeroport("Lisbonne","Aéroport de Lisbonne","Portugal", 10, -9.136311, 38.771249);
	 Aeroport Munich = new Aeroport("Munich","Aéroport de Munich","Allemagne", 8, 11.779147, 48.351649);
	 Aeroport Dublin = new Aeroport("Dublin","Aéroport de Dublin","Irelande", 9, -6.251227, 53.424564);
	 Aeroport Zagreb = new Aeroport("Zagreb","Aéroport de Zagreb","Croatie", 5, 16.067493, 45.738375);
	 Aeroport Belgrade = new Aeroport("Belgrade","Aéroport de Belgrade","Serbie", 5, 20.297028, 44.817784);
	 Aeroport Sarajevo = new Aeroport("Sarajevo","Aéroport de Sarajevo","Bosnie Herzégovine", 6, 18.335522, 43.824807);
	 Aeroport Tirana = new Aeroport("Tirana","Aéroport de Tirana","Albanie", 6, 19.716826, 41.421094);
	 Aeroport Bucarest = new Aeroport("Bucarest","Aéroport de Bucarest","Roumanie", 8, 26.082697, 44.570658);
	 Aeroport Budapest = new Aeroport("Budapest","Aéroport de Budapest","Hongrie", 7, 19.258378, 47.434386);
	 Aeroport Prague = new Aeroport("Prague","Aéroport de Prague","République Tchèque", 8, 14.255699, 50.107346);
	 Aeroport Bruxelles = new Aeroport("Bruxelles","Aéroport de Bruxelles","Belgique", 9, 4.492472, 50.900507);
	 Aeroport Amsterdam = new Aeroport("Amsterdam","Aéroport d'Amsterdam","Pays-Bas", 8, 4.755325, 52.312843);
	 Aeroport Geneve = new Aeroport ("Genèves","Aéroport de Genèves","Suisse", 5,  6.108387, 46.232950);
	 Aeroport SaintPetersbourg = new Aeroport ("Saint-Pétersbourg","Aéroport de Saint-Pétersbourg","Russie", 4, 30.264431, 59.796921);
	 Aeroport Talin = new Aeroport ("Talin","Aéroport de Talin","Estonie", 3, 24.810671, 59.415169);
	 Aeroport Riga = new Aeroport ("Riga","Aéroport de Riga","Lettonie", 3, 23.975009, 56.922286);
	 Aeroport Vilnius = new Aeroport ("Vilnius","Aéroport de Vilnius","Lituanie", 3, 25.285993, 54.641501);
	 Aeroport Copenhague = new Aeroport ("Copenhague","Aéroport de Copenhague","Danemark", 5, 12.650337, 55.620800);
	 Aeroport Milan = new Aeroport ("Milan","Aéroport de Milan","Italie", 3, 9.276900, 45.448687);
	 Aeroport Athenes = new Aeroport ("Athènes","Aéroport d'Athènes","Grèce", 5, 23.937401, 37.935807);
	 Aeroport Malte = new Aeroport ("Malte","Aéroport de Malte","Malte", 6, 14.477522, 35.857393);
	 Aeroport Edimbourg = new Aeroport ("Edimbourg","Aéroport d'Edimbourg","Ecosse", 3, -3.361033, 55.949084);
	 Aeroport Istanboul = new Aeroport ("Istanboul","Aéroport d'Istanboul","Turquie", 4, 28.814897, 40.981468);
	 Aeroport Poudlard = new Aeroport ("Poudlard","Aéroport de Poudlard","Monde Magique", 2, 0, 0);
	 Aeroport Minsk = new Aeroport ("Minsk","Aéroport de Minsk","Biélorussie", 3, 28.036220, 53.883332);
	 
	 
	 MiniPorteur MiniP01= new MiniPorteur("MIP01",Modele.Rafale, 2000, 2, 3, 1000);
	 MiniPorteur MiniP02= new MiniPorteur("MIP02",Modele.Rafale, 2000, 2, 3, 1000);
	 MiniPorteur MiniP03= new MiniPorteur("MIP03",Modele.Rafale, 2000, 2, 3, 1000);
	 MiniPorteur MiniP04= new MiniPorteur("MIP04",Modele.Rafale, 2000, 2, 3, 1000);
	 MiniPorteur MiniP05= new MiniPorteur("MIP05",Modele.Rafale, 2000, 2, 3, 1000);
	 MiniPorteur MiniP06= new MiniPorteur("MIP06",Modele.Rafale, 2000, 2, 3, 1000);
	 MiniPorteur MiniP07= new MiniPorteur("MIP07",Modele.Rafale, 2000, 2, 3, 1000);
	 MiniPorteur MiniP08= new MiniPorteur("MIP08",Modele.Rafale, 2000, 2, 3, 1000);
	 MiniPorteur MiniP09= new MiniPorteur("MIP09",Modele.Rafale, 2000, 2, 3, 1000);
	 MiniPorteur MiniP10= new MiniPorteur("MIP10",Modele.Rafale, 2000, 2, 3, 1000);
	 MiniPorteur MiniP11= new MiniPorteur("MIP11",Modele.Rafale, 2000, 2, 3, 1000);
	 MiniPorteur MiniP12= new MiniPorteur("MIP12",Modele.PasnimporteQuelBalai, 300, 2, 0, 0);
	 MiniPorteur MiniP13= new MiniPorteur("MIP13",Modele.PasnimporteQuelBalai, 300, 2, 0, 0);
	 MiniPorteur MiniP14= new MiniPorteur("MIP14",Modele.PasnimporteQuelBalai, 300, 2, 0, 0);
	 MiniPorteur MiniP15= new MiniPorteur("MIP15",Modele.PasnimporteQuelBalai, 300, 2, 0, 0);
	 MiniPorteur MiniP16= new MiniPorteur("MIP16",Modele.PasnimporteQuelBalai, 300, 2, 0, 0);
	 MiniPorteur MiniP17= new MiniPorteur("MIP17",Modele.PasnimporteQuelBalai, 300, 2, 0, 0);
	 MiniPorteur MiniP18= new MiniPorteur("MIP18",Modele.PasnimporteQuelBalai, 300, 2, 0, 0);
	 MiniPorteur MiniP19= new MiniPorteur("MIP19",Modele.PasnimporteQuelBalai, 300, 2, 0, 0);
	 MiniPorteur MiniP20= new MiniPorteur("MIP20",Modele.PasnimporteQuelBalai, 300, 2, 0, 0);
	 MiniPorteur MiniP21= new MiniPorteur("MIP21",Modele.PasnimporteQuelBalai, 300, 2, 0, 0);
	 MiniPorteur MiniP22= new MiniPorteur("MIP22",Modele.PasnimporteQuelBalai, 300, 2, 0, 0);
	 MiniPorteur MiniP23= new MiniPorteur("MIP23",Modele.PasnimporteQuelBalai, 300, 2, 0, 0);
	 MiniPorteur MiniP24= new MiniPorteur("MIP24",Modele.Nimbus2000, 400, 2, 0, 0);
	 MiniPorteur MiniP25= new MiniPorteur("MIP25",Modele.Nimbus2000, 400, 2, 0, 0);
	 MiniPorteur MiniP26= new MiniPorteur("MIP26",Modele.Nimbus2000, 400, 2, 0, 0);
	 MiniPorteur MiniP27= new MiniPorteur("MIP27",Modele.Nimbus2000, 400, 2, 0, 0);
	 MiniPorteur MiniP28= new MiniPorteur("MIP28",Modele.Nimbus2000, 400, 2, 0, 0);
	 MiniPorteur MiniP29= new MiniPorteur("MIP29",Modele.Nimbus2000, 400, 2, 0, 0);
	 MiniPorteur MiniP30= new MiniPorteur("MIP30",Modele.Nimbus2000, 400, 2, 0, 0);
	 MiniPorteur MiniP31= new MiniPorteur("MIP31",Modele.Nimbus2000, 400, 2, 0, 0);
	 MiniPorteur MiniP32= new MiniPorteur("MIP32",Modele.Nimbus2000, 400, 2, 0, 0);
	 MiniPorteur MiniP33= new MiniPorteur("MIP33",Modele.Nimbus2000, 400, 2, 0, 0);
	 MiniPorteur MiniP34= new MiniPorteur("MIP34",Modele.Nimbus2000, 400, 2, 0, 0);
	 MiniPorteur MiniP35= new MiniPorteur("MIP35",Modele.Nimbus2000, 400, 2, 0, 0);
	 
	 ToutPetitPorteur TPP01= new ToutPetitPorteur("TPP01",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP02= new ToutPetitPorteur("TPP02",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP03= new ToutPetitPorteur("TPP03",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP04= new ToutPetitPorteur("TPP04",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP05= new ToutPetitPorteur("TPP05",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP06= new ToutPetitPorteur("TPP06",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP07= new ToutPetitPorteur("TPP07",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP08= new ToutPetitPorteur("TPP08",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP09= new ToutPetitPorteur("TPP09",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP10= new ToutPetitPorteur("TPP10",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP11= new ToutPetitPorteur("TPP11",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP12= new ToutPetitPorteur("TPP12",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP13= new ToutPetitPorteur("TPP13",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP14= new ToutPetitPorteur("TPP14",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP15= new ToutPetitPorteur("TPP15",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP16= new ToutPetitPorteur("TPP16",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP17= new ToutPetitPorteur("TPP17",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP18= new ToutPetitPorteur("TPP18",Modele.TapisVolant, 500, 15, 0, 0);
	 ToutPetitPorteur TPP19= new ToutPetitPorteur("TPP19",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP20= new ToutPetitPorteur("TPP20",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP21= new ToutPetitPorteur("TPP21",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP22= new ToutPetitPorteur("TPP22",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP23= new ToutPetitPorteur("TPP23",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP24= new ToutPetitPorteur("TPP24",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP25= new ToutPetitPorteur("TPP25",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP26= new ToutPetitPorteur("TPP26",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP27= new ToutPetitPorteur("TPP27",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP28= new ToutPetitPorteur("TPP28",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP29= new ToutPetitPorteur("TPP29",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP30= new ToutPetitPorteur("TPP30",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP31= new ToutPetitPorteur("TPP31",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP32= new ToutPetitPorteur("TPP32",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP33= new ToutPetitPorteur("TPP33",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP34= new ToutPetitPorteur("TPP34",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP35= new ToutPetitPorteur("TPP35",Modele.Nuage, 600, 15, 0, 0);
	 ToutPetitPorteur TPP36= new ToutPetitPorteur("TPP36",Modele.Nuage, 600, 15, 0, 0);
	 
	 PetitPorteur PP01= new PetitPorteur("PP01",Modele.DScitroenVolantedeFantomas, 700, 80, 0.1, 1.406);
	 PetitPorteur PP02= new PetitPorteur("PP02",Modele.DScitroenVolantedeFantomas, 700, 80, 0.1, 1.406);
	 PetitPorteur PP03= new PetitPorteur("PP03",Modele.DScitroenVolantedeFantomas, 700, 80, 0.1, 1.406);
	 PetitPorteur PP04= new PetitPorteur("PP04",Modele.DScitroenVolantedeFantomas, 700, 80, 0.1, 1.406);
	 PetitPorteur PP05= new PetitPorteur("PP05",Modele.DScitroenVolantedeFantomas, 700, 80, 0.1, 1.406);
	 PetitPorteur PP06= new PetitPorteur("PP06",Modele.DScitroenVolantedeFantomas, 700, 80, 0.1, 1.406);
	 PetitPorteur PP07= new PetitPorteur("PP07",Modele.DScitroenVolantedeFantomas, 700, 80, 0.1, 1.406);
	 PetitPorteur PP08= new PetitPorteur("PP08",Modele.DScitroenVolantedeFantomas, 700, 80, 0.1, 1.406);
	 PetitPorteur PP09= new PetitPorteur("PP09",Modele.DScitroenVolantedeFantomas, 700, 80, 0.1, 1.406);
	 PetitPorteur PP10= new PetitPorteur("PP10",Modele.DScitroenVolantedeFantomas, 700, 80, 0.1, 1.406);
	 PetitPorteur PP11= new PetitPorteur("PP11",Modele.DScitroenVolantedeFantomas, 700, 80, 0.1, 1.406);
	 PetitPorteur PP12= new PetitPorteur("PP12",Modele.Doloreanne, 800, 80, 0.2, 10.45);
	 PetitPorteur PP13= new PetitPorteur("PP13",Modele.Doloreanne, 800, 80, 0.2, 10.45);
	 PetitPorteur PP14= new PetitPorteur("PP14",Modele.Doloreanne, 800, 80, 0.2, 10.45);
	 PetitPorteur PP15= new PetitPorteur("PP15",Modele.Doloreanne, 800, 80, 0.2, 10.45);
	 PetitPorteur PP16= new PetitPorteur("PP16",Modele.Doloreanne, 800, 80, 0.2, 10.45);
	 PetitPorteur PP17= new PetitPorteur("PP17",Modele.Doloreanne, 800, 80, 0.2, 10.45);
	 PetitPorteur PP18= new PetitPorteur("PP18",Modele.Doloreanne, 800, 80, 0.2, 10.45);
	 PetitPorteur PP19= new PetitPorteur("PP19",Modele.Doloreanne, 800, 80, 0.2, 10.45);
	 PetitPorteur PP20= new PetitPorteur("PP20",Modele.Doloreanne, 800, 80, 0.2, 10.45);
	 PetitPorteur PP21= new PetitPorteur("PP21",Modele.Doloreanne, 800, 80, 0.2, 10.45);
	 PetitPorteur PP22= new PetitPorteur("PP22",Modele.Doloreanne, 800, 80, 0.2, 10.45);
	 PetitPorteur PP23= new PetitPorteur("PP23",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 PetitPorteur PP24= new PetitPorteur("PP24",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 PetitPorteur PP25= new PetitPorteur("PP25",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 PetitPorteur PP26= new PetitPorteur("PP26",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 PetitPorteur PP27= new PetitPorteur("PP27",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 PetitPorteur PP28= new PetitPorteur("PP28",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 PetitPorteur PP29= new PetitPorteur("PP29",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 PetitPorteur PP30= new PetitPorteur("PP30",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 PetitPorteur PP31= new PetitPorteur("PP31",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 PetitPorteur PP32= new PetitPorteur("PP32",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 PetitPorteur PP33= new PetitPorteur("PP33",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 PetitPorteur PP34= new PetitPorteur("PP34",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 PetitPorteur PP35= new PetitPorteur("PP35",Modele.VoituredeJamesBond, 900, 80, 0.3, 4.5);
	 
	 MoyenPorteur MOP01= new MoyenPorteur("MOP01", Modele.SuperFrelon, 1000, 150, 0.5, 34.6);
	 MoyenPorteur MOP02= new MoyenPorteur("MOP02", Modele.SuperFrelon, 1000, 150, 0.5, 34.6);
	 MoyenPorteur MOP03= new MoyenPorteur("MOP03", Modele.SuperFrelon, 1000, 150, 0.5, 34.6);
	 MoyenPorteur MOP04= new MoyenPorteur("MOP04", Modele.SuperFrelon, 1000, 150, 0.5, 34.6);
	 MoyenPorteur MOP05= new MoyenPorteur("MOP05", Modele.SuperFrelon, 1000, 150, 0.5, 34.6);
	 MoyenPorteur MOP06= new MoyenPorteur("MOP06", Modele.SuperFrelon, 1000, 150, 0.5, 34.6);
	 MoyenPorteur MOP07= new MoyenPorteur("MOP07", Modele.SuperFrelon, 1000, 150, 0.5, 34.6);
	 MoyenPorteur MOP08= new MoyenPorteur("MOP08", Modele.SuperFrelon, 1000, 150, 0.5, 34.6);
	 MoyenPorteur MOP09= new MoyenPorteur("MOP09", Modele.SuperFrelon, 1000, 150, 0.5, 34.6);
	 MoyenPorteur MOP10= new MoyenPorteur("MOP10", Modele.SuperFrelon, 1000, 150, 0.5, 34.6);
	 MoyenPorteur MOP11= new MoyenPorteur("MOP11", Modele.SuperFrelon, 1000, 150, 0.5, 34.6);
	 MoyenPorteur MOP12= new MoyenPorteur("MOP12", Modele.SuperFrelon, 1000, 150, 0.5, 34.6);
	 MoyenPorteur MOP13= new MoyenPorteur("MOP13", Modele.Transall, 1200, 150, 0.7, 104.6);
	 MoyenPorteur MOP14= new MoyenPorteur("MOP14", Modele.Transall, 1200, 150, 0.7, 104.6);
	 MoyenPorteur MOP15= new MoyenPorteur("MOP15", Modele.Transall, 1200, 150, 0.7, 104.6);
	 MoyenPorteur MOP16= new MoyenPorteur("MOP16", Modele.Transall, 1200, 150, 0.7, 104.6);
	 MoyenPorteur MOP17= new MoyenPorteur("MOP17", Modele.Transall, 1200, 150, 0.7, 104.6);
	 MoyenPorteur MOP18= new MoyenPorteur("MOP18", Modele.Transall, 1200, 150, 0.7, 104.6);
	 MoyenPorteur MOP19= new MoyenPorteur("MOP19", Modele.Transall, 1200, 150, 0.7, 104.6);
	 MoyenPorteur MOP20= new MoyenPorteur("MOP20", Modele.Transall, 1200, 150, 0.7, 104.6);
	 MoyenPorteur MOP21= new MoyenPorteur("MOP21", Modele.Transall, 1200, 150, 0.7, 104.6);
	 MoyenPorteur MOP22= new MoyenPorteur("MOP22", Modele.Transall, 1200, 150, 0.7, 104.6);
	 MoyenPorteur MOP23= new MoyenPorteur("MOP23", Modele.Transall, 1200, 150, 0.7, 104.6);
	 MoyenPorteur MOP24= new MoyenPorteur("MOP24", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 MoyenPorteur MOP25= new MoyenPorteur("MOP25", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 MoyenPorteur MOP26= new MoyenPorteur("MOP26", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 MoyenPorteur MOP27= new MoyenPorteur("MOP27", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 MoyenPorteur MOP28= new MoyenPorteur("MOP28", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 MoyenPorteur MOP29= new MoyenPorteur("MOP29", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 MoyenPorteur MOP30= new MoyenPorteur("MOP30", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 MoyenPorteur MOP31= new MoyenPorteur("MOP31", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 MoyenPorteur MOP32= new MoyenPorteur("MOP32", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 MoyenPorteur MOP33= new MoyenPorteur("MOP33", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 MoyenPorteur MOP34= new MoyenPorteur("MOP34", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 MoyenPorteur MOP35= new MoyenPorteur("MOP35", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 MoyenPorteur MOP36= new MoyenPorteur("MOP36", Modele.BusMagique, 1400, 150, 0.9, 4.9);
	 
	 AssezGrosPorteur AGP01= new AssezGrosPorteur("AGP01",Modele.Fusee, 1600, 250, 1.2, 1205);
	 AssezGrosPorteur AGP02= new AssezGrosPorteur("AGP02",Modele.Fusee, 1600, 250, 1.2, 1205);
	 AssezGrosPorteur AGP03= new AssezGrosPorteur("AGP03",Modele.Fusee, 1600, 250, 1.2, 1205);
	 AssezGrosPorteur AGP04= new AssezGrosPorteur("AGP04",Modele.Fusee, 1600, 250, 1.2, 1205);
	 AssezGrosPorteur AGP05= new AssezGrosPorteur("AGP05",Modele.Fusee, 1600, 250, 1.2, 1205);
	 AssezGrosPorteur AGP06= new AssezGrosPorteur("AGP06",Modele.Fusee, 1600, 250, 1.2, 1205);
	 AssezGrosPorteur AGP07= new AssezGrosPorteur("AGP07",Modele.Fusee, 1600, 250, 1.2, 1205);
	 AssezGrosPorteur AGP08= new AssezGrosPorteur("AGP08",Modele.Fusee, 1600, 250, 1.2, 1205);
	 AssezGrosPorteur AGP09= new AssezGrosPorteur("AGP09",Modele.Fusee, 1600, 250, 1.2, 1205);
	 AssezGrosPorteur AGP10= new AssezGrosPorteur("AGP10",Modele.Fusee, 1600, 250, 1.2, 1205);
	 AssezGrosPorteur AGP11= new AssezGrosPorteur("AGP11",Modele.Fusee, 1600, 250, 1.2, 1205);
	 AssezGrosPorteur AGP12= new AssezGrosPorteur("AGP12",Modele.FauconMillenium, 1800, 250, 1.4, 400);
	 AssezGrosPorteur AGP13= new AssezGrosPorteur("AGP13",Modele.FauconMillenium, 1800, 250, 1.4, 400);
	 AssezGrosPorteur AGP14= new AssezGrosPorteur("AGP14",Modele.FauconMillenium, 1800, 250, 1.4, 400);
	 AssezGrosPorteur AGP15= new AssezGrosPorteur("AGP15",Modele.FauconMillenium, 1800, 250, 1.4, 400);
	 AssezGrosPorteur AGP16= new AssezGrosPorteur("AGP16",Modele.FauconMillenium, 1800, 250, 1.4, 400);
	 AssezGrosPorteur AGP17= new AssezGrosPorteur("AGP17",Modele.FauconMillenium, 1800, 250, 1.4, 400);
	 AssezGrosPorteur AGP18= new AssezGrosPorteur("AGP18",Modele.FauconMillenium, 1800, 250, 1.4, 400);
	 AssezGrosPorteur AGP19= new AssezGrosPorteur("AGP19",Modele.FauconMillenium, 1800, 250, 1.4, 400);
	 AssezGrosPorteur AGP20= new AssezGrosPorteur("AGP20",Modele.FauconMillenium, 1800, 250, 1.4, 400);
	 AssezGrosPorteur AGP21= new AssezGrosPorteur("AGP21",Modele.FauconMillenium, 1800, 250, 1.4, 400);
	 AssezGrosPorteur AGP22= new AssezGrosPorteur("AGP22",Modele.FauconMillenium, 1800, 250, 1.4, 400);
	 AssezGrosPorteur AGP23= new AssezGrosPorteur("AGP23",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP24= new AssezGrosPorteur("AGP24",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP25= new AssezGrosPorteur("AGP25",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP26= new AssezGrosPorteur("AGP26",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP27= new AssezGrosPorteur("AGP27",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP28= new AssezGrosPorteur("AGP28",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP29= new AssezGrosPorteur("AGP29",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP30= new AssezGrosPorteur("AGP30",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP31= new AssezGrosPorteur("AGP31",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP32= new AssezGrosPorteur("AGP32",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP33= new AssezGrosPorteur("AGP33",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP34= new AssezGrosPorteur("AGP34",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP35= new AssezGrosPorteur("AGP35",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 AssezGrosPorteur AGP36= new AssezGrosPorteur("AGP36",Modele.Zepplin, 2000, 250, 1.6, 7.3);
	 
	 GrosPorteur GP01= new GrosPorteur("GP01", Modele.Dragon, 2200, 400, 1.9, 8.7);
	 GrosPorteur GP02= new GrosPorteur("GP02", Modele.Dragon, 2200, 400, 1.9, 8.7);
	 GrosPorteur GP03= new GrosPorteur("GP03", Modele.Dragon, 2200, 400, 1.9, 8.7);
	 GrosPorteur GP04= new GrosPorteur("GP04", Modele.Dragon, 2200, 400, 1.9, 8.7);
	 GrosPorteur GP05= new GrosPorteur("GP05", Modele.Dragon, 2200, 400, 1.9, 8.7);
	 GrosPorteur GP06= new GrosPorteur("GP06", Modele.Dragon, 2200, 400, 1.9, 8.7);
	 GrosPorteur GP07= new GrosPorteur("GP07", Modele.Dragon, 2200, 400, 1.9, 8.7);
	 GrosPorteur GP08= new GrosPorteur("GP08", Modele.Dragon, 2200, 400, 1.9, 8.7);
	 GrosPorteur GP09= new GrosPorteur("GP09", Modele.Dragon, 2200, 400, 1.9, 8.7);
	 GrosPorteur GP10= new GrosPorteur("GP10", Modele.Dragon, 2200, 400, 1.9, 8.7);
	 GrosPorteur GP11= new GrosPorteur("GP11", Modele.Dragon, 2200, 400, 1.9, 8.7);
	 GrosPorteur GP12= new GrosPorteur("GP12", Modele.MouetteGeante, 2400, 400, 2.1, 9.3);
	 GrosPorteur GP13= new GrosPorteur("GP13", Modele.MouetteGeante, 2400, 400, 2.1, 9.3);
	 GrosPorteur GP14= new GrosPorteur("GP14", Modele.MouetteGeante, 2400, 400, 2.1, 9.3);
	 GrosPorteur GP15= new GrosPorteur("GP15", Modele.MouetteGeante, 2400, 400, 2.1, 9.3);
	 GrosPorteur GP16= new GrosPorteur("GP16", Modele.MouetteGeante, 2400, 400, 2.1, 9.3);
	 GrosPorteur GP17= new GrosPorteur("GP17", Modele.MouetteGeante, 2400, 400, 2.1, 9.3);
	 GrosPorteur GP18= new GrosPorteur("GP18", Modele.MouetteGeante, 2400, 400, 2.1, 9.3);
	 GrosPorteur GP19= new GrosPorteur("GP19", Modele.MouetteGeante, 2400, 400, 2.1, 9.3);
	 GrosPorteur GP20= new GrosPorteur("GP20", Modele.MouetteGeante, 2400, 400, 2.1, 9.3);
	 GrosPorteur GP21= new GrosPorteur("GP21", Modele.MouetteGeante, 2400, 400, 2.1, 9.3);
	 GrosPorteur GP22= new GrosPorteur("GP22", Modele.MouetteGeante, 2400, 400, 2.1, 9.3);
	 GrosPorteur GP23= new GrosPorteur("GP23", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP24= new GrosPorteur("GP24", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP25= new GrosPorteur("GP25", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP26= new GrosPorteur("GP26", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP27= new GrosPorteur("GP27", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP28= new GrosPorteur("GP28", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP29= new GrosPorteur("GP29", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP30= new GrosPorteur("GP30", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP31= new GrosPorteur("GP31", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP32= new GrosPorteur("GP32", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP33= new GrosPorteur("GP33", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP34= new GrosPorteur("GP34", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP35= new GrosPorteur("GP35", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 GrosPorteur GP36= new GrosPorteur("GP36", Modele.JetPrive, 2600, 400, 2.5, 10.7);
	 
	 TresGrosPorteur TGP01= new TresGrosPorteur("TGP01",Modele.OiseauDeFer, 3000, 700, 2.7, 22.6);
	 TresGrosPorteur TGP02= new TresGrosPorteur("TGP02",Modele.OiseauDeFer, 3000, 700, 2.7, 22.6);
	 TresGrosPorteur TGP03= new TresGrosPorteur("TGP03",Modele.OiseauDeFer, 3000, 700, 2.7, 22.6);
	 TresGrosPorteur TGP04= new TresGrosPorteur("TGP04",Modele.OiseauDeFer, 3000, 700, 2.7, 22.6);
	 TresGrosPorteur TGP05= new TresGrosPorteur("TGP05",Modele.OiseauDeFer, 3000, 700, 2.7, 22.6);
	 TresGrosPorteur TGP06= new TresGrosPorteur("TGP06",Modele.OiseauDeFer, 3000, 700, 2.7, 22.6);
	 TresGrosPorteur TGP07= new TresGrosPorteur("TGP07",Modele.OiseauDeFer, 3000, 700, 2.7, 22.6);
	 TresGrosPorteur TGP08= new TresGrosPorteur("TGP08",Modele.OiseauDeFer, 3000, 700, 2.7, 22.6);
	 TresGrosPorteur TGP09= new TresGrosPorteur("TGP09",Modele.OiseauDeFer, 3000, 700, 2.7, 22.6);
	 TresGrosPorteur TGP10= new TresGrosPorteur("TGP10",Modele.OiseauDeFer, 3000, 700, 2.7, 22.6);
	 TresGrosPorteur TGP11= new TresGrosPorteur("TGP11",Modele.OiseauDeFer, 3000, 700, 2.7, 22.6);
	 TresGrosPorteur TGP12= new TresGrosPorteur("TGP12",Modele.A380, 3500, 700, 2.9, 30.1);
	 TresGrosPorteur TGP13= new TresGrosPorteur("TGP13",Modele.A380, 3500, 700, 2.9, 30.1);
	 TresGrosPorteur TGP14= new TresGrosPorteur("TGP14",Modele.A380, 3500, 700, 2.9, 30.1);
	 TresGrosPorteur TGP15= new TresGrosPorteur("TGP15",Modele.A380, 3500, 700, 2.9, 30.1);
	 TresGrosPorteur TGP16= new TresGrosPorteur("TGP16",Modele.A380, 3500, 700, 2.9, 30.1);
	 TresGrosPorteur TGP17= new TresGrosPorteur("TGP17",Modele.A380, 3500, 700, 2.9, 30.1);
	 TresGrosPorteur TGP18= new TresGrosPorteur("TGP18",Modele.A380, 3500, 700, 2.9, 30.1);
	 TresGrosPorteur TGP19= new TresGrosPorteur("TGP19",Modele.A380, 3500, 700, 2.9, 30.1);
	 TresGrosPorteur TGP20= new TresGrosPorteur("TGP20",Modele.A380, 3500, 700, 2.9, 30.1);
	 TresGrosPorteur TGP21= new TresGrosPorteur("TGP21",Modele.A380, 3500, 700, 2.9, 30.1);
	 TresGrosPorteur TGP22= new TresGrosPorteur("TGP22",Modele.A380, 3500, 700, 2.9, 30.1);
	 TresGrosPorteur TGP23= new TresGrosPorteur("TGP23",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP24= new TresGrosPorteur("TGP24",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP25= new TresGrosPorteur("TGP25",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP26= new TresGrosPorteur("TGP26",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP27= new TresGrosPorteur("TGP27",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP28= new TresGrosPorteur("TGP28",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP29= new TresGrosPorteur("TGP29",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP30= new TresGrosPorteur("TGP30",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP31= new TresGrosPorteur("TGP31",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP32= new TresGrosPorteur("TGP32",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP33= new TresGrosPorteur("TGP33",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP34= new TresGrosPorteur("TGP34",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP35= new TresGrosPorteur("TGP35",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 TresGrosPorteur TGP36= new TresGrosPorteur("TGP36",Modele.Antonov, 4000, 700, 3.1, 32.6);
	 
	 Equipage E1 = new Equipage(1);
	 Equipage E2 = new Equipage(2);
	 Equipage E3 = new Equipage(3);
	 Equipage E4 = new Equipage(4);
	 Equipage E5 = new Equipage(5);
	 Equipage E6 = new Equipage(6);
	 Equipage E7 = new Equipage(7);
	 Equipage E8 = new Equipage(8);
	 Equipage E9 = new Equipage(9);
	 Equipage E10 = new Equipage(10);
	 Equipage E11 = new Equipage(11);
	 Equipage E12 = new Equipage(12);
	 Equipage E13 = new Equipage(13);
	 Equipage E14 = new Equipage(14);
	 Equipage E15 = new Equipage(15);
	 Equipage E16 = new Equipage(16);
	 Equipage E17 = new Equipage(17);
	 Equipage E18 = new Equipage(18);
	 Equipage E19 = new Equipage(19);
	 Equipage E20 = new Equipage(20);
	 Equipage E21 = new Equipage(21);
	 Equipage E22 = new Equipage(22);
	 Equipage E23 = new Equipage(23);
	 Equipage E24 = new Equipage(24);
	 Equipage E25 = new Equipage(25);
	 Equipage E26 = new Equipage(26);
	 Equipage E27 = new Equipage(27);
	 Equipage E28 = new Equipage(28);
	 Equipage E29 = new Equipage(29);
	 Equipage E30 = new Equipage(30);
	 Equipage E31 = new Equipage(31);
	 Equipage E32 = new Equipage(32);
	 Equipage E33 = new Equipage(33);
	 Equipage E34 = new Equipage(34);
	 Equipage E35 = new Equipage(35);
	 Equipage E36 = new Equipage(36);
	 Equipage E37 = new Equipage(37);
	 Equipage E38 = new Equipage(38);
	 Equipage E39 = new Equipage(39);
	 Equipage E40 = new Equipage(40);
	 Equipage E41 = new Equipage(41);
	 Equipage E42 = new Equipage(42);
	 Equipage E43 = new Equipage(43);
	 Equipage E44 = new Equipage(44);
	 Equipage E45 = new Equipage(45);
	 Equipage E46 = new Equipage(46);
	 Equipage E47 = new Equipage(47);
	 Equipage E48 = new Equipage(48);
	 Equipage E49 = new Equipage(49);
	 Equipage E50 = new Equipage(50);
	 Equipage E51 = new Equipage(51);
	 Equipage E52 = new Equipage(52);
	 Equipage E53 = new Equipage(53);
	 Equipage E54 = new Equipage(54);
	 Equipage E55 = new Equipage(55);
	 Equipage E56 = new Equipage(56);
	 Equipage E57 = new Equipage(57);
	 Equipage E58 = new Equipage(58);
	 Equipage E59 = new Equipage(59);
	 Equipage E60 = new Equipage(60);
	 Equipage E61 = new Equipage(61);
	 Equipage E62 = new Equipage(62);
	 Equipage E63 = new Equipage(63);
	 Equipage E64 = new Equipage(64);
	 Equipage E65 = new Equipage(65);
	 Equipage E66 = new Equipage(66);
	 Equipage E67 = new Equipage(67);
	 Equipage E68 = new Equipage(68);
	 Equipage E69 = new Equipage(69);
	 Equipage E70 = new Equipage(70);
	 Equipage E71 = new Equipage(71);
	 Equipage E72 = new Equipage(72);
	 Equipage E73 = new Equipage(73);
	 Equipage E74 = new Equipage(74);
	 Equipage E75 = new Equipage(75);
	 Equipage E76 = new Equipage(76);
	 Equipage E77 = new Equipage(77);
	 Equipage E78 = new Equipage(78);
	 Equipage E79 = new Equipage(79);
	 Equipage E80 = new Equipage(80);
	 Equipage E81 = new Equipage(81);
	 Equipage E82 = new Equipage(82);
	 Equipage E83 = new Equipage(83);
	 Equipage E84 = new Equipage(84);
	 Equipage E85 = new Equipage(85);
	 Equipage E86 = new Equipage(86);
	 Equipage E87 = new Equipage(87);
	 Equipage E88 = new Equipage(88);
	 Equipage E89 = new Equipage(89);
	 Equipage E90 = new Equipage(90);
	 Equipage E91 = new Equipage(91);
	 Equipage E92 = new Equipage(92);
	 Equipage E93 = new Equipage(93);
	 Equipage E94 = new Equipage(94);
	 Equipage E95 = new Equipage(95);
	 Equipage E96 = new Equipage(96);
	 Equipage E97 = new Equipage(97);
	 Equipage E98 = new Equipage(98);
	 Equipage E99 = new Equipage(99);
	 Equipage E100 = new Equipage(100);
	 Equipage E101 = new Equipage(101);
	 Equipage E102 = new Equipage(102);
	 Equipage E103 = new Equipage(103);
	 Equipage E104 = new Equipage(104);
	 Equipage E105 = new Equipage(105);
	 Equipage E106 = new Equipage(106);
	 Equipage E107 = new Equipage(107);
	 Equipage E108 = new Equipage(108);
	 Equipage E109 = new Equipage(109);
	 Equipage E110 = new Equipage(110);
	 Equipage E111 = new Equipage(111);
	 Equipage E112 = new Equipage(112);
	 Equipage E113 = new Equipage(113);
	 Equipage E114 = new Equipage(114);
	 Equipage E115 = new Equipage(115);
	 Equipage E116 = new Equipage(116);
	 Equipage E117 = new Equipage(117);
	 Equipage E118 = new Equipage(118);
	 Equipage E119 = new Equipage(119);
	 Equipage E120 = new Equipage(120);
	 Equipage E121 = new Equipage(121);
	 Equipage E122 = new Equipage(122);
	 Equipage E123 = new Equipage(123);
	 Equipage E124 = new Equipage(124);
	 Equipage E125 = new Equipage(125);
	 Equipage E126 = new Equipage(126);
	 Equipage E127 = new Equipage(127);
	 Equipage E128 = new Equipage(128);
	 Equipage E129 = new Equipage(129);
	 Equipage E130 = new Equipage(130);
	 Equipage E131 = new Equipage(131);
	 Equipage E132 = new Equipage(132);
	 Equipage E133 = new Equipage(133);
	 Equipage E134 = new Equipage(134);
	 Equipage E135 = new Equipage(135);
	 Equipage E136 = new Equipage(136);
	 Equipage E137 = new Equipage(137);
	 Equipage E138 = new Equipage(138);
	 Equipage E139 = new Equipage(139);
	 Equipage E140 = new Equipage(140);
	 Equipage E141 = new Equipage(141);
	 Equipage E142 = new Equipage(142);
	 Equipage E143 = new Equipage(143);
	 Equipage E144 = new Equipage(144);
	 Equipage E145 = new Equipage(145);
	 Equipage E146 = new Equipage(146);
	 Equipage E147 = new Equipage(147);
	 Equipage E148 = new Equipage(148);
	 Equipage E149 = new Equipage(149);
	 Equipage E150 = new Equipage(150);
	 Equipage E151 = new Equipage(151);
	 Equipage E152 = new Equipage(152);
	 Equipage E153 = new Equipage(153);
	 Equipage E154 = new Equipage(154);
	 Equipage E155 = new Equipage(155);
	 Equipage E156 = new Equipage(156);
	 Equipage E157 = new Equipage(157);
	 Equipage E158 = new Equipage(158);
	 Equipage E159 = new Equipage(159);
	 Equipage E160 = new Equipage(160);
	 Equipage E161 = new Equipage(161);
	 Equipage E162 = new Equipage(162);
	 Equipage E163 = new Equipage(163);
	 Equipage E164 = new Equipage(164);
	 Equipage E165 = new Equipage(165);
	 Equipage E166 = new Equipage(166);
	 Equipage E167 = new Equipage(167);
	 Equipage E168 = new Equipage(168);
	 Equipage E169 = new Equipage(169);
	 Equipage E170 = new Equipage(170);
	 Equipage E171 = new Equipage(171);
	 Equipage E172 = new Equipage(172);
	 Equipage E173 = new Equipage(173);
	 Equipage E174 = new Equipage(174);
	 Equipage E175 = new Equipage(175);
	 Equipage E176 = new Equipage(176);
	 Equipage E177 = new Equipage(177);
	 Equipage E178 = new Equipage(178);
	 Equipage E179 = new Equipage(179);
	 Equipage E180 = new Equipage(180);
	 Equipage E181 = new Equipage(181);
	 Equipage E182 = new Equipage(182);
	 Equipage E183 = new Equipage(183);
	 Equipage E184 = new Equipage(184);
	 Equipage E185 = new Equipage(185);
	 Equipage E186 = new Equipage(186);
	 Equipage E187 = new Equipage(187);
	 Equipage E188 = new Equipage(188);
	 Equipage E189 = new Equipage(189);
	 Equipage E190 = new Equipage(190);
	 Equipage E191 = new Equipage(191);
	 Equipage E192 = new Equipage(192);
	 Equipage E193 = new Equipage(193);
	 Equipage E194 = new Equipage(194);
	 Equipage E195 = new Equipage(195);
	 Equipage E196 = new Equipage(196);
	 Equipage E197 = new Equipage(197);
	 Equipage E198 = new Equipage(198);
	 Equipage E199 = new Equipage(199);
	 Equipage E200 = new Equipage(200);
	 Equipage E201 = new Equipage(201);
	 Equipage E202 = new Equipage(202);
	 Equipage E203 = new Equipage(203);
	 Equipage E204 = new Equipage(204);
	 Equipage E205 = new Equipage(205);
	 Equipage E206 = new Equipage(206);
	 Equipage E207 = new Equipage(207);
	 Equipage E208 = new Equipage(208);
	 Equipage E209 = new Equipage(209);
	 Equipage E210 = new Equipage(210);
	 Equipage E211 = new Equipage(211);
	 Equipage E212 = new Equipage(212);
	 Equipage E213 = new Equipage(213);
	 Equipage E214 = new Equipage(214);
	 Equipage E215 = new Equipage(215);
	 Equipage E216 = new Equipage(216);
	 Equipage E217 = new Equipage(217);
	 Equipage E218 = new Equipage(218);
	 Equipage E219 = new Equipage(219);
	 Equipage E220 = new Equipage(220);
	 Equipage E221 = new Equipage(221);
	 Equipage E222 = new Equipage(222);
	 Equipage E223 = new Equipage(223);
	 Equipage E224 = new Equipage(224);
	 Equipage E225 = new Equipage(225);
	 Equipage E226 = new Equipage(226);
	 Equipage E227 = new Equipage(227);
	 Equipage E228 = new Equipage(228);
	 Equipage E229 = new Equipage(229);
	 Equipage E230 = new Equipage(230);
	 Equipage E231 = new Equipage(231);
	 Equipage E232 = new Equipage(232);
	 Equipage E233 = new Equipage(233);
	 Equipage E234 = new Equipage(234);
	 Equipage E235 = new Equipage(235);
	 Equipage E236 = new Equipage(236);
	 Equipage E237 = new Equipage(237);
	 Equipage E238 = new Equipage(238);
	 Equipage E239 = new Equipage(239);
	 Equipage E240 = new Equipage(240);
	 Equipage E241 = new Equipage(241);
	 Equipage E242 = new Equipage(242);
	 Equipage E243 = new Equipage(243);
	 Equipage E244 = new Equipage(244);
	 Equipage E245 = new Equipage(245);
	 Equipage E246 = new Equipage(246);
	 Equipage E247 = new Equipage(247);
	 Equipage E248 = new Equipage(248);
	 Equipage E249 = new Equipage(249);
	 Equipage E250 = new Equipage(250);
	 Equipage E251 = new Equipage(251);
	 Equipage E252 = new Equipage(252);
	 Equipage E253 = new Equipage(253);
	 Equipage E254 = new Equipage(254);
	 Equipage E255 = new Equipage(255);
	 Equipage E256 = new Equipage(256);
	 Equipage E257 = new Equipage(257);
	 Equipage E258 = new Equipage(258);
	 Equipage E259 = new Equipage(259);
	 Equipage E260 = new Equipage(260);
	 Equipage E261 = new Equipage(261);
	 Equipage E262 = new Equipage(262);
	 Equipage E263 = new Equipage(263);
	 Equipage E264 = new Equipage(264);
	 Equipage E265 = new Equipage(265);
	 Equipage E266 = new Equipage(266);
	 Equipage E267 = new Equipage(267);
	 Equipage E268 = new Equipage(268);
	 Equipage E269 = new Equipage(269);
	 Equipage E270 = new Equipage(270);
	 Equipage E271 = new Equipage(271);
	 Equipage E272 = new Equipage(272);
	 Equipage E273 = new Equipage(273);
	 Equipage E274 = new Equipage(274);
	 Equipage E275 = new Equipage(275);
	 Equipage E276 = new Equipage(276);
	 Equipage E277 = new Equipage(277);
	 Equipage E278 = new Equipage(278);
	 Equipage E279 = new Equipage(279);
	 Equipage E280 = new Equipage(280);
	 Equipage E281 = new Equipage(281);
	 Equipage E282 = new Equipage(282);
	 Equipage E283 = new Equipage(283);
	 Equipage E284 = new Equipage(284);
	 Equipage E285 = new Equipage(285);
	 Equipage E286 = new Equipage(286);
	 Equipage E287 = new Equipage(287);
	 Equipage E288 = new Equipage(288);
	 Equipage E289 = new Equipage(289);
	 Equipage E290 = new Equipage(290);
	 Equipage E291 = new Equipage(291);
	 Equipage E292 = new Equipage(292);
	 Equipage E293 = new Equipage(293);
	 Equipage E294 = new Equipage(294);
	 Equipage E295 = new Equipage(295);
	 Equipage E296 = new Equipage(296);
	 Equipage E297 = new Equipage(297);
	 Equipage E298 = new Equipage(298);
	 Equipage E299 = new Equipage(299);
	 Equipage E300 = new Equipage(300);
	 
	 
	 
	 
    ArrayList<Avion> list1 = new ArrayList<Avion>();
    list1.add(MiniP01);
    list1.add(MiniP02);
    list1.add(TPP01);
    list1.add(PP01); 
    list1.add(MOP01);
    list1.add(AGP02);
    list1.add(GP01);
    list1.add(GP02);
    list1.add(TGP01);
    list1.add(TGP02);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list1.size(); k++) {
    		local.add(list1.get(k));
    	}
    	CDG.getMapAvion().put(i, local);
    }
    
  
    
    ArrayList<Avion> list2 = new ArrayList<Avion>() ;
    list2.add(MiniP03);
    list2.add(MiniP04);
    list2.add(TPP02);
    list2.add(PP02); 
    list2.add(MOP03);
    list2.add(TGP04);
     
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list2.size(); k++) {
    		local.add(list2.get(k));
    	}
    	Orly.getMapAvion().put(i, local);
    }
	 
	ArrayList<Avion> list3 = new ArrayList<Avion>() ;
    list3.add(MiniP05);    
    list3.add(TPP03);  
    list3.add(MOP05);
    list3.add(GP05);
    list3.add(TGP05);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list3.size(); k++) {
    		local.add(list3.get(k));
    	}
    	Rennes.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list4 = new ArrayList<Avion>() ;
    list4.add(MiniP05);    
    list4.add(PP03);  
    list4.add(MOP06);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list4.size(); k++) {
    		local.add(list4.get(k));
    	}
    	Marseille.getMapAvion().put(i, local);
    }
    	
    ArrayList<Avion> list5 = new ArrayList<Avion>() ;
    list5.add(MiniP06);    
    list5.add(TPP04);  
    list5.add(TGP06);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list5.size(); k++) {
    		local.add(list5.get(k));
    	}
    	Lyon.getMapAvion().put(i, local);
    }	
    	
    
    ArrayList<Avion> list6 = new ArrayList<Avion>() ;
    list6.add(TPP05);    
    list6.add(PP06);  
    list6.add(PP07);
   
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list6.size(); k++) {
    		local.add(list6.get(k));
    	}
    	Reykjavik.getMapAvion().put(i, local);
    }	
    	
    
    ArrayList<Avion> list7 = new ArrayList<Avion>() ;
    list7.add(PP08);    
    
    list7.add(TGP07);
    list7.add(TGP08);
    list7.add(TGP09);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list7.size(); k++) {
    		local.add(list7.get(k));
    	}
    	Heathrow.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list8 = new ArrayList<Avion>() ;
    list8.add(PP09);    
    list8.add(MOP09);  
    list8.add(MOP10);
    list8.add(GP09);
    list8.add(TGP10);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list8.size(); k++) {
    		local.add(list8.get(k));
    	}
    	City.getMapAvion().put(i, local);
    }

    ArrayList<Avion> list9 = new ArrayList<Avion>() ;
    list9.add(PP10);
    list9.add(MiniP07);
    list9.add(MOP11);  
    list9.add(MOP12);
    list9.add(GP10);
    list9.add(TGP11);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list9.size(); k++) {
    		local.add(list9.get(k));
    	}
    	Ynukovo.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list10 = new ArrayList<Avion>() ;
    list10.add(PP11);
    list10.add(MiniP08);
    list10.add(GP12);
    list10.add(TGP12);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list10.size(); k++) {
    		local.add(list10.get(k));
    	}
    	Sheremtyevo.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list11 = new ArrayList<Avion>() ;
    list11.add(PP12);
    list11.add(MiniP09);
    list11.add(MOP14);  
    list11.add(GP12);
    list11.add(GP13);
    list11.add(TGP13);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list11.size(); k++) {
    		local.add(list11.get(k));
    	}
    	Barajas.getMapAvion().put(i, local);
    }	
    
    
    ArrayList<Avion> list12 = new ArrayList<Avion>() ;
    list12.add(PP13);
    list12.add(MiniP10);
    list12.add(AGP05);  
    list12.add(AGP06);
    list12.add(AGP07);
    list12.add(AGP08);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list12.size(); k++) {
    		local.add(list12.get(k));
    	}
    	CuatroVientos.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list13 = new ArrayList<Avion>() ;
    list13.add(PP14);
    list13.add(MiniP11);
    list13.add(AGP09);  
    list13.add(GP14);
    list13.add(TGP14);
    list13.add(MOP15);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list13.size(); k++) {
    		local.add(list13.get(k));
    	}
    	Ciampino.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list14 = new ArrayList<Avion>() ;
    list14.add(PP15);
    list14.add(MiniP12);
    list14.add(AGP10);  
    list14.add(GP15);
    list14.add(TGP15);
    list14.add(MOP16);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list14.size(); k++) {
    		local.add(list14.get(k));
    	}
    	Fiumicino.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list15 = new ArrayList<Avion>() ;
    list15.add(PP16);
    list15.add(MiniP13);
    list15.add(AGP11);  
    list15.add(GP16);
    list15.add(TGP16);
    list15.add(MOP17);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list15.size(); k++) {
    		local.add(list15.get(k));
    	}
    	Barcelona.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list16 = new ArrayList<Avion>() ;
    list16.add(PP17);
    list16.add(MiniP14);
    list16.add(AGP12);  
    list16.add(GP17);
    list16.add(TGP17);
    list16.add(MOP18);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list16.size(); k++) {
    		local.add(list16.get(k));
    	}
    	Gerona.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list17 = new ArrayList<Avion>() ;
    list17.add(PP18);
    list17.add(MiniP15);
    list17.add(AGP13);  
    list17.add(GP18);
    list17.add(TGP18);
    list17.add(MOP19);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list17.size(); k++) {
    		local.add(list17.get(k));
    	}
    	Borispol.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list18 = new ArrayList<Avion>() ;
    list18.add(PP19);
    list18.add(MiniP16);
    list18.add(AGP14);  
    list18.add(GP19);
    list18.add(TGP19);
    list18.add(MOP20);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list18.size(); k++) {
    		local.add(list18.get(k));
    	}
    	Zhulyany.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list19 = new ArrayList<Avion>() ;
    list19.add(PP20);
    list19.add(MiniP17);
    list19.add(AGP15);  
    list19.add(GP20);
    list19.add(TGP20);
    list19.add(MOP21);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list19.size(); k++) {
    		local.add(list19.get(k));
    	}
    	Okecie.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list20 = new ArrayList<Avion>() ;
    list20.add(PP21);
    list20.add(MiniP18);
    list20.add(AGP16);  
    list20.add(GP21);
    list20.add(TGP21);
    list20.add(MOP22);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list20.size(); k++) {
    		local.add(list20.get(k));
    	}
    	Bemowo.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list21 = new ArrayList<Avion>() ;
    list21.add(PP22);
    list21.add(MiniP19);
    list21.add(AGP17);  
    list21.add(GP22);
    list21.add(TGP22);
    list21.add(MOP23);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list21.size(); k++) {
    		local.add(list21.get(k));
    	}
    	Bromma.getMapAvion().put(i, local);
    }
    
    
    
    
    ArrayList<Avion> list22 = new ArrayList<Avion>() ;
    list22.add(PP23);
    list22.add(MiniP20);
    list22.add(AGP18);  
    list22.add(GP23);
    list22.add(TGP23);
    list22.add(MOP24);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list22.size(); k++) {
    		local.add(list22.get(k));
    	}
    	Barkarby.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list23 = new ArrayList<Avion>() ;
    list23.add(PP24);
    list23.add(MiniP21);
    list23.add(AGP19);  
    list23.add(GP24);
    list23.add(TGP24);
    list23.add(MOP25);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list23.size(); k++) {
    		local.add(list23.get(k));
    	}
    	Malte.getMapAvion().put(i, local);
    }
    	
    
    ArrayList<Avion> list24 = new ArrayList<Avion>() ;
    list24.add(PP25);
    list24.add(MiniP22);
    list24.add(AGP20);  
    list24.add(GP25);
    list24.add(TGP25);
    list24.add(MOP26);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list24.size(); k++) {
    		local.add(list24.get(k));
    	}
    	Oslo.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list25 = new ArrayList<Avion>() ;
    list25.add(PP26);
    list25.add(MiniP23);
    list25.add(AGP21);  
    list25.add(GP26);
    list25.add(TGP26);
    list25.add(MOP27);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list25.size(); k++) {
    		local.add(list25.get(k));
    	}
    	Helsinki.getMapAvion().put(i, local);
    }
    
    
    
    
    ArrayList<Avion> list26 = new ArrayList<Avion>() ;
    list26.add(PP27);
    list26.add(MiniP24);
    list26.add(AGP22);  
    list26.add(GP27);
    list26.add(TGP27);
    list26.add(MOP28);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list26.size(); k++) {
    		local.add(list26.get(k));
    	}
    	Porto.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list27 = new ArrayList<Avion>() ;
    list27.add(PP28);
    list27.add(MiniP25);
    list27.add(AGP23);  
    list27.add(GP28);
    list27.add(TGP28);
    list27.add(MOP29);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list27.size(); k++) {
    		local.add(list27.get(k));
    	}
    	Lisbonne.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list28 = new ArrayList<Avion>() ;
    list28.add(PP29);
    list28.add(MiniP26);
    list28.add(AGP24);  
    list28.add(GP29);
    list28.add(TGP29);
    list28.add(MOP30);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list28.size(); k++) {
    		local.add(list28.get(k));
    	}
    	Munich.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list29 = new ArrayList<Avion>() ;
    list29.add(PP30);
    list29.add(MiniP27);
    list29.add(AGP25);  
    list29.add(GP30);
    list29.add(TGP30);
    list29.add(MOP31);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list29.size(); k++) {
    		local.add(list29.get(k));
    	}
    	Dublin.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list30 = new ArrayList<Avion>() ;
    list30.add(PP31);
    list30.add(MiniP28);
    list30.add(AGP26);  
    list30.add(GP31);
    list30.add(TGP31);
    list30.add(MOP32);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list30.size(); k++) {
    		local.add(list30.get(k));
    	}
    	Edimbourg.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list31 = new ArrayList<Avion>() ;
    list31.add(PP32);
    list31.add(MiniP29);
    list31.add(AGP27);  
    list31.add(GP32);
    list31.add(TGP32);
    list31.add(MOP33);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list31.size(); k++) {
    		local.add(list31.get(k));
    	}
    	Istanboul.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list32 = new ArrayList<Avion>() ;
    list32.add(PP33);
    list32.add(MiniP30);
    list32.add(AGP28);  
    list32.add(GP33);
    list32.add(TGP33);
    list32.add(MOP34);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list32.size(); k++) {
    		local.add(list32.get(k));
    	}
    	Zagreb.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list33 = new ArrayList<Avion>() ;
    list33.add(PP33);
    list33.add(MiniP30);
    list33.add(AGP28);  
    list33.add(GP33);
    list33.add(TGP33);
    list33.add(MOP34);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list33.size(); k++) {
    		local.add(list33.get(k));
    	}
    	Belgrade.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list34 = new ArrayList<Avion>() ;
    list34.add(PP34);
    list34.add(MiniP31);
    list34.add(AGP29);  
    list34.add(GP34);
    list34.add(TGP34);
    list34.add(MOP35);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list34.size(); k++) {
    		local.add(list34.get(k));
    	}
    	Sarajevo.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list35 = new ArrayList<Avion>() ;
    list35.add(PP35);
    list35.add(MiniP32);
    list35.add(AGP30);  
    list35.add(GP35);
    list35.add(TGP35);
    list35.add(MOP36);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list35.size(); k++) {
    		local.add(list35.get(k));
    	}
    	Tirana.getMapAvion().put(i, local);
    }
    
    
    
   
    ArrayList<Avion> list36 = new ArrayList<Avion>() ;
    list36.add(MiniP33);
    list36.add(AGP31);  
    list36.add(GP36);
    list36.add(TGP36);
    
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list36.size(); k++) {
    		local.add(list36.get(k));
    	}
    	Bucarest.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list37 = new ArrayList<Avion>() ; 
    list37.add(MiniP34);
    list37.add(AGP32);  
   
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list37.size(); k++) {
    		local.add(list37.get(k));
    	}
    	Budapest.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Avion> list38 = new ArrayList<Avion>() ;
    
    list38.add(MiniP35);
    list38.add(AGP33);  
   
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list38.size(); k++) {
    		local.add(list38.get(k));
    	}
    	Prague.getMapAvion().put(i, local);
    }
    
    
   
    
    ArrayList<Avion> list39 = new ArrayList<Avion>() ;
    
    
    list39.add(AGP34);  
   
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list39.size(); k++) {
    		local.add(list39.get(k));
    	}
    	Bruxelles.getMapAvion().put(i, local);
    }
    
    
    
    
    ArrayList<Avion> list40 = new ArrayList<Avion>() ;
 
    list40.add(AGP35);  
   
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list40.size(); k++) {
    		local.add(list40.get(k));
    	}
    	Amsterdam.getMapAvion().put(i, local);
    }
    
    
    
    
    ArrayList<Avion> list41 = new ArrayList<Avion>() ;
    list41.add(AGP36); 
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list41.size(); k++) {
    		local.add(list41.get(k));
    	}
    	Geneve.getMapAvion().put(i, local); 
    }
    
    
    
    ArrayList<Avion> list42 = new ArrayList<Avion>() ;
    list42.add(MOP07);
    list42.add(GP07);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list42.size(); k++) {
    		local.add(list42.get(k));
    	}
    	SaintPetersbourg.getMapAvion().put(i, local);   
    }
    
    
    ArrayList<Avion> list43 = new ArrayList<Avion>() ;
    list43.add(MOP08);  
    list43.add(GP08);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list43.size(); k++) {
    		local.add(list43.get(k));
    	}
    	Talin.getMapAvion().put(i, local);
    }
    
    
    
    
    ArrayList<Avion> list44 = new ArrayList<Avion>() ;
    list44.add(MOP13);  
    list44.add(GP11);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list44.size(); k++) {
    		local.add(list44.get(k));
    	}
    	Riga.getMapAvion().put(i, local);
    }
    
    
    
    
    ArrayList<Avion> list45 = new ArrayList<Avion>() ;
    list45.add(AGP04);
    list45.add(GP03);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list45.size(); k++) {
    		local.add(list45.get(k));
    	}
    	Vilnius.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list46 = new ArrayList<Avion>() ;
    list46.add(MOP02);
    list46.add(AGP01);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list46.size(); k++) {
    		local.add(list46.get(k));
    	}
    	Copenhague.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list47 = new ArrayList<Avion>() ;
    list47.add(AGP03);
    list47.add(GP04);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list47.size(); k++) {
    		local.add(list47.get(k));
    	}
    	Milan.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list48 = new ArrayList<Avion>() ;
    list48.add(MOP04);
    list48.add(TGP03);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list48.size(); k++) {
    		local.add(list48.get(k));
    	}
    	Athenes.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list49 = new ArrayList<Avion>() ;
    list49.add(PP05);
    list49.add(MOP06);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list49.size(); k++) {
    		local.add(list49.get(k));
    	}
    	Poudlard.getMapAvion().put(i, local);
    }
    
    
    
    ArrayList<Avion> list50 = new ArrayList<Avion>() ;
    list50.add(PP04);
    list50.add(GP06);
    
    for(int i = 0; i<30; i++) {
    	ArrayList<Avion> local = new ArrayList<Avion>();
    	for(int k = 0; k < list50.size(); k++) {
    		local.add(list50.get(k));
    	}
    	Minsk.getMapAvion().put(i, local);
    }
    
    
    ArrayList<Equipage> le1 = new ArrayList<Equipage>();
    le1.add(E1);
    le1.add(E2);
    le1.add(E6);
    le1.add(E4);
    le1.add(E5);
    le1.add(E6);
    for(int i = 0; i<30; i++) {
    	CDG.getMapEquipage().put(i, le1);
    }
    
    ArrayList<Equipage> le2 = new ArrayList<Equipage>();
    le2.add(E7);
    le2.add(E8);
    le2.add(E9);
    le2.add(E10);
    le2.add(E11);
    le2.add(E12);
    for(int i = 0; i<30; i++) {
    	Orly.getMapEquipage().put(i, le2);
    }
   
    ArrayList<Equipage> le3 = new ArrayList<Equipage>();
    le3.add(E13);
    le3.add(E14);
    le3.add(E15);
    le3.add(E16);
    le3.add(E17);
    le3.add(E18);
    for(int i = 0; i<30; i++) {
    	Rennes.getMapEquipage().put(i, le3);
    }
    
    ArrayList<Equipage> le4 = new ArrayList<Equipage>();
    le4.add(E19);
    le4.add(E20);
    le4.add(E21);
    le4.add(E22);
    le4.add(E23);
    le4.add(E24);
    for(int i = 0; i<30; i++) {
    	Marseille.getMapEquipage().put(i, le4);
    }
    
    ArrayList<Equipage> le5 = new ArrayList<Equipage>();
    le5.add(E25);
    le5.add(E26);
    le5.add(E27);
    le5.add(E28);
    le5.add(E29);
    le5.add(E30);
    for(int i = 0; i<30; i++) {
    	Lyon.getMapEquipage().put(i, le5);
    }
    
    ArrayList<Equipage> le6 = new ArrayList<Equipage>();
    le6.add(E31);
    le6.add(E32);
    le6.add(E33);
    le6.add(E34);
    le6.add(E35);
    le6.add(E36);
    for(int i = 0; i<30; i++) {
    	Reykjavik.getMapEquipage().put(i, le6);
    }
    
    ArrayList<Equipage> le7 = new ArrayList<Equipage>();
    le7.add(E37);
    le7.add(E38);
    le7.add(E39);
    le7.add(E40);
    le7.add(E41);
    le7.add(E42);
    for(int i = 0; i<30; i++) {
    	Heathrow.getMapEquipage().put(i, le7);
    }
    
    ArrayList<Equipage> le8 = new ArrayList<Equipage>();
    le8.add(E43);
    le8.add(E44);
    le8.add(E45);
    le8.add(E46);
    le8.add(E47);
    le8.add(E48);
    for(int i = 0; i<30; i++) {
    	City.getMapEquipage().put(i, le8);
    }
  
    ArrayList<Equipage> le9 = new ArrayList<Equipage>();
    le9.add(E49);
    le9.add(E50);
    le9.add(E51);
    le9.add(E52);
    le9.add(E53);
    le9.add(E54);
    for(int i = 0; i<30; i++) {
    	Ynukovo.getMapEquipage().put(i, le9);
    }
    
    ArrayList<Equipage> le10 = new ArrayList<Equipage>();
    le10.add(E55);
    le10.add(E56);
    le10.add(E57);
    le10.add(E58);
    le10.add(E59);
    le10.add(E60);
    for(int i = 0; i<30; i++) {
    	Sheremtyevo.getMapEquipage().put(i, le10);
    }
    
    ArrayList<Equipage> le11 = new ArrayList<Equipage>();
    le11.add(E61);
    le11.add(E62);
    le11.add(E63);
    le11.add(E64);
    le11.add(E65);
    le11.add(E66);
    for(int i = 0; i<30; i++) {
    	Barajas.getMapEquipage().put(i, le11);
    }
    
    ArrayList<Equipage> le12 = new ArrayList<Equipage>();
    le12.add(E67);
    le12.add(E68);
    le12.add(E69);
    le12.add(E70);
    le12.add(E71);
    le12.add(E72);
    for(int i = 0; i<30; i++) {
    	CuatroVientos.getMapEquipage().put(i, le12);
    }
    
    ArrayList<Equipage> le13 = new ArrayList<Equipage>();
    le13.add(E73);
    le13.add(E74);
    le13.add(E75);
    le13.add(E76);
    le13.add(E78);
    le13.add(E79);
    for(int i = 0; i<30; i++) {
    	Ciampino.getMapEquipage().put(i, le13);
    }
    
    ArrayList<Equipage> le14 = new ArrayList<Equipage>();
    le14.add(E80);
    le14.add(E81);
    le14.add(E82);
    le14.add(E83);
    le14.add(E84);
    le14.add(E85);
    for(int i = 0; i<30; i++) {
    	Fiumicino.getMapEquipage().put(i, le14);
    }
    
    ArrayList<Equipage> le15 = new ArrayList<Equipage>();
    le15.add(E86);
    le15.add(E87);
    le15.add(E88);
    le15.add(E89);
    le15.add(E90);
    le15.add(E91);
    for(int i = 0; i<30; i++) {
    	Barcelona.getMapEquipage().put(i, le15);
    }
    
    ArrayList<Equipage> le16 = new ArrayList<Equipage>();
    le16.add(E92);
    le16.add(E93);
    le16.add(E94);
    le16.add(E95);
    le16.add(E96);
    le16.add(E97);
    for(int i = 0; i<30; i++) {
    	Gerona.getMapEquipage().put(i, le16);
    }
    
    ArrayList<Equipage> le17 = new ArrayList<Equipage>();
    le17.add(E98);
    le17.add(E99);
    le17.add(E100);
    le17.add(E101);
    le17.add(E102);
    le17.add(E103);
    for(int i = 0; i<30; i++) {
    	Borispol.getMapEquipage().put(i, le17);
    }
    
    ArrayList<Equipage> le18 = new ArrayList<Equipage>();
    le18.add(E104);
    le18.add(E105);
    le18.add(E106);
    le18.add(E107);
    le18.add(E108);
    le18.add(E109);
    for(int i = 0; i<30; i++) {
    	Zhulyany.getMapEquipage().put(i, le18);
    }
    
    ArrayList<Equipage> le19 = new ArrayList<Equipage>();
    le19.add(E110);
    le19.add(E111);
    le19.add(E112);
    le19.add(E113);
    le19.add(E114);
    le19.add(E115);
    for(int i = 0; i<30; i++) {
    	Okecie.getMapEquipage().put(i, le19);
    }
    
    ArrayList<Equipage> le20 = new ArrayList<Equipage>();
    le20.add(E116);
    le20.add(E117);
    le20.add(E118);
    le20.add(E119);
    le20.add(E120);
    le20.add(E121);
    for(int i = 0; i<30; i++) {
    	Bemowo.getMapEquipage().put(i, le20);
    }
    
    ArrayList<Equipage> le21 = new ArrayList<Equipage>();
    le21.add(E122);
    le21.add(E123);
    le21.add(E124);
    le21.add(E125);
    le21.add(E126);
    le21.add(E127);
    for(int i = 0; i<30; i++) {
    	Bromma.getMapEquipage().put(i, le21);
    }
    
    ArrayList<Equipage> le22 = new ArrayList<Equipage>();
    le22.add(E128);
    le22.add(E129);
    le22.add(E130);
    le22.add(E131);
    le22.add(E132);
    le22.add(E133);
    for(int i = 0; i<30; i++) {
    	Barkarby.getMapEquipage().put(i, le22);
    }
    
    ArrayList<Equipage> le23 = new ArrayList<Equipage>();
    le23.add(E134);
    le23.add(E135);
    le23.add(E136);
    le23.add(E137);
    le23.add(E138);
    le23.add(E139);
    for(int i = 0; i<30; i++) {
    	Oslo.getMapEquipage().put(i, le23);
    }
    
    ArrayList<Equipage> le24 = new ArrayList<Equipage>();
    le24.add(E140);
    le24.add(E141);
    le24.add(E142);
    le24.add(E143);
    le24.add(E145);
    le24.add(E146);
    for(int i = 0; i<30; i++) {
    	Helsinki.getMapEquipage().put(i, le24);
    }
    
    ArrayList<Equipage> le25 = new ArrayList<Equipage>();
    le25.add(E147);
    le25.add(E148);
    le25.add(E149);
    le25.add(E150);
    le25.add(E151);
    le25.add(E152);
    for(int i = 0; i<30; i++) {
    	Porto.getMapEquipage().put(i, le25);
    }
    
    ArrayList<Equipage> le26 = new ArrayList<Equipage>();
    le26.add(E153);
    le26.add(E154);
    le26.add(E155);
    le26.add(E156);
    le26.add(E157);
    le26.add(E158);
    for(int i = 0; i<30; i++) {
    	Lisbonne.getMapEquipage().put(i, le26);
    }
    
    ArrayList<Equipage> le27 = new ArrayList<Equipage>();
    le27.add(E159);
    le27.add(E160);
    le27.add(E161);
    le27.add(E162);
    le27.add(E163);
    le27.add(E164);
    for(int i = 0; i<30; i++) {
    	Munich.getMapEquipage().put(i, le27);
    }
    
    ArrayList<Equipage> le28 = new ArrayList<Equipage>();
    le28.add(E165);
    le28.add(E166);
    le28.add(E167);
    le28.add(E168);
    le28.add(E169);
    le28.add(E170);
    for(int i = 0; i<30; i++) {
    	Dublin.getMapEquipage().put(i, le28);
    }
    
    ArrayList<Equipage> le29 = new ArrayList<Equipage>();
    le29.add(E171);
    le29.add(E172);
    le29.add(E173);
    le29.add(E174);
    le29.add(E175);
    le29.add(E176);
    for(int i = 0; i<30; i++) {
    	Zagreb.getMapEquipage().put(i, le29);
    }
    
    ArrayList<Equipage> le30 = new ArrayList<Equipage>();
    le30.add(E177);
    le30.add(E178);
    le30.add(E179);
    le30.add(E180);
    le30.add(E181);
    le30.add(E182);
    for(int i = 0; i<30; i++) {
    	Belgrade.getMapEquipage().put(i, le30);
    }
    
    ArrayList<Equipage> le31 = new ArrayList<Equipage>();
    le31.add(E183);
    le31.add(E184);
    le31.add(E185);
    le31.add(E186);
    le31.add(E187);
    le31.add(E188);
    for(int i = 0; i<30; i++) {
    	Sarajevo.getMapEquipage().put(i, le31);
    }
    
    ArrayList<Equipage> le32 = new ArrayList<Equipage>();
    le32.add(E189);
    le32.add(E190);
    le32.add(E191);
    le32.add(E192);
    le32.add(E193);
    le32.add(E194);
    for(int i = 0; i<30; i++) {
    	Tirana.getMapEquipage().put(i, le32);
    }
    
    ArrayList<Equipage> le33 = new ArrayList<Equipage>();
    le33.add(E195);
    le33.add(E196);
    le33.add(E197);
    le33.add(E198);
    le33.add(E199);
    le33.add(E200);
    for(int i = 0; i<30; i++) {
    	Bucarest.getMapEquipage().put(i, le33);
    }
    
    ArrayList<Equipage> le34 = new ArrayList<Equipage>();
    le34.add(E201);
    le34.add(E202);
    le34.add(E203);
    le34.add(E204);
    le34.add(E205);
    le34.add(E206);
    for(int i = 0; i<30; i++) {
    	Budapest.getMapEquipage().put(i, le34);
    }
    
    ArrayList<Equipage> le35 = new ArrayList<Equipage>();
    le35.add(E207);
    le35.add(E208);
    le35.add(E209);
    le35.add(E210);
    le35.add(E211);
    le35.add(E212);
    for(int i = 0; i<30; i++) {
    	Prague.getMapEquipage().put(i, le35);
    }
    
    ArrayList<Equipage> le36 = new ArrayList<Equipage>();
    le36.add(E213);
    le36.add(E214);
    le36.add(E215);
    le36.add(E216);
    le36.add(E217);
    le36.add(E218);
    for(int i = 0; i<30; i++) {
    	Bruxelles.getMapEquipage().put(i, le36);
    }
    
    ArrayList<Equipage> le37 = new ArrayList<Equipage>();
    le37.add(E219);
    le37.add(E220);
    le37.add(E221);
    le37.add(E222);
    le37.add(E223);
    le37.add(E224);
    for(int i = 0; i<30; i++) {
    	Amsterdam.getMapEquipage().put(i, le37);
    }
    
    ArrayList<Equipage> le38 = new ArrayList<Equipage>();
    le38.add(E225);
    le38.add(E226);
    le38.add(E227);
    le38.add(E228);
    le38.add(E229);
    le38.add(E230);
    for(int i = 0; i<30; i++) {
    	Geneve.getMapEquipage().put(i, le38);
    }
    
    ArrayList<Equipage> le39 = new ArrayList<Equipage>();
    le39.add(E231);
    le39.add(E232);
    le39.add(E234);
    le39.add(E233);
    le39.add(E235);
    le39.add(E236);
    for(int i = 0; i<30; i++) {
    	SaintPetersbourg.getMapEquipage().put(i, le39);
    }
    
    ArrayList<Equipage> le40 = new ArrayList<Equipage>();
    le40.add(E237);
    le40.add(E238);
    le40.add(E239);
    le40.add(E240);
    le40.add(E241);
    le40.add(E242);
    for(int i = 0; i<30; i++) {
    	Talin.getMapEquipage().put(i, le40);
    }
    
    ArrayList<Equipage> le41 = new ArrayList<Equipage>();
    le41.add(E243);
    le41.add(E244);
    le41.add(E245);
    le41.add(E246);
    le41.add(E247);
    le41.add(E248);
    for(int i = 0; i<30; i++) {
    	Riga.getMapEquipage().put(i, le41);
    }
  
    ArrayList<Equipage> le42 = new ArrayList<Equipage>();
    le42.add(E249);
    le42.add(E250);
    le42.add(E251);
    le42.add(E252);
    le42.add(E253);
    le42.add(E254);
    for(int i = 0; i<30; i++) {
    	Vilnius.getMapEquipage().put(i, le42);
    }
    
    ArrayList<Equipage> le43 = new ArrayList<Equipage>();
    le43.add(E255);
    le43.add(E256);
    le43.add(E257);
    le43.add(E258);
    le43.add(E259);
    le43.add(E260);
    for(int i = 0; i<30; i++) {
    	Copenhague.getMapEquipage().put(i, le43);
    }
    
    ArrayList<Equipage> le44 = new ArrayList<Equipage>();
    le44.add(E261);
    le44.add(E262);
    le44.add(E263);
    le44.add(E264);
    le44.add(E265);
    le44.add(E266);
    for(int i = 0; i<30; i++) {
    	Milan.getMapEquipage().put(i, le44);
    }
  
    ArrayList<Equipage> le45 = new ArrayList<Equipage>();
    le45.add(E267);
    le45.add(E268);
    le45.add(E269);
    le45.add(E270);
    le45.add(E271);
    le45.add(E272);
    for(int i = 0; i<30; i++) {
    	Athenes.getMapEquipage().put(i, le45);
    }
    
    ArrayList<Equipage> le46 = new ArrayList<Equipage>();
    le46.add(E273);
    le46.add(E274);
    le46.add(E275);
    le46.add(E276);
    le46.add(E277);
    le46.add(E278);
    for(int i = 0; i<30; i++) {
    	Malte.getMapEquipage().put(i, le46);
    }
   
    ArrayList<Equipage> le47 = new ArrayList<Equipage>();
    le47.add(E279);
    le47.add(E280);
    le47.add(E281);
    le47.add(E282);
    le47.add(E283);
    le47.add(E284);
    for(int i = 0; i<30; i++) {
    	Edimbourg.getMapEquipage().put(i, le47);
    }
   
    ArrayList<Equipage> le48 = new ArrayList<Equipage>();
    le48.add(E285);
    le48.add(E286);
    le48.add(E287);
    le48.add(E288);
    le48.add(E289);
    le48.add(E290);
    for(int i = 0; i<30; i++) {
    	Istanboul.getMapEquipage().put(i, le48);
    }
    
    ArrayList<Equipage> le49 = new ArrayList<Equipage>();
    le49.add(E291);
    le49.add(E292);
    le49.add(E293);
    le49.add(E294);
    le49.add(E295);
    le49.add(E296);
    for(int i = 0; i<30; i++) {
    	Poudlard.getMapEquipage().put(i, le49);
    }
    
    ArrayList<Equipage> le50 = new ArrayList<Equipage>();
    le50.add(E297);
    le50.add(E298);
    le50.add(E299);
    le50.add(E300);
    le50.add(E77);
    le50.add(E144);
    for(int i = 0; i<30; i++) {
    	Minsk.getMapEquipage().put(i, le50);
    }
   

	 for(int i = 0; i<30; i++) {
		 ArrayList<Vol> listdesvols = new ArrayList<Vol>();
		 FonctionnAir.getMapVol().put(i, listdesvols);
	 }
	 
	 
	 FonctionnAir.getListAeroport().add(CDG);
	 FonctionnAir.getListAeroport().add(Orly);
	 FonctionnAir.getListAeroport().add(Rennes);
	 FonctionnAir.getListAeroport().add(Marseille);
	 FonctionnAir.getListAeroport().add(Lyon);
	 FonctionnAir.getListAeroport().add(Reykjavik);
	 FonctionnAir.getListAeroport().add(Heathrow);
	 FonctionnAir.getListAeroport().add(City);
	 FonctionnAir.getListAeroport().add(Ynukovo);
	 FonctionnAir.getListAeroport().add(Sheremtyevo);
	 FonctionnAir.getListAeroport().add(Barajas);
	 FonctionnAir.getListAeroport().add(CuatroVientos);
	 FonctionnAir.getListAeroport().add(Ciampino);
	 FonctionnAir.getListAeroport().add(Fiumicino);
	 FonctionnAir.getListAeroport().add(Barcelona);
	 FonctionnAir.getListAeroport().add(Gerona);
	 FonctionnAir.getListAeroport().add(Borispol);
	 FonctionnAir.getListAeroport().add(Zhulyany);
	 FonctionnAir.getListAeroport().add(Okecie);
	 FonctionnAir.getListAeroport().add(Bemowo);
	 FonctionnAir.getListAeroport().add(Bromma);
	 FonctionnAir.getListAeroport().add(Barkarby);
	 FonctionnAir.getListAeroport().add(Oslo);
	 FonctionnAir.getListAeroport().add(Helsinki);
	 FonctionnAir.getListAeroport().add(Porto);
	 FonctionnAir.getListAeroport().add(Lisbonne);
	 FonctionnAir.getListAeroport().add(Munich);
	 FonctionnAir.getListAeroport().add(Dublin);
	 FonctionnAir.getListAeroport().add(Zagreb);
	 FonctionnAir.getListAeroport().add(Belgrade);
	 FonctionnAir.getListAeroport().add(Sarajevo);
	 FonctionnAir.getListAeroport().add(Tirana);
	 FonctionnAir.getListAeroport().add(Bucarest);
	 FonctionnAir.getListAeroport().add(Budapest);
	 FonctionnAir.getListAeroport().add(Prague);
	 FonctionnAir.getListAeroport().add(Bruxelles);
	 FonctionnAir.getListAeroport().add(Amsterdam);
	 FonctionnAir.getListAeroport().add(Geneve);
	 FonctionnAir.getListAeroport().add(SaintPetersbourg);
	 FonctionnAir.getListAeroport().add(Talin);
	 FonctionnAir.getListAeroport().add(Riga);
	 FonctionnAir.getListAeroport().add(Vilnius);
	 FonctionnAir.getListAeroport().add(Copenhague);
	 FonctionnAir.getListAeroport().add(Milan);
	 FonctionnAir.getListAeroport().add(Athenes);
	 FonctionnAir.getListAeroport().add(Malte);
	 FonctionnAir.getListAeroport().add(Edimbourg);
	 FonctionnAir.getListAeroport().add(Istanboul);
	 FonctionnAir.getListAeroport().add(Poudlard);
	 FonctionnAir.getListAeroport().add(Minsk);
	 
	 FonctionnAir.getListAvion().add(MiniP01);
	 FonctionnAir.getListAvion().add(MiniP02);
	 FonctionnAir.getListAvion().add(MiniP03);
	 FonctionnAir.getListAvion().add(MiniP04);
	 FonctionnAir.getListAvion().add(MiniP05);
	 FonctionnAir.getListAvion().add(MiniP06);
	 FonctionnAir.getListAvion().add(MiniP07);
	 FonctionnAir.getListAvion().add(MiniP08);
	 FonctionnAir.getListAvion().add(MiniP09);
	 FonctionnAir.getListAvion().add(MiniP10);
	 FonctionnAir.getListAvion().add(MiniP11);
	 FonctionnAir.getListAvion().add(MiniP12);
	 FonctionnAir.getListAvion().add(MiniP13);
	 FonctionnAir.getListAvion().add(MiniP14);
	 FonctionnAir.getListAvion().add(MiniP15);
	 FonctionnAir.getListAvion().add(MiniP16);
	 FonctionnAir.getListAvion().add(MiniP17);
	 FonctionnAir.getListAvion().add(MiniP18);
	 FonctionnAir.getListAvion().add(MiniP19);
	 FonctionnAir.getListAvion().add(MiniP20);
	 FonctionnAir.getListAvion().add(MiniP21);
	 FonctionnAir.getListAvion().add(MiniP22);
	 FonctionnAir.getListAvion().add(MiniP23);
	 FonctionnAir.getListAvion().add(MiniP24);
	 FonctionnAir.getListAvion().add(MiniP25);
	 FonctionnAir.getListAvion().add(MiniP26);
	 FonctionnAir.getListAvion().add(MiniP27);
	 FonctionnAir.getListAvion().add(MiniP28);
	 FonctionnAir.getListAvion().add(MiniP29);
	 FonctionnAir.getListAvion().add(MiniP30);
	 FonctionnAir.getListAvion().add(MiniP31);
	 FonctionnAir.getListAvion().add(MiniP32);
	 FonctionnAir.getListAvion().add(MiniP33);
	 FonctionnAir.getListAvion().add(MiniP34);
	 FonctionnAir.getListAvion().add(MiniP35);
	 FonctionnAir.getListAvion().add(TPP01);
	 FonctionnAir.getListAvion().add(TPP02);
	 FonctionnAir.getListAvion().add(TPP03);
	 FonctionnAir.getListAvion().add(TPP04);
	 FonctionnAir.getListAvion().add(TPP05);
	 FonctionnAir.getListAvion().add(TPP06);
	 FonctionnAir.getListAvion().add(TPP07);
	 FonctionnAir.getListAvion().add(TPP08);
	 FonctionnAir.getListAvion().add(TPP09);
	 FonctionnAir.getListAvion().add(TPP10);
	 FonctionnAir.getListAvion().add(TPP11);
	 FonctionnAir.getListAvion().add(TPP12);
	 FonctionnAir.getListAvion().add(TPP13);
	 FonctionnAir.getListAvion().add(TPP14);
	 FonctionnAir.getListAvion().add(TPP15);
	 FonctionnAir.getListAvion().add(TPP16);
	 FonctionnAir.getListAvion().add(TPP17);
	 FonctionnAir.getListAvion().add(TPP18);
	 FonctionnAir.getListAvion().add(TPP19);
	 FonctionnAir.getListAvion().add(TPP20);
	 FonctionnAir.getListAvion().add(TPP21);
	 FonctionnAir.getListAvion().add(TPP22);
	 FonctionnAir.getListAvion().add(TPP23);
	 FonctionnAir.getListAvion().add(TPP24);
	 FonctionnAir.getListAvion().add(TPP25);
	 FonctionnAir.getListAvion().add(TPP26);
	 FonctionnAir.getListAvion().add(TPP27);
	 FonctionnAir.getListAvion().add(TPP28);
	 FonctionnAir.getListAvion().add(TPP29);
	 FonctionnAir.getListAvion().add(TPP30);
	 FonctionnAir.getListAvion().add(TPP31);
	 FonctionnAir.getListAvion().add(TPP32);
	 FonctionnAir.getListAvion().add(TPP33);
	 FonctionnAir.getListAvion().add(TPP34);
	 FonctionnAir.getListAvion().add(TPP35);
	 FonctionnAir.getListAvion().add(TPP36);
	 FonctionnAir.getListAvion().add(PP01);
	 FonctionnAir.getListAvion().add(PP02);
	 FonctionnAir.getListAvion().add(PP03);
	 FonctionnAir.getListAvion().add(PP04);
	 FonctionnAir.getListAvion().add(PP05);
	 FonctionnAir.getListAvion().add(PP06);
	 FonctionnAir.getListAvion().add(PP07);
	 FonctionnAir.getListAvion().add(PP08);
	 FonctionnAir.getListAvion().add(PP09);
	 FonctionnAir.getListAvion().add(PP10);
	 FonctionnAir.getListAvion().add(PP11);
	 FonctionnAir.getListAvion().add(PP12);
	 FonctionnAir.getListAvion().add(PP13);
	 FonctionnAir.getListAvion().add(PP14);
	 FonctionnAir.getListAvion().add(PP15);
	 FonctionnAir.getListAvion().add(PP16);
	 FonctionnAir.getListAvion().add(PP17);
	 FonctionnAir.getListAvion().add(PP18);
	 FonctionnAir.getListAvion().add(PP19);
	 FonctionnAir.getListAvion().add(PP20);
	 FonctionnAir.getListAvion().add(PP21);
	 FonctionnAir.getListAvion().add(PP22);
	 FonctionnAir.getListAvion().add(PP23);
	 FonctionnAir.getListAvion().add(PP24);
	 FonctionnAir.getListAvion().add(PP25);
	 FonctionnAir.getListAvion().add(PP26);
	 FonctionnAir.getListAvion().add(PP27);
	 FonctionnAir.getListAvion().add(PP28);
	 FonctionnAir.getListAvion().add(PP29);
	 FonctionnAir.getListAvion().add(PP30);
	 FonctionnAir.getListAvion().add(PP31);
	 FonctionnAir.getListAvion().add(PP32);
	 FonctionnAir.getListAvion().add(PP33);
	 FonctionnAir.getListAvion().add(PP34);
	 FonctionnAir.getListAvion().add(PP35);
	 FonctionnAir.getListAvion().add(MOP01);
	 FonctionnAir.getListAvion().add(MOP02);
	 FonctionnAir.getListAvion().add(MOP03);
	 FonctionnAir.getListAvion().add(MOP04);
	 FonctionnAir.getListAvion().add(MOP05);
	 FonctionnAir.getListAvion().add(MOP06);
	 FonctionnAir.getListAvion().add(MOP07);
	 FonctionnAir.getListAvion().add(MOP08);
	 FonctionnAir.getListAvion().add(MOP09);
	 FonctionnAir.getListAvion().add(MOP10);
	 FonctionnAir.getListAvion().add(MOP11);
	 FonctionnAir.getListAvion().add(MOP12);
	 FonctionnAir.getListAvion().add(MOP13);
	 FonctionnAir.getListAvion().add(MOP14);
	 FonctionnAir.getListAvion().add(MOP15);
	 FonctionnAir.getListAvion().add(MOP16);
	 FonctionnAir.getListAvion().add(MOP17);
	 FonctionnAir.getListAvion().add(MOP18);
	 FonctionnAir.getListAvion().add(MOP19);
	 FonctionnAir.getListAvion().add(MOP20);
	 FonctionnAir.getListAvion().add(MOP21);
	 FonctionnAir.getListAvion().add(MOP22);
	 FonctionnAir.getListAvion().add(MOP23);
	 FonctionnAir.getListAvion().add(MOP24);
	 FonctionnAir.getListAvion().add(MOP25);
	 FonctionnAir.getListAvion().add(MOP26);
	 FonctionnAir.getListAvion().add(MOP27);
	 FonctionnAir.getListAvion().add(MOP28);
	 FonctionnAir.getListAvion().add(MOP29);
	 FonctionnAir.getListAvion().add(MOP30);
	 FonctionnAir.getListAvion().add(MOP31);
	 FonctionnAir.getListAvion().add(MOP32);
	 FonctionnAir.getListAvion().add(MOP33);
	 FonctionnAir.getListAvion().add(MOP34);
	 FonctionnAir.getListAvion().add(MOP35);
	 FonctionnAir.getListAvion().add(MOP36);
	 FonctionnAir.getListAvion().add(AGP01);
	 FonctionnAir.getListAvion().add(AGP02);
	 FonctionnAir.getListAvion().add(AGP03);
	 FonctionnAir.getListAvion().add(AGP04);
	 FonctionnAir.getListAvion().add(AGP05);
	 FonctionnAir.getListAvion().add(AGP06);
	 FonctionnAir.getListAvion().add(AGP07);
	 FonctionnAir.getListAvion().add(AGP08);
	 FonctionnAir.getListAvion().add(AGP09);
	 FonctionnAir.getListAvion().add(AGP10);
	 FonctionnAir.getListAvion().add(AGP11);
	 FonctionnAir.getListAvion().add(AGP12);
	 FonctionnAir.getListAvion().add(AGP13);
	 FonctionnAir.getListAvion().add(AGP14);
	 FonctionnAir.getListAvion().add(AGP15);
	 FonctionnAir.getListAvion().add(AGP16);
	 FonctionnAir.getListAvion().add(AGP17);
	 FonctionnAir.getListAvion().add(AGP18);
	 FonctionnAir.getListAvion().add(AGP19);
	 FonctionnAir.getListAvion().add(AGP20);
	 FonctionnAir.getListAvion().add(AGP21);
	 FonctionnAir.getListAvion().add(AGP22);
	 FonctionnAir.getListAvion().add(AGP23);
	 FonctionnAir.getListAvion().add(AGP24);
	 FonctionnAir.getListAvion().add(AGP25);
	 FonctionnAir.getListAvion().add(AGP26);
	 FonctionnAir.getListAvion().add(AGP27);
	 FonctionnAir.getListAvion().add(AGP28);
	 FonctionnAir.getListAvion().add(AGP29);
	 FonctionnAir.getListAvion().add(AGP30);
	 FonctionnAir.getListAvion().add(AGP31);
	 FonctionnAir.getListAvion().add(AGP32);
	 FonctionnAir.getListAvion().add(AGP33);
	 FonctionnAir.getListAvion().add(AGP34);
	 FonctionnAir.getListAvion().add(AGP35);
	 FonctionnAir.getListAvion().add(AGP36);
	 FonctionnAir.getListAvion().add(GP01);
	 FonctionnAir.getListAvion().add(GP02);
	 FonctionnAir.getListAvion().add(GP03);
	 FonctionnAir.getListAvion().add(GP04);
	 FonctionnAir.getListAvion().add(GP05);
	 FonctionnAir.getListAvion().add(GP06);
	 FonctionnAir.getListAvion().add(GP07);
	 FonctionnAir.getListAvion().add(GP08);
	 FonctionnAir.getListAvion().add(GP09);
	 FonctionnAir.getListAvion().add(GP10);
	 FonctionnAir.getListAvion().add(GP11);
	 FonctionnAir.getListAvion().add(GP12);
	 FonctionnAir.getListAvion().add(GP13);
	 FonctionnAir.getListAvion().add(GP14);
	 FonctionnAir.getListAvion().add(GP15);
	 FonctionnAir.getListAvion().add(GP16);
	 FonctionnAir.getListAvion().add(GP17);
	 FonctionnAir.getListAvion().add(GP18);
	 FonctionnAir.getListAvion().add(GP19);
	 FonctionnAir.getListAvion().add(GP20);
	 FonctionnAir.getListAvion().add(GP21);
	 FonctionnAir.getListAvion().add(GP22);
	 FonctionnAir.getListAvion().add(GP23);
	 FonctionnAir.getListAvion().add(GP24);
	 FonctionnAir.getListAvion().add(GP25);
	 FonctionnAir.getListAvion().add(GP26);
	 FonctionnAir.getListAvion().add(GP27);
	 FonctionnAir.getListAvion().add(GP28);
	 FonctionnAir.getListAvion().add(GP29);
	 FonctionnAir.getListAvion().add(GP30);
	 FonctionnAir.getListAvion().add(GP31);
	 FonctionnAir.getListAvion().add(GP32);
	 FonctionnAir.getListAvion().add(GP33);
	 FonctionnAir.getListAvion().add(GP34);
	 FonctionnAir.getListAvion().add(GP35);
	 FonctionnAir.getListAvion().add(GP36);
	 FonctionnAir.getListAvion().add(TGP01);
	 FonctionnAir.getListAvion().add(TGP02);
	 FonctionnAir.getListAvion().add(TGP03);
	 FonctionnAir.getListAvion().add(TGP04);
	 FonctionnAir.getListAvion().add(TGP05);
	 FonctionnAir.getListAvion().add(TGP06);
	 FonctionnAir.getListAvion().add(TGP07);
	 FonctionnAir.getListAvion().add(TGP08);
	 FonctionnAir.getListAvion().add(TGP09);
	 FonctionnAir.getListAvion().add(TGP10);
	 FonctionnAir.getListAvion().add(TGP11);
	 FonctionnAir.getListAvion().add(TGP12);
	 FonctionnAir.getListAvion().add(TGP13);
	 FonctionnAir.getListAvion().add(TGP14);
	 FonctionnAir.getListAvion().add(TGP15);
	 FonctionnAir.getListAvion().add(TGP16);
	 FonctionnAir.getListAvion().add(TGP17);
	 FonctionnAir.getListAvion().add(TGP18);
	 FonctionnAir.getListAvion().add(TGP19);
	 FonctionnAir.getListAvion().add(TGP20);
	 FonctionnAir.getListAvion().add(TGP21);
	 FonctionnAir.getListAvion().add(TGP22);
	 FonctionnAir.getListAvion().add(TGP23);
	 FonctionnAir.getListAvion().add(TGP24);
	 FonctionnAir.getListAvion().add(TGP25);
	 FonctionnAir.getListAvion().add(TGP26);
	 FonctionnAir.getListAvion().add(TGP27);
	 FonctionnAir.getListAvion().add(TGP28);
	 FonctionnAir.getListAvion().add(TGP29);
	 FonctionnAir.getListAvion().add(TGP30);
	 FonctionnAir.getListAvion().add(TGP31);
	 FonctionnAir.getListAvion().add(TGP32);
	 FonctionnAir.getListAvion().add(TGP33);
	 FonctionnAir.getListAvion().add(TGP34);
	 FonctionnAir.getListAvion().add(TGP35);
	 FonctionnAir.getListAvion().add(TGP36);
	
	 FonctionnAir.getListEquipage().add(E1);
	 FonctionnAir.getListEquipage().add(E2);
	 FonctionnAir.getListEquipage().add(E3);
	 FonctionnAir.getListEquipage().add(E4);
	 FonctionnAir.getListEquipage().add(E5);
	 FonctionnAir.getListEquipage().add(E6);
	 FonctionnAir.getListEquipage().add(E7);
	 FonctionnAir.getListEquipage().add(E8);
	 FonctionnAir.getListEquipage().add(E9);
	 FonctionnAir.getListEquipage().add(E10);
	 FonctionnAir.getListEquipage().add(E11);
	 FonctionnAir.getListEquipage().add(E12);
	 FonctionnAir.getListEquipage().add(E13);
	 FonctionnAir.getListEquipage().add(E14);
	 FonctionnAir.getListEquipage().add(E15);
	 FonctionnAir.getListEquipage().add(E16);
	 FonctionnAir.getListEquipage().add(E17);
	 FonctionnAir.getListEquipage().add(E18);
	 FonctionnAir.getListEquipage().add(E19);
	 FonctionnAir.getListEquipage().add(E20);
	 FonctionnAir.getListEquipage().add(E21);
	 FonctionnAir.getListEquipage().add(E22);
	 FonctionnAir.getListEquipage().add(E23);
	 FonctionnAir.getListEquipage().add(E24);
	 FonctionnAir.getListEquipage().add(E25);
	 FonctionnAir.getListEquipage().add(E26);
	 FonctionnAir.getListEquipage().add(E27);
	 FonctionnAir.getListEquipage().add(E28);
	 FonctionnAir.getListEquipage().add(E29);
	 FonctionnAir.getListEquipage().add(E30);
	 FonctionnAir.getListEquipage().add(E31);
	 FonctionnAir.getListEquipage().add(E32);
	 FonctionnAir.getListEquipage().add(E33);
	 FonctionnAir.getListEquipage().add(E34);
	 FonctionnAir.getListEquipage().add(E35);
	 FonctionnAir.getListEquipage().add(E36);
	 FonctionnAir.getListEquipage().add(E37);
	 FonctionnAir.getListEquipage().add(E38);
	 FonctionnAir.getListEquipage().add(E39);
	 FonctionnAir.getListEquipage().add(E40);
	 FonctionnAir.getListEquipage().add(E41);
	 FonctionnAir.getListEquipage().add(E42);
	 FonctionnAir.getListEquipage().add(E43);
	 FonctionnAir.getListEquipage().add(E44);
	 FonctionnAir.getListEquipage().add(E45);
	 FonctionnAir.getListEquipage().add(E46);
	 FonctionnAir.getListEquipage().add(E47);
	 FonctionnAir.getListEquipage().add(E48);
	 FonctionnAir.getListEquipage().add(E49);
	 FonctionnAir.getListEquipage().add(E50);
	 FonctionnAir.getListEquipage().add(E51);
	 FonctionnAir.getListEquipage().add(E52);
	 FonctionnAir.getListEquipage().add(E53);
	 FonctionnAir.getListEquipage().add(E54);
	 FonctionnAir.getListEquipage().add(E55);
	 FonctionnAir.getListEquipage().add(E56);
	 FonctionnAir.getListEquipage().add(E57);
	 FonctionnAir.getListEquipage().add(E58);
	 FonctionnAir.getListEquipage().add(E59);
	 FonctionnAir.getListEquipage().add(E60);
	 FonctionnAir.getListEquipage().add(E61);
	 FonctionnAir.getListEquipage().add(E62);
	 FonctionnAir.getListEquipage().add(E63);
	 FonctionnAir.getListEquipage().add(E64);
	 FonctionnAir.getListEquipage().add(E65);
	 FonctionnAir.getListEquipage().add(E66);
	 FonctionnAir.getListEquipage().add(E67);
	 FonctionnAir.getListEquipage().add(E68);
	 FonctionnAir.getListEquipage().add(E69);
	 FonctionnAir.getListEquipage().add(E70);
	 FonctionnAir.getListEquipage().add(E71);
	 FonctionnAir.getListEquipage().add(E72);
	 FonctionnAir.getListEquipage().add(E73);
	 FonctionnAir.getListEquipage().add(E74);
	 FonctionnAir.getListEquipage().add(E75);
	 FonctionnAir.getListEquipage().add(E76);
	 FonctionnAir.getListEquipage().add(E77);
	 FonctionnAir.getListEquipage().add(E78);
	 FonctionnAir.getListEquipage().add(E79);
	 FonctionnAir.getListEquipage().add(E80);
	 FonctionnAir.getListEquipage().add(E81);
	 FonctionnAir.getListEquipage().add(E82);
	 FonctionnAir.getListEquipage().add(E83);
	 FonctionnAir.getListEquipage().add(E84);
	 FonctionnAir.getListEquipage().add(E85);
	 FonctionnAir.getListEquipage().add(E86);
	 FonctionnAir.getListEquipage().add(E87);
	 FonctionnAir.getListEquipage().add(E88);
	 FonctionnAir.getListEquipage().add(E89);
	 FonctionnAir.getListEquipage().add(E90);
	 FonctionnAir.getListEquipage().add(E91);
	 FonctionnAir.getListEquipage().add(E92);
	 FonctionnAir.getListEquipage().add(E93);
	 FonctionnAir.getListEquipage().add(E94);
	 FonctionnAir.getListEquipage().add(E95);
	 FonctionnAir.getListEquipage().add(E96);
	 FonctionnAir.getListEquipage().add(E97);
	 FonctionnAir.getListEquipage().add(E98);
	 FonctionnAir.getListEquipage().add(E99);
	 FonctionnAir.getListEquipage().add(E100);
	 FonctionnAir.getListEquipage().add(E101);
	 FonctionnAir.getListEquipage().add(E102);
	 FonctionnAir.getListEquipage().add(E103);
	 FonctionnAir.getListEquipage().add(E104);
	 FonctionnAir.getListEquipage().add(E105);
	 FonctionnAir.getListEquipage().add(E106);
	 FonctionnAir.getListEquipage().add(E107);
	 FonctionnAir.getListEquipage().add(E108);
	 FonctionnAir.getListEquipage().add(E109);
	 FonctionnAir.getListEquipage().add(E110);
	 FonctionnAir.getListEquipage().add(E111);
	 FonctionnAir.getListEquipage().add(E112);
	 FonctionnAir.getListEquipage().add(E113);
	 FonctionnAir.getListEquipage().add(E114);
	 FonctionnAir.getListEquipage().add(E115);
	 FonctionnAir.getListEquipage().add(E116);
	 FonctionnAir.getListEquipage().add(E117);
	 FonctionnAir.getListEquipage().add(E118);
	 FonctionnAir.getListEquipage().add(E119);
	 FonctionnAir.getListEquipage().add(E120);
	 FonctionnAir.getListEquipage().add(E121);
	 FonctionnAir.getListEquipage().add(E122);
	 FonctionnAir.getListEquipage().add(E123);
	 FonctionnAir.getListEquipage().add(E124);
	 FonctionnAir.getListEquipage().add(E125);
	 FonctionnAir.getListEquipage().add(E126);
	 FonctionnAir.getListEquipage().add(E127);
	 FonctionnAir.getListEquipage().add(E128);
	 FonctionnAir.getListEquipage().add(E129);
	 FonctionnAir.getListEquipage().add(E130);
	 FonctionnAir.getListEquipage().add(E131);
	 FonctionnAir.getListEquipage().add(E132);
	 FonctionnAir.getListEquipage().add(E133);
	 FonctionnAir.getListEquipage().add(E134);
	 FonctionnAir.getListEquipage().add(E135);
	 FonctionnAir.getListEquipage().add(E136);
	 FonctionnAir.getListEquipage().add(E137);
	 FonctionnAir.getListEquipage().add(E138);
	 FonctionnAir.getListEquipage().add(E139);
	 FonctionnAir.getListEquipage().add(E140);
	 FonctionnAir.getListEquipage().add(E141);
	 FonctionnAir.getListEquipage().add(E142);
	 FonctionnAir.getListEquipage().add(E143);
	 FonctionnAir.getListEquipage().add(E144);
	 FonctionnAir.getListEquipage().add(E145);
	 FonctionnAir.getListEquipage().add(E146);
	 FonctionnAir.getListEquipage().add(E147);
	 FonctionnAir.getListEquipage().add(E148);
	 FonctionnAir.getListEquipage().add(E149);
	 FonctionnAir.getListEquipage().add(E150);
	 FonctionnAir.getListEquipage().add(E151);
	 FonctionnAir.getListEquipage().add(E152);
	 FonctionnAir.getListEquipage().add(E153);
	 FonctionnAir.getListEquipage().add(E154);
	 FonctionnAir.getListEquipage().add(E155);
	 FonctionnAir.getListEquipage().add(E156);
	 FonctionnAir.getListEquipage().add(E157);
	 FonctionnAir.getListEquipage().add(E158);
	 FonctionnAir.getListEquipage().add(E159);
	 FonctionnAir.getListEquipage().add(E160);
	 FonctionnAir.getListEquipage().add(E161);
	 FonctionnAir.getListEquipage().add(E162);
	 FonctionnAir.getListEquipage().add(E163);
	 FonctionnAir.getListEquipage().add(E164);
	 FonctionnAir.getListEquipage().add(E165);
	 FonctionnAir.getListEquipage().add(E166);
	 FonctionnAir.getListEquipage().add(E167);
	 FonctionnAir.getListEquipage().add(E168);
	 FonctionnAir.getListEquipage().add(E169);
	 FonctionnAir.getListEquipage().add(E170);
	 FonctionnAir.getListEquipage().add(E171);
	 FonctionnAir.getListEquipage().add(E172);
	 FonctionnAir.getListEquipage().add(E173);
	 FonctionnAir.getListEquipage().add(E174);
	 FonctionnAir.getListEquipage().add(E175);
	 FonctionnAir.getListEquipage().add(E176);
	 FonctionnAir.getListEquipage().add(E177);
	 FonctionnAir.getListEquipage().add(E178);
	 FonctionnAir.getListEquipage().add(E179);
	 FonctionnAir.getListEquipage().add(E180);
	 FonctionnAir.getListEquipage().add(E181);
	 FonctionnAir.getListEquipage().add(E182);
	 FonctionnAir.getListEquipage().add(E183);
	 FonctionnAir.getListEquipage().add(E184);
	 FonctionnAir.getListEquipage().add(E185);
	 FonctionnAir.getListEquipage().add(E186);
	 FonctionnAir.getListEquipage().add(E187);
	 FonctionnAir.getListEquipage().add(E188);
	 FonctionnAir.getListEquipage().add(E189);
	 FonctionnAir.getListEquipage().add(E190);
	 FonctionnAir.getListEquipage().add(E191);
	 FonctionnAir.getListEquipage().add(E192);
	 FonctionnAir.getListEquipage().add(E193);
	 FonctionnAir.getListEquipage().add(E194);
	 FonctionnAir.getListEquipage().add(E195);
	 FonctionnAir.getListEquipage().add(E196);
	 FonctionnAir.getListEquipage().add(E197);
	 FonctionnAir.getListEquipage().add(E198);
	 FonctionnAir.getListEquipage().add(E199);
	 FonctionnAir.getListEquipage().add(E200);
	 FonctionnAir.getListEquipage().add(E201);
	 FonctionnAir.getListEquipage().add(E202);
	 FonctionnAir.getListEquipage().add(E203);
	 FonctionnAir.getListEquipage().add(E204);
	 FonctionnAir.getListEquipage().add(E205);
	 FonctionnAir.getListEquipage().add(E206);
	 FonctionnAir.getListEquipage().add(E207);
	 FonctionnAir.getListEquipage().add(E208);
	 FonctionnAir.getListEquipage().add(E209);
	 FonctionnAir.getListEquipage().add(E210);
	 FonctionnAir.getListEquipage().add(E211);
	 FonctionnAir.getListEquipage().add(E212);
	 FonctionnAir.getListEquipage().add(E213);
	 FonctionnAir.getListEquipage().add(E214);
	 FonctionnAir.getListEquipage().add(E215);
	 FonctionnAir.getListEquipage().add(E216);
	 FonctionnAir.getListEquipage().add(E217);
	 FonctionnAir.getListEquipage().add(E218);
	 FonctionnAir.getListEquipage().add(E219);
	 FonctionnAir.getListEquipage().add(E220);
	 FonctionnAir.getListEquipage().add(E221);
	 FonctionnAir.getListEquipage().add(E222);
	 FonctionnAir.getListEquipage().add(E223);
	 FonctionnAir.getListEquipage().add(E224);
	 FonctionnAir.getListEquipage().add(E225);
	 FonctionnAir.getListEquipage().add(E226);
	 FonctionnAir.getListEquipage().add(E227);
	 FonctionnAir.getListEquipage().add(E228);
	 FonctionnAir.getListEquipage().add(E229);
	 FonctionnAir.getListEquipage().add(E230);
	 FonctionnAir.getListEquipage().add(E231);
	 FonctionnAir.getListEquipage().add(E232);
	 FonctionnAir.getListEquipage().add(E233);
	 FonctionnAir.getListEquipage().add(E234);
	 FonctionnAir.getListEquipage().add(E235);
	 FonctionnAir.getListEquipage().add(E236);
	 FonctionnAir.getListEquipage().add(E237);
	 FonctionnAir.getListEquipage().add(E238);
	 FonctionnAir.getListEquipage().add(E239);
	 FonctionnAir.getListEquipage().add(E240);
	 FonctionnAir.getListEquipage().add(E241);
	 FonctionnAir.getListEquipage().add(E242);
	 FonctionnAir.getListEquipage().add(E243);
	 FonctionnAir.getListEquipage().add(E244);
	 FonctionnAir.getListEquipage().add(E245);
	 FonctionnAir.getListEquipage().add(E246);
	 FonctionnAir.getListEquipage().add(E247);
	 FonctionnAir.getListEquipage().add(E248);
	 FonctionnAir.getListEquipage().add(E249);
	 FonctionnAir.getListEquipage().add(E250);
	 FonctionnAir.getListEquipage().add(E251);
	 FonctionnAir.getListEquipage().add(E252);
	 FonctionnAir.getListEquipage().add(E253);
	 FonctionnAir.getListEquipage().add(E254);
	 FonctionnAir.getListEquipage().add(E255);
	 FonctionnAir.getListEquipage().add(E256);
	 FonctionnAir.getListEquipage().add(E257);
	 FonctionnAir.getListEquipage().add(E258);
	 FonctionnAir.getListEquipage().add(E259);
	 FonctionnAir.getListEquipage().add(E260);
	 FonctionnAir.getListEquipage().add(E261);
	 FonctionnAir.getListEquipage().add(E262);
	 FonctionnAir.getListEquipage().add(E263);
	 FonctionnAir.getListEquipage().add(E264);
	 FonctionnAir.getListEquipage().add(E265);
	 FonctionnAir.getListEquipage().add(E266);
	 FonctionnAir.getListEquipage().add(E267);
	 FonctionnAir.getListEquipage().add(E268);
	 FonctionnAir.getListEquipage().add(E269);
	 FonctionnAir.getListEquipage().add(E270);
	 FonctionnAir.getListEquipage().add(E271);
	 FonctionnAir.getListEquipage().add(E272);
	 FonctionnAir.getListEquipage().add(E273);
	 FonctionnAir.getListEquipage().add(E274);
	 FonctionnAir.getListEquipage().add(E275);
	 FonctionnAir.getListEquipage().add(E276);
	 FonctionnAir.getListEquipage().add(E277);
	 FonctionnAir.getListEquipage().add(E278);
	 FonctionnAir.getListEquipage().add(E279);
	 FonctionnAir.getListEquipage().add(E280);
	 FonctionnAir.getListEquipage().add(E281);
	 FonctionnAir.getListEquipage().add(E282);
	 FonctionnAir.getListEquipage().add(E283);
	 FonctionnAir.getListEquipage().add(E284);
	 FonctionnAir.getListEquipage().add(E285);
	 FonctionnAir.getListEquipage().add(E286);
	 FonctionnAir.getListEquipage().add(E287);
	 FonctionnAir.getListEquipage().add(E288);
	 FonctionnAir.getListEquipage().add(E289);
	 FonctionnAir.getListEquipage().add(E290);
	 FonctionnAir.getListEquipage().add(E291);
	 FonctionnAir.getListEquipage().add(E292);
	 FonctionnAir.getListEquipage().add(E293);
	 FonctionnAir.getListEquipage().add(E294);
	 FonctionnAir.getListEquipage().add(E295);
	 FonctionnAir.getListEquipage().add(E296);
	 FonctionnAir.getListEquipage().add(E297);
	 FonctionnAir.getListEquipage().add(E298);
	 FonctionnAir.getListEquipage().add(E299);
	 FonctionnAir.getListEquipage().add(E300);



		// la création des objets graphiques est déléguée au thread de
        // diffusion d'événements de Swing
		
	 SwingUtilities.invokeLater(new Runnable() {
         public void run() {
             // nouvelle fenêtre
             JFrame fenetre = new JFrame("Mon application");
             JFrame fenetre2 = new JFrame("Intro application");
             // pas de layout manager pour cette fenêtre : 
             // on positionnera les composants à la fin
             
              
           
         	
     		JPanel pannel = new JPanel();
     		
     		
     		
     		//Fenetre intro application
     		
             JPanel pannel1 = new JPanel();
             pannel1.setLayout(null);
             pannel1.setPreferredSize(new Dimension(738, 699));
             
             fenetre2.add(pannel1);
             
             JButton bouton = new JButton("Entrer dans l'application ");
             bouton.addActionListener( new ActionListener() {
         		public void actionPerformed(ActionEvent e) {
         			
         			 try {
         				 fenetre2.setVisible(false);
         				 fenetre.setVisible(true);
         				
         				            				 
         				 } 
         			 catch (Exception ex) {
         				 
         				 ex.printStackTrace();
         				 }
         		}
         		}
         		);	
             
             JLabel logo = new JLabel (new ImageIcon("logo.png"));
           
             pannel1.add(logo);
             logo.setBounds(230, 100, 250, 250);
           
             pannel1.add(bouton);
             bouton.setBounds(220, 500, 300, 70);
             
             fenetre2.setSize(740, 700);
             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
     		fenetre2.setLocation(dim.width/2 - fenetre2.getWidth()/2, dim.height/2 - fenetre2.getHeight()/2);
     		fenetre2.setVisible(true);
             
             
             //création des onglets               
             
             JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);       
             JTabbedPane onglets2 = new JTabbedPane(SwingConstants.TOP); 
             
     		//Celui des voyageurs
     		JPanel onglet1 = new JPanel();
     		onglet1.setLayout(null);
     		JLabel titreOnglet1 = new JLabel("Votre espace voyageur");
     	    
     		onglet1.add(titreOnglet1);
     	    titreOnglet1.setBounds(300, 70, 180, 20);
     		onglet1.setPreferredSize(new Dimension(730, 690));
     		
     		//Compagnie
     		
     		JPanel onglet2 = new JPanel();
     		
     		JLabel titreOnglet2 = new JLabel("Votre espace compagnie");
     		onglet2.add(titreOnglet2);
     	    titreOnglet2.setBounds(300, 70, 150, 20);
     		onglet2.setPreferredSize(new Dimension(730, 690));
     		
     		JPanel onglet3 = new JPanel();
     		onglet3.setLayout(null);
     		JLabel titreOnglet3 = new JLabel("Gestion de vos aéroports");
     		onglet3.add(titreOnglet3);
     		onglet3.setLayout(null);
     	    titreOnglet3.setBounds(300, 40, 180, 20);
     		onglet3.setPreferredSize(new Dimension(730, 550));
     		
     		JPanel onglet4 = new JPanel();
     		onglet4.setLayout(null);
     		JLabel titreOnglet4 = new JLabel("Gestion de vos avions");
     		onglet4.add(titreOnglet4);
     		onglet4.setLayout(null);
     	    titreOnglet4.setBounds(300, 40, 150, 20);
     		onglet4.setPreferredSize(new Dimension(730, 550));
     		
     		JPanel onglet5 = new JPanel();
     		onglet5.setLayout(null);
     		JLabel titreOnglet5 = new JLabel("Gestion de vos vols");
     		onglet5.add(titreOnglet5);
     		onglet5.setLayout(null);
     	    titreOnglet5.setBounds(300, 40, 150, 20);
     		onglet5.setPreferredSize(new Dimension(730, 550));
     		
     		
     		
     		
     		//ajout des onglets
     		
     		onglets.addTab("Voyageur", onglet1);
     		onglets.addTab("Compagnie", onglet2);
     		onglets.addTab("Voyageur", onglet1);
     		onglets2.addTab("Aéroports", onglet3);
     		onglets2.addTab("Avions", onglet4);
     		onglets2.addTab("Vols", onglet5);
     		
     		
     		onglets.setOpaque(true);
     		onglets2.setOpaque(true);
     		
     		onglet2.add(onglets2);
     		pannel.add(onglets);
     		
     		fenetre.getContentPane().add(pannel);
     		
             
             
             
             // Création des images
             
             JLabel avion = new JLabel (new ImageIcon("avion.gif"));
             JLabel aéroport = new JLabel (new ImageIcon("aeroport.png"));
             JLabel vol = new JLabel (new ImageIcon("vol.gif"));
             JLabel technique = new JLabel (new ImageIcon("techniqu.gif"));
           
             
            
             //ajout des images aux onglets
             
             onglet4.add(avion);
             onglet3.add(aéroport);
             onglet5.add(vol);
             onglet4.add(technique);
             
             
             
             
             // ajout des fenetres scroll
             JList list = new JList(); 
				list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
				list.setVisibleRowCount(-1);
            
				
				
				
             //Position et dimension image
             
             avion.setBounds(10, 140, 180, 150);
             aéroport.setBounds(30, 120, 140, 140);
             vol.setBounds(30, 120, 120, 120);
				technique.setBounds(10, 300, 180, 150);
				
             
             
        // création des boutons
     		
     		//Bouton voyageur
             JButton bouton1 = new JButton("Réserver un voyage");
             bouton1.addActionListener( new ActionListener() {
         		public void actionPerformed(ActionEvent e) {
         			// String url = "https://i.ytimg.com/vi/nk2jT2gH18g/maxresdefault.jpg";
         			 try {
         				 
         				// URI uri= new URI(url);
         				// java.awt.Desktop.getDesktop().browse(uri);
         				 System.out.println("Ouvre une feetre avec les vols et infos affichés");
         				 
         				 } 
         			 catch (Exception ex) {
         				 
         				 ex.printStackTrace();
         				 }
         		}
         		}
         		);	
             
             
             JButton bouton2 = new JButton("Modifier un voyage");
             bouton2.addActionListener( new ActionListener() {
         		public void actionPerformed(ActionEvent e) {
         			// String url = "https://i.ytimg.com/vi/nk2jT2gH18g/maxresdefault.jpg";
         			 try {
         				 
         				// URI uri= new URI(url);
         				// java.awt.Desktop.getDesktop().browse(uri);
         				 System.out.println("Ouvre une fenetre avec le voyage en cours à modifier..");
         				 
         				 } 
         			 catch (Exception ex) {
         				 
         				 ex.printStackTrace();
         				 }
         		}
         		}
         		);	
             
             
             
             
             
             
             
             
             
             
             
             
             
             //boutons compagnie
             
             JButton boutona = new JButton("Afficher nos aéroports");
             boutona.addActionListener( new ActionListener() {
         		public void actionPerformed(ActionEvent e) {
         			
         			 try {
         				   JList listaeroport; 
			       
      				       ArrayList bonjour = FonctionnAir.getListAeroport();
      				       Object week[] = bonjour.toArray();
      				       listaeroport= new JList(week); 
      			           JScrollPane listScroller = new JScrollPane(listaeroport);

      			           onglet3.add(listScroller);
      			           listScroller.setBounds(420,150,300,250);
         			        
         			      
         			        
         			        listaeroport.addListSelectionListener(new ListSelectionListener() {
         			           
         			        public void valueChanged(ListSelectionEvent evt) {
         			        		JFrame fenetre3 = new JFrame("Information aéroport");
         			        		
          			            	
          			            	 JPanel pannel2 = new JPanel();
          			                 pannel2.setLayout(null);
          			                 pannel2.setPreferredSize(new Dimension(400, 400));
          			            
          			                 JList listdate; 
          			                 
          			                 
          			                

    			                         String week44[]= { "0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29"}; 
               			             listdate= new JList(week44); 
                  			         JScrollPane listScroller = new JScrollPane(listdate);
          	             			 
          	            			 pannel2.add(listScroller);
          	            		     listScroller.setBounds(10,30,370,350);
          	            		     
          	            		     JTextArea area = new JTextArea();
          	            		     area.append("Selection de la date:");
          	            		     fenetre3.add(area);
          			                 area.setBounds(40, 2, 300, 20);
          			                
          			                 fenetre3.add(pannel2);
          			                
          			                 fenetre3.setSize(420, 420);
          			                 fenetre3.setLocation(dim.width/2 - fenetre.getWidth()/2, dim.height/2 - fenetre.getHeight()/2);
          			                 fenetre3.setVisible(true);
          			                 
          			               
          			              
          			                 listdate.addListSelectionListener(new ListSelectionListener() {
          			                 
          			                  JList source = (JList)evt.getSource();
        			                      String i = source.getSelectedValue().toString();
        			                      Aeroport a = FonctionnAir.stringToAeroport(i);
                  			           
                			        	 public void valueChanged(ListSelectionEvent evt1) {
                			        		JFrame fenetre4 = new JFrame("Avion dans l'aéroport");
                			        		
                			        		    
                 			            	
                 			            	 JPanel pannel3 = new JPanel();
                 			                 pannel3.setLayout(null);
                 			                 pannel3.setPreferredSize(new Dimension(400, 400));
                 			            
                 			                 JList listaviondate; 
                 			                 
                 			                 
                 			                 JList source2 = (JList)evt1.getSource();
              			                     String selected2 = source2.getSelectedValue().toString();
              			                     int i = Integer.parseInt(selected2); 
                 			                 
                 			                 ArrayList bonjour19 = a.getMapAvion().get(i);
                 			                 Object week19[] = bonjour19.toArray();
                 			                 
                      			             listaviondate= new JList(week19); 
                         			         JScrollPane listScroller = new JScrollPane(listaviondate);
                 	             			 
                 	            			 pannel3.add(listScroller);
                 	            		     listScroller.setBounds(10,30,370,350);
                 	            		     
                 	            		     JTextArea area = new JTextArea();
                 	            		     area.append("Avions à la date " + i + " dans l'aéroport sélectionné");
                 	            		     fenetre4.add(area);
                 			                 area.setBounds(40, 2, 300, 20);
                 			                
                 			                 fenetre4.add(pannel3);
                 			                
                 			                 fenetre4.setSize(420, 420);
                 			                 fenetre4.setLocation(dim.width/2 - fenetre.getWidth()/2, dim.height/2 - fenetre.getHeight()/2);
                 			                 fenetre4.setVisible(true);
                 			                 fenetre3.setVisible(false);
                 			                 
                 			                 
                 			                 
                 			                 
                 			                
                 			                
                           				
                			        	      }
                			        	    });
          			                 
          			                
          			                
          			                
                    				
         			        	      }
         			        	    });
         			        }
         			  
         			 catch (Exception ex) {
         				 
         				 ex.printStackTrace();
         				 }
         		}
             }

         		);	
             
     
             
             JButton boutonb = new JButton("Afficher nos avions");
             boutonb.addActionListener( new ActionListener() {
         		public void actionPerformed(ActionEvent e) {
         			
         			 try {
         				 
         				 JList listavion; 
    			        
         		    ArrayList<Modele> modele = new ArrayList<Modele>();
         		    
      				ArrayList bonjour = FonctionnAir.getListAvion();
      				
      				for(Avion a: FonctionnAir.getListAvion()) {
      					modele.add(a.getModele());
      				}
      				Object week[] = modele.toArray();
      				Object week2[] = bonjour.toArray();
   				     
			            listavion= new JList(week); 
   			        JScrollPane listScroller = new JScrollPane(listavion);

   			        onglet4.add(listScroller);
   			        listScroller.setBounds(420,150,300,180);         				 
     			        listavion.addListSelectionListener( new ListSelectionListener(){
     			           
     			        	 public void valueChanged(ListSelectionEvent evt) {
     			        		JFrame fenetre3 = new JFrame("Information avion");
      			            	
      			            	JPanel pannel2 = new JPanel();
      			                pannel2.setLayout(null);
      			                pannel2.setPreferredSize(new Dimension(400, 400));
      			                
      			                
      			                fenetre3.add(pannel2);
      			                JList source = (JList)evt.getSource();
      			                String selected = source.getSelectedValue().toString();
      			                
      			                JLabel avion = new JLabel (new ImageIcon(selected +".gif"));
      			                
      			                JTextArea area = new JTextArea();
      			                
      			               JTextArea area2 = new JTextArea();
      			               
      			               area.append(selected);
      			               
      			               pannel2.add(avion);
      			               pannel2.add(area);
      			             
      			               
      			               avion.setBounds(30, 100, 500, 400);
      			               area.setBounds(200,2,200,40);
      			               area.setFont(area.getFont().deriveFont(30f));
      			               
      			               fenetre3.setSize(600, 500);
      			               fenetre3.setLocation(dim.width/2 - fenetre.getWidth()/2, dim.height/2 - fenetre.getHeight()/2);
      			               fenetre3.setVisible(true);
                				
     			        	      }
     			        	    });
      			        
      			        
      			        
         				 } 
         			 
         			 
         			 catch (Exception ex) {
         				 
         				 ex.printStackTrace();
         				 }
         		}
         		}
         		);
             
             
             
             JButton boutone = new JButton("Détail de nos avions");
             boutone.addActionListener( new ActionListener() {
         		public void actionPerformed(ActionEvent e) {
         			
         			 try {
         				 
         				 JList listavion; 
    			        
         	
      				ArrayList bonjour = FonctionnAir.getListAvion();
      				
      				Object week[] = bonjour.toArray();
      				
   				     
			            listavion= new JList(week); 
   			        JScrollPane listScroller = new JScrollPane(listavion);

   			        onglet4.add(listScroller);
   			        listScroller.setBounds(420,350,300,180);         				 
     			        listavion.addListSelectionListener( new ListSelectionListener(){
     			           
     			        	 public void valueChanged(ListSelectionEvent evt) {
     			        		JFrame fenetre3 = new JFrame("Information avion");
      			            	
      			            	JPanel pannel2 = new JPanel();
      			                pannel2.setLayout(null);
      			                pannel2.setPreferredSize(new Dimension(200, 200));
      			                
      			                
      			                fenetre3.add(pannel2);
      			                JList source = (JList)evt.getSource();
      			                String selected = source.getSelectedValue().toString();
      			                
      			                JTextArea area = new JTextArea();
      			                
      			               JTextArea area2 = new JTextArea();
      			               
      			               area.append(selected);
      			               area2.append("Détail technique: "+ "\n" + selected  );
      			               pannel2.add(area);
      			               pannel2.add(area2);
      			            
      			               area.setBounds(200,2,200,40);
      			               area.setFont(area.getFont().deriveFont(30f));
      			               area2.setBounds(2,80,200,200);
      			               area2.setFont(area2.getFont().deriveFont(12f));
      			               fenetre3.setSize(300, 250);
      			               fenetre3.setLocation(dim.width/2 - fenetre.getWidth()/2, dim.height/2 - fenetre.getHeight()/2);
      			               fenetre3.setVisible(true);
                				
     			        	      }
     			        	    });
      			        
      			        
      			        
         				 } 
         			 
         			 
         			 catch (Exception ex) {
         				 
         				 ex.printStackTrace();
         				 }
         		}
         		}
         		);
             
             
             
             
             
             JButton boutonc = new JButton("Nos Vols");
             boutonc.addActionListener( new ActionListener() {
         		public void actionPerformed(ActionEvent e) {
         			
         			 try {
         				 
         				 JList listvol; 
         			     
       			        String week[]= { "0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29"}; 
    			            listvol= new JList(week); 
       			        JScrollPane listScroller = new JScrollPane(listvol);

       			        onglet5.add(listScroller);
       			        listScroller.setBounds(450,150,200,120);
       			        
       			        
       			      listvol.addListSelectionListener(new ListSelectionListener() {
    			           
  			        	 public void valueChanged(ListSelectionEvent evt) {
  			        		JFrame fenetre3 = new JFrame("Information vol");
   			            	
   			            	JPanel pannel2 = new JPanel();
   			                pannel2.setLayout(null);
   			                pannel2.setPreferredSize(new Dimension(400, 400));
   			                
   			                JList listvoldate; 
          			        
   			                JList source = (JList)evt.getSource();
   			                String selected = source.getSelectedValue().toString();
   			                int i = Integer.parseInt(selected); 
            				    ArrayList bonjour1 = FonctionnAir.getMapVol().get(i);
            				    
   			                
            				    Object week3[] = bonjour1.toArray();
            				
         				     
      			            listvoldate= new JList(week3); 
         			        JScrollPane listScroller = new JScrollPane(listvoldate);

         			        pannel2.add(listScroller);
         			        listScroller.setBounds(10,10,370,370);
   			                
   			                fenetre3.add(pannel2);
   			                
   			                
   			                fenetre3.setSize(401, 401);
   			                fenetre3.setLocation(dim.width/2 - fenetre.getWidth()/2, dim.height/2 - fenetre.getHeight()/2);
   			                fenetre3.setVisible(true);
             				
  			        	      }
  			        	    });
   			        
       			        
       			        
       			        
       			        
       			        
       			        
       			        
       			        
       			        
       			        
       			        
       			        
       			        
       			        
       			        
          				 } 
         				 
         				  
         			 catch (Exception ex) {
         				 
         				 ex.printStackTrace();
         				 }
         		}
         		}
         		);
             
             // ajout des boutons aux onglets
             onglet1.add(bouton1);
         	onglet1.add(bouton2);
         	
         	
             onglet3.add(boutona);
             onglet4.add(boutonb);
             onglet4.add(boutone);
             onglet5.add(boutonc);
             
             
             // positionnement et dimensionnement manuel des boutons
             bouton1.setBounds(200, 150, 200, 30);
             bouton2.setBounds(200, 200, 200, 30);
             
             boutona.setBounds(200, 150, 200, 30);
             boutonb.setBounds(200, 150, 200, 30);
             boutonc.setBounds(200, 150, 200, 30);
             boutone.setBounds(200, 380, 200, 30);
            
             
             // quitter le programme lorsqu'on ferme la fenêtre
             fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              
             
             
             
             
             // dimensionnement en affichage de la fenêtre
             
             fenetre.setSize(740, 700);
            
     		fenetre.setLocation(dim.width/2 - fenetre.getWidth()/2, dim.height/2 - fenetre.getHeight()/2);
         }
         });
            
	   Vol vol1 = new Vol(CDG, City, 10);
	   FonctionnAir.addVol(vol1);
	   System.out.println(FonctionnAir.getMapVol().get(10));
	   
	   
             
  
    }
}
