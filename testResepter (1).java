//Samme testene som i testLegemiddel-klassen

class TestResept{

	public static void navnTest(String faktiskResultat, String onsketResultat){
		if(faktiskResultat == onsketResultat){
			System.out.println("Riktig 1");
		}
		else{
			System.out.println("Feil 1");
		}
	}

	public static void prisTest( double faktiskResultat, double onsketResultat){
		if(faktiskResultat == onsketResultat){
		System.out.println("Riktig ");

	}
	
		else{
			System.out.println("feil");
		}
	}
	

	public static void main(String[] arg){
		Legemiddel valium = new LegemiddelB("valium", 100, 0.5, 30);
		Legemiddel morfin = new LegemiddelA("morfin", 1000, 3.0, 60);
		
		Lege dr = new Lege("gjessing");


		Resept testA = new Presept(valium, dr, 1, 8);
		Resept testB = new MilitaerResept(valium, dr, 2, 4);
		Resept testC = new BlaaResept(morfin, dr, 3, 3);

		prisTest(testA.prisAaBetale(), 0);
		navnTest(testB.farge(), "Hvit");


	}
}