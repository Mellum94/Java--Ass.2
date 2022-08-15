
/*
Superklassen Legemiddel har metodene hentId, hentNavn, hentPris og hentVirkestoff som returnerer
relevante verdier, og en siste metode som setter ny pris på legemiddelet. Konstruktøren til superklassen tar inn String navn, double pris og double virkestoff.
*/


public class Legemiddel{
	static private int counter = 0;
	protected int id;
	protected String navn;
	protected double pris;
	protected double virkestoff;

	public Legemiddel(String navn, double pris, double virkestoff){
		/*Konstruktør
		Observer at "counter" er static og vil derfor være uavhengig av instansen, dvs. "id" tildeles 
		verdien til "counter" og vil derfor være ulik tidligere objekters ID.
		*/
		
		this.navn = navn;
		this.pris = pris;
		this.virkestoff = virkestoff;

	}

	public int hentId(){
		return this.id;
	}

	public String hentNavn(){
		return this.navn;
	}

	public double hentPris(){
		return this.pris;
	}

	public double hentVirkestoff(){
		return this.virkestoff;
	}

	public void settNyPris(double nyPris){
		pris = nyPris;
	}

	public void skrivUt(){
		System.out.println("Legemiddel " + navn);
		System.out.println("ID: " + id);
		System.out.println("Pris: " + pris);
		System.out.println("Virkestoff: " + virkestoff);

	}

}

