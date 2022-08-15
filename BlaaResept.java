public class BlaaResept extends Resept{
	protected double pris;
	
	public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient p, int reit, double pris){
		super(legemiddel, utskrivendeLege, p, reit);
		this.pris = pris;
	}

	@Override
	public String farge(){
		return "Blå resept";
	}	//Returnerer reseptens farge. Enten “hvit” eller "blaa".

	@Override
	public double prisAaBetale(){
		return this.pris*0.25;
	}	//Returnerer prisen pasienten må betale.


    @Override
    public String toString(){
    	String nyinfo = "\nPris: " + prisAaBetale();
    	nyinfo += "\nFarge på resept: " + farge();
    	String gammelinfo = super.toString();
    	return gammelinfo + nyinfo;
    }


}




