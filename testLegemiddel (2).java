//Lager to enkle tester som vi bruker til å sjekke om det faktiske resultatet fra et metodekall stemmer med det vi forventet. Tester deretter de ulike objektene.

class TestLegemiddel{

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

	public static void main(String[] args){
		
		Legemiddel valium = new LegemiddelB("valium", 100, 0.5, 10);

		navnTest(valium.hentNavn(), "valium");
		prisTest(valium.hentPris(), 100);
		

		Legemiddel pepper = new LegemiddelA("Heroin", 5000, 10, 100);

		navnTest(pepper.hentNavn(), "Heroin");
		prisTest(pepper.hentPris(), 5000);
		

		Legemiddel cosylan = new LegemiddelC("Cosylan", 100, 0.3);

		navnTest(cosylan.hentNavn(), "Cosylan");
		prisTest(cosylan.hentPris(), 100);

		
		
	}
}