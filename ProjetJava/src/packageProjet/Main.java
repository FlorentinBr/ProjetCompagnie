package packageProjet;

import java.util.ArrayList;

public abstract class Main {
	public static void main(String [] args){
	
	


	 
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
	 
	 Equipage E001 = new Equipage(1);
	 Equipage E002 = new Equipage(2);
	 Equipage E003 = new Equipage(3);
	 Equipage E004 = new Equipage(4);
	 Equipage E005 = new Equipage(5);
	 Equipage E006 = new Equipage(6);
	 Equipage E007 = new Equipage(7);
	 Equipage E008 = new Equipage(8);
	 Equipage E009 = new Equipage(9);
	 Equipage E010 = new Equipage(10);
	 Equipage E011 = new Equipage(11);
	 Equipage E012 = new Equipage(12);
	 Equipage E013 = new Equipage(13);
	 Equipage E014 = new Equipage(14);
	 Equipage E015 = new Equipage(15);
	 Equipage E016 = new Equipage(16);
	 Equipage E017 = new Equipage(17);
	 Equipage E018 = new Equipage(18);
	 Equipage E019 = new Equipage(19);
	 Equipage E020 = new Equipage(20);
	 Equipage E021 = new Equipage(21);
	 Equipage E022 = new Equipage(22);
	 Equipage E023 = new Equipage(23);
	 Equipage E024 = new Equipage(24);
	 Equipage E025 = new Equipage(25);
	 Equipage E026 = new Equipage(26);
	 Equipage E027 = new Equipage(27);
	 Equipage E028 = new Equipage(28);
	 Equipage E029 = new Equipage(29);
	 Equipage E030 = new Equipage(30);
	 Equipage E031 = new Equipage(31);
	 Equipage E032 = new Equipage(32);
	 Equipage E033 = new Equipage(33);
	 Equipage E034 = new Equipage(34);
	 Equipage E035 = new Equipage(35);
	 Equipage E036 = new Equipage(36);
	 Equipage E037 = new Equipage(37);
	 Equipage E038 = new Equipage(38);
	 Equipage E039 = new Equipage(39);
	 Equipage E040 = new Equipage(40);
	 Equipage E041 = new Equipage(41);
	 Equipage E042 = new Equipage(42);
	 Equipage E043 = new Equipage(43);
	 Equipage E044 = new Equipage(44);
	 Equipage E045 = new Equipage(45);
	 Equipage E046 = new Equipage(46);
	 Equipage E047 = new Equipage(47);
	 Equipage E048 = new Equipage(48);
	 Equipage E049 = new Equipage(49);
	 Equipage E050 = new Equipage(50);
	 Equipage E051 = new Equipage(51);
	 Equipage E052 = new Equipage(52);
	 Equipage E053 = new Equipage(53);
	 Equipage E054 = new Equipage(54);
	 Equipage E055 = new Equipage(55);
	 Equipage E056 = new Equipage(56);
	 Equipage E057 = new Equipage(57);
	 Equipage E058 = new Equipage(58);
	 Equipage E059 = new Equipage(59);
	 Equipage E060 = new Equipage(60);
	 Equipage E061 = new Equipage(61);
	 Equipage E062 = new Equipage(62);
	 Equipage E063 = new Equipage(63);
	 Equipage E064 = new Equipage(64);
	 Equipage E065 = new Equipage(65);
	 Equipage E066 = new Equipage(66);
	 Equipage E067 = new Equipage(67);
	 Equipage E068 = new Equipage(68);
	 Equipage E069 = new Equipage(69);
	 Equipage E070 = new Equipage(70);
	 Equipage E071 = new Equipage(71);
	 Equipage E072 = new Equipage(72);
	 Equipage E073 = new Equipage(73);
	 Equipage E074 = new Equipage(74);
	 Equipage E075 = new Equipage(75);
	 Equipage E076 = new Equipage(76);
	 Equipage E077 = new Equipage(77);
	 Equipage E078 = new Equipage(78);
	 Equipage E079 = new Equipage(79);
	 Equipage E080 = new Equipage(80);
	 Equipage E081 = new Equipage(81);
	 Equipage E082 = new Equipage(82);
	 Equipage E083 = new Equipage(83);
	 Equipage E084 = new Equipage(84);
	 Equipage E085 = new Equipage(85);
	 Equipage E086 = new Equipage(86);
	 Equipage E087 = new Equipage(87);
	 Equipage E088 = new Equipage(88);
	 Equipage E089 = new Equipage(89);
	 Equipage E090 = new Equipage(90);
	 Equipage E091 = new Equipage(91);
	 Equipage E092 = new Equipage(92);
	 Equipage E093 = new Equipage(93);
	 Equipage E094 = new Equipage(94);
	 Equipage E095 = new Equipage(95);
	 Equipage E096 = new Equipage(96);
	 Equipage E097 = new Equipage(97);
	 Equipage E098 = new Equipage(98);
	 Equipage E099 = new Equipage(99);
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
	 
	 
	 
	 
    ArrayList list1 = new ArrayList<Avion>();
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
    	CDG.getMapAvion().put(i, list1);
    }
    
  
    
