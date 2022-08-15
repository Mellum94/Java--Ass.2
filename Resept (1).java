/*
Om klassen: En Resept har en ID. I tillegg skal en resept ha en referanse til et legemiddel, en referanse til
den legen som har skrevet ut resepten, og ID-en til den pasienten som eier resepten. En
resept har et antall ganger som er igjen på resepten (kalles reit). Hvis antall ganger igjen er
0, er resepten ugyldig.
*/



public abstract class Resept{
	//Kan ikke lage instanser av klassen Resept, men kan lage referanser til andre klasser. 
	static private int counter = 0;
	protected int id;
	protected Legemiddel legemiddel;
	protected Lege utskrivendeLege;
	protected Pasient p; //int pasientID;
	protected int reit;

	public Resept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient p, int reit){
		//Konstruktør
		this.id = counter++;
		this.legemiddel = legemiddel;
		this.utskrivendeLege = utskrivendeLege;
		this.p = p; 
		this.reit = reit;
	}
	public int hentId(){
		return this.id;
	}

	public Legemiddel hentLegemiddel(){
		return this.legemiddel;
	}
	 
	public Lege hentLege(){
		return this.utskrivendeLege;
	}

	public Pasient hentPasient(){
		return p;
	}

	public int hentReit(){
		return this.reit;
	}

	public boolean bruk(){
	/*Forsøker å bruke resepten én gang. Returner false om resepten
	alt er oppbrukt, ellers returnerer den true og dekrementerer reit.*/
	if (reit >0) {
		//bruk resepten en gang
		reit--;
		return true;
	}
	return false;
	}

	abstract public String farge();
	//Returnerer reseptens farge. Enten “hvit” eller "blaa".

	abstract public double prisAaBetale();
	//Returnerer prisen pasienten må betale.




	@Override
    public String toString(){
    	String Resept = "\nLegemiddel: " + legemiddel.hentNavn();
    	Resept += "\nLege: " + utskrivendeLege.hentNavn();
    	Resept += "\nPasient: " + p;
    	Resept += "\nReit: " + reit;
    	return Resept;
    }

}



