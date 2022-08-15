public class Lege implements Comparable<Lege>{
	protected String navn;
	private Lenkeliste<Resept> ReseptListe = new Lenkeliste<Resept>();
	
	public Lege(String navn){
		this.navn = navn;
	}

	public String hentNavn(){
		return this.navn;
	}


    public int compareTo(Lege annenLege){
    	return navn.compareTo(annenLege.hentNavn());

    }

    public Liste<Resept> hentListeMedResepter(){
    	return this.ReseptListe;
    }

    public void settInnResept(Resept resepten){
    	this.ReseptListe.leggTil(resepten);
    }

    @Override
    public String toString(){
    	String Navn = "\nNavn på lege: " + navn;
    	Navn += "\nListe med resepter: " + hentListeMedResepter();
    	return Navn;
    }
}







/*

*/