    ArrayList list2 = new ArrayList<Avion>() ;
    list2.add(MiniP03);
    list2.add(MiniP04);
    list2.add(TPP02);
    list2.add(PP02); 
    list2.add(MOP03);
    list2.add(TGP04);
     
    for(int i = 0; i<30; i++) {
    	Orly.getMapAvion().put(0, list2);
    }
	 
	ArrayList list3 = new ArrayList<Avion>() ;
    list3.add(MiniP05);    
    list3.add(TPP03);  
    list3.add(MOP05);
    list3.add(GP05);
    list3.add(TGP05);
    
    for(int i = 0; i<30; i++) {
    	Rennes.getMapAvion().put(0, list3);
    }
    
    
    ArrayList list4 = new ArrayList<Avion>() ;
    list4.add(MiniP05);    
    list4.add(PP03);  
    list4.add(MOP06);
    
    for(int i = 0; i<30; i++) {
    	Marseille.getMapAvion().put(0, list4);
    }
    	
    ArrayList list5 = new ArrayList<Avion>() ;
    list5.add(MiniP06);    
    list5.add(TPP04);  
    list5.add(TGP06);
    
    
    for(int i = 0; i<30; i++) {
    	Lyon.getMapAvion().put(0, list5);
    }	
    	
    
    ArrayList list6 = new ArrayList<Avion>() ;
    list6.add(TPP05);    
    list6.add(PP06);  
    list6.add(PP07);
   
    
    for(int i = 0; i<30; i++) {
    	Reykjavik.getMapAvion().put(0, list6);
    }	
    	
    
    ArrayList list7 = new ArrayList<Avion>() ;
    list7.add(PP08);    
    
    list7.add(TGP07);
    list7.add(TGP08);
    list7.add(TGP09);
    
    
    for(int i = 0; i<30; i++) {
    	Heathrow.getMapAvion().put(0, list7);
    }
    
    
    ArrayList list8 = new ArrayList<Avion>() ;
    list8.add(PP09);    
    list8.add(MOP09);  
    list8.add(MOP10);
    list8.add(GP09);
    list8.add(TGP10);
    
    for(int i = 0; i<30; i++) {
    	City.getMapAvion().put(0, list8);
    }

    ArrayList list9 = new ArrayList<Avion>() ;
    list9.add(PP10);
    list9.add(MiniP07);
    list9.add(MOP11);  
    list9.add(MOP12);
    list9.add(GP10);
    list9.add(TGP11);
    
    
    for(int i = 0; i<30; i++) {
    	Ynukovo.getMapAvion().put(0, list9);
    }
    
    
    ArrayList list10 = new ArrayList<Avion>() ;
    list10.add(PP11);
    list10.add(MiniP08);
    list10.add(GP12);
    list10.add(TGP12);
    
    for(int i = 0; i<30; i++) {
    	Sheremtyevo.getMapAvion().put(0, list10);
    }
    
    
    ArrayList list11 = new ArrayList<Avion>() ;
    list11.add(PP12);
    list11.add(MiniP09);
    list11.add(MOP14);  
    list11.add(GP12);
    list11.add(GP13);
    list11.add(TGP13);
    
    
    for(int i = 0; i<30; i++) {
    	Barajas.getMapAvion().put(0, list11);
    }	
    
    
    ArrayList list12 = new ArrayList<Avion>() ;
    list12.add(PP13);
    list12.add(MiniP10);
    list12.add(AGP05);  
    list12.add(AGP06);
    list12.add(AGP07);
    list12.add(AGP08);
    
    
    for(int i = 0; i<30; i++) {
    	CuatroVientos.getMapAvion().put(0, list12);
    }
    
    
    
