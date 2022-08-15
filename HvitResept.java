public class HvitResept extends Resept{
	protected double pris;
	public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient p, int reit, double pris){
		super(legemiddel, utskrivendeLege, p, reit);
		this.pris = pris;
	}

	@Override
	public String farge(){
		return "Hvit resept";
	}

	@Override
	public double prisAaBetale(){
		return pris;

	//Returnerer prisen pasienten må betale.
	}


	 @Override
    public String toString(){
    	String nyinfo = "\nPris: " + prisAaBetale();
    	nyinfo += "\nFarge på resept: " + farge();
    	String gammelinfo = super.toString();
    	return gammelinfo + nyinfo;
    }

}