public class Militærresepter extends HvitResept{


	public Militærresepter(Legemiddel legemiddel, Lege utskrivendeLege, Pasient p, int reit, double pris){
		super(legemiddel, utskrivendeLege, p, reit, pris);

	}


	@Override
	public double prisAaBetale(){
		return this.pris*0;
	}


	 @Override
    public String toString(){
    	String nyinfo = "\nMilitærresept ";
    	String gammelinfo = super.toString();
    	return gammelinfo + nyinfo;
    }

}