    ArrayList list13 = new ArrayList<Avion>() ;
    list13.add(PP14);
    list13.add(MiniP11);
    list13.add(AGP09);  
    list13.add(GP14);
    list13.add(TGP14);
    list13.add(MOP15);
    
    
    for(int i = 0; i<30; i++) {
    	Ciampino.getMapAvion().put(0, list13);
    }
    
    
    ArrayList list14 = new ArrayList<Avion>() ;
    list14.add(PP15);
    list14.add(MiniP12);
    list14.add(AGP10);  
    list14.add(GP15);
    list14.add(TGP15);
    list14.add(MOP16);
    
    for(int i = 0; i<30; i++) {
    	Fiumicino.getMapAvion().put(0, list14);
    }
    
    
    
    ArrayList list15 = new ArrayList<Avion>() ;
    list15.add(PP16);
    list15.add(MiniP13);
    list15.add(AGP11);  
    list15.add(GP16);
    list15.add(TGP16);
    list15.add(MOP17);
    
    for(int i = 0; i<30; i++) {
    	Barcelona.getMapAvion().put(0, list15);
    }
    
    
    ArrayList list16 = new ArrayList<Avion>() ;
    list16.add(PP17);
    list16.add(MiniP14);
    list16.add(AGP12);  
    list16.add(GP17);
    list16.add(TGP17);
    list16.add(MOP18);
    
    for(int i = 0; i<30; i++) {
    	Gerona.getMapAvion().put(0, list16);
    }
    
    
    
    ArrayList list17 = new ArrayList<Avion>() ;
    list17.add(PP18);
    list17.add(MiniP15);
    list17.add(AGP13);  
    list17.add(GP18);
    list17.add(TGP18);
    list17.add(MOP19);
    
    for(int i = 0; i<30; i++) {
    	Borispol.getMapAvion().put(0, list17);
    }
    
    
    ArrayList list18 = new ArrayList<Avion>() ;
    list18.add(PP19);
    list18.add(MiniP16);
    list18.add(AGP14);  
    list18.add(GP19);
    list18.add(TGP19);
    list18.add(MOP20);
    
    for(int i = 0; i<30; i++) {
    	Zhulyany.getMapAvion().put(0, list18);
    }
    
    
    
    ArrayList list19 = new ArrayList<Avion>() ;
    list19.add(PP20);
    list19.add(MiniP17);
    list19.add(AGP15);  
    list19.add(GP20);
    list19.add(TGP20);
    list19.add(MOP21);
    
    
    for(int i = 0; i<30; i++) {
    	Okecie.getMapAvion().put(0, list19);
    }
    
    
    ArrayList list20 = new ArrayList<Avion>() ;
    list20.add(PP21);
    list20.add(MiniP18);
    list20.add(AGP16);  
    list20.add(GP21);
    list20.add(TGP21);
    list20.add(MOP22);
    
    for(int i = 0; i<30; i++) {
    	Bemowo.getMapAvion().put(0, list20);
    }
    
    
    ArrayList list21 = new ArrayList<Avion>() ;
    list21.add(PP22);
    list21.add(MiniP19);
    list21.add(AGP17);  
    list21.add(GP22);
    list21.add(TGP22);
    list21.add(MOP23);
    
    for(int i = 0; i<30; i++) {
    	Bromma.getMapAvion().put(0, list21);
    }
    
    
    
    
    ArrayList list22 = new ArrayList<Avion>() ;
    list22.add(PP23);
    list22.add(MiniP20);
    list22.add(AGP18);  
    list22.add(GP23);
    list22.add(TGP23);
    list22.add(MOP24);
    
    for(int i = 0; i<30; i++) {
    	Barkarby.getMapAvion().put(0, list22);
    }
    
    
    ArrayList list23 = new ArrayList<Avion>() ;
    list23.add(PP24);
    list23.add(MiniP21);
    list23.add(AGP19);  
    list23.add(GP24);
    list23.add(TGP24);
    list23.add(MOP25);
    
