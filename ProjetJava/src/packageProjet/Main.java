package packageProjet;


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
	 
	 
	 
     }
	
	
}



