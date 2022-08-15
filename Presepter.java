/*Om klassen: Militærresepter ​utgis til vernepliktige i tjeneste, 
det blir alltid gitt 100% rabatt på prisen til et legemiddel.
*/

public class Presepter extends HvitResept{
	
	public Presepter(Legemiddel legemiddel, Lege utskrivendeLege, Pasient p, int reit, double pris){

		super(legemiddel, utskrivendeLege, p, reit = reit + 3, pris);
	}
	@Override
	public String farge(){
		return "Hvit resept";
	}

	@Override
	public double prisAaBetale(){
		if((this.pris - 116) >0) {
			return this.pris - 116;
		} 
		else {
			return 0;
		}
	}


	 @Override
    public String toString(){
    	String nyinfo = "\nP-resept ";
    	String gammelinfo = super.toString();
    	return gammelinfo + nyinfo;
    }
}