    for(int i = 0; i<30; i++) {
    	Malte.getMapAvion().put(0, list23);
    }
    	
    
    ArrayList list24 = new ArrayList<Avion>() ;
    list24.add(PP25);
    list24.add(MiniP22);
    list24.add(AGP20);  
    list24.add(GP25);
    list24.add(TGP25);
    list24.add(MOP26);
    
    
    for(int i = 0; i<30; i++) {
    	Oslo.getMapAvion().put(0, list24);
    }
    
    
    ArrayList list25 = new ArrayList<Avion>() ;
    list25.add(PP26);
    list25.add(MiniP23);
    list25.add(AGP21);  
    list25.add(GP26);
    list25.add(TGP26);
    list25.add(MOP27);
    
    
    for(int i = 0; i<30; i++) {
    	Helsinki.getMapAvion().put(0, list25);
    }
    
    
    
    
    ArrayList list26 = new ArrayList<Avion>() ;
    list26.add(PP27);
    list26.add(MiniP24);
    list26.add(AGP22);  
    list26.add(GP27);
    list26.add(TGP27);
    list26.add(MOP28);
    
    
    for(int i = 0; i<30; i++) {
    	Porto.getMapAvion().put(0, list26);
    }
    
    
    
    ArrayList list27 = new ArrayList<Avion>() ;
    list27.add(PP28);
    list27.add(MiniP25);
    list27.add(AGP23);  
    list27.add(GP28);
    list27.add(TGP28);
    list27.add(MOP29);
    
    
    for(int i = 0; i<30; i++) {
    	Lisbonne.getMapAvion().put(0, list27);
    }
    
    
    
    ArrayList list28 = new ArrayList<Avion>() ;
    list28.add(PP29);
    list28.add(MiniP26);
    list28.add(AGP24);  
    list28.add(GP29);
    list28.add(TGP29);
    list28.add(MOP30);
    
    
    for(int i = 0; i<30; i++) {
    	Munich.getMapAvion().put(0, list28);
    }
    
    
    
    ArrayList list29 = new ArrayList<Avion>() ;
    list29.add(PP30);
    list29.add(MiniP27);
    list29.add(AGP25);  
    list29.add(GP30);
    list29.add(TGP30);
    list29.add(MOP31);
    
    
    for(int i = 0; i<30; i++) {
    	Dublin.getMapAvion().put(0, list29);
    }
    
    
    ArrayList list30 = new ArrayList<Avion>() ;
    list30.add(PP31);
    list30.add(MiniP28);
    list30.add(AGP26);  
    list30.add(GP31);
    list30.add(TGP31);
    list30.add(MOP32);
    
    
    for(int i = 0; i<30; i++) {
    	Edimbourg.getMapAvion().put(0, list30);
    }
    
    
    
    ArrayList list31 = new ArrayList<Avion>() ;
    list31.add(PP32);
    list31.add(MiniP29);
    list31.add(AGP27);  
    list31.add(GP32);
    list31.add(TGP32);
    list31.add(MOP33);
    
    for(int i = 0; i<30; i++) {
    	Istanboul.getMapAvion().put(0, list31);
    }
    
    
    ArrayList list32 = new ArrayList<Avion>() ;
    list32.add(PP33);
    list32.add(MiniP30);
    list32.add(AGP28);  
    list32.add(GP33);
    list32.add(TGP33);
    list32.add(MOP34);
    
    
    for(int i = 0; i<30; i++) {
    	Zagreb.getMapAvion().put(0, list32);
    }
    
    
    
    ArrayList list33 = new ArrayList<Avion>() ;
    list33.add(PP33);
    list33.add(MiniP30);
    list33.add(AGP28);  
    list33.add(GP33);
    list33.add(TGP33);
    list33.add(MOP34);
    
    
    for(int i = 0; i<30; i++) {
    	Belgrade.getMapAvion().put(0, list33);
    }
    
    
    
    ArrayList list34 = new ArrayList<Avion>() ;
    list34.add(PP34);
    list34.add(MiniP31);
    list34.add(AGP29);  
    list34.add(GP34);
    list34.add(TGP34);
    list34.add(MOP35);
    
    
    for(int i = 0; i<30; i++) {
    	Sarajevo.getMapAvion().put(0, list34);
    }
    
    
    
    ArrayList list35 = new ArrayList<Avion>() ;
    list35.add(PP35);
    list35.add(MiniP32);
    list35.add(AGP30);  
    list35.add(GP35);
    list35.add(TGP35);
    list35.add(MOP36);
    
    
    for(int i = 0; i<30; i++) {
    	Tirana.getMapAvion().put(0, list35);
    }
    
    
    
   
    ArrayList list36 = new ArrayList<Avion>() ;
    list36.add(MiniP33);
    list36.add(AGP31);  
    list36.add(GP36);
    list36.add(TGP36);
    
    
    for(int i = 0; i<30; i++) {
    	Bucarest.getMapAvion().put(0, list36);
    }
    
    
    ArrayList list37 = new ArrayList<Avion>() ; 
    list37.add(MiniP34);
    list37.add(AGP32);  
   
    
    for(int i = 0; i<30; i++) {
    	Budapest.getMapAvion().put(0, list37);
    }
    
    
    ArrayList list38 = new ArrayList<Avion>() ;
    
    list38.add(MiniP35);
    list38.add(AGP33);  
   
    for(int i = 0; i<30; i++) {
    	Prague.getMapAvion().put(0, list38);
    }
    
    
   
    
    ArrayList list39 = new ArrayList<Avion>() ;
    
    
    list39.add(AGP34);  
   
    
    for(int i = 0; i<30; i++) {
    	Bruxelles.getMapAvion().put(0, list39);
    }
    
    
    
    
    ArrayList list40 = new ArrayList<Avion>() ;
 
    list40.add(AGP35);  
   
    for(int i = 0; i<30; i++) {
    	Amsterdam.getMapAvion().put(0, list40);
    }
    
    
    
    
    ArrayList list41 = new ArrayList<Avion>() ;
    list41.add(AGP36); 
    
    for(int i = 0; i<30; i++) {
    	Geneve.getMapAvion().put(0, list41); 
    }
    
    
    
    ArrayList list42 = new ArrayList<Avion>() ;
    list42.add(MOP07);
    list42.add(GP07);
    
    for(int i = 0; i<30; i++) {
    	SaintPetersbourg.getMapAvion().put(0, list42);   
    }
    
    
    ArrayList list43 = new ArrayList<Avion>() ;
    list43.add(MOP08);  
    list43.add(GP08);
    
    for(int i = 0; i<30; i++) {
    	Talin.getMapAvion().put(0, list43);
    }
    
    
    
    
    ArrayList list44 = new ArrayList<Avion>() ;
    list44.add(MOP13);  
    list44.add(GP11);
    
    for(int i = 0; i<30; i++) {
    	Riga.getMapAvion().put(0, list44);
    }
    
    
    
    
    ArrayList list45 = new ArrayList<Avion>() ;
    list45.add(AGP04);
    list45.add(GP03);
    
    for(int i = 0; i<30; i++) {
    	Vilnius.getMapAvion().put(0, list45);
    }
    
    
    
    ArrayList list46 = new ArrayList<Avion>() ;
    list46.add(MOP02);
    list46.add(AGP01);
    
    for(int i = 0; i<30; i++) {
    	Copenhague.getMapAvion().put(0, list46);
    }
    
    
    
    ArrayList list47 = new ArrayList<Avion>() ;
    list47.add(AGP03);
    list47.add(GP04);
    
    for(int i = 0; i<30; i++) {
    	Milan.getMapAvion().put(0, list47);
    }
    
    
    
    ArrayList list48 = new ArrayList<Avion>() ;
    list48.add(MOP04);
    list48.add(TGP03);
    
    for(int i = 0; i<30; i++) {
    	Athenes.getMapAvion().put(0, list48);
    }
    
    
    
    ArrayList list49 = new ArrayList<Avion>() ;
    list49.add(PP05);
    list49.add(MOP06);
    
    for(int i = 0; i<30; i++) {
    	Poudlard.getMapAvion().put(0, list49);
    }
    
    
    
    ArrayList list50 = new ArrayList<Avion>() ;
    list50.add(PP04);
    list50.add(GP06);
    
    for(int i = 0; i<30; i++) {
    	Minsk.getMapAvion().put(0, list50);
    }
    
    
	
	 
	 Compagnie FonctionnAir = new Compagnie();
	 
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
	
	 
	System.out.println(list44);
	 
     }
	
	
}



