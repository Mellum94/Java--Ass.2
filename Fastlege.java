
public class Fastlege extends Lege implements Kommuneavtale{
	private String navn;
	private int avtaleNummer; 
	
	public Fastlege(String navn, int avtaleNummer){
		super(navn);
		this.avtaleNummer = avtaleNummer;
		}

	public int hentAvtaleNummer(){
		return this.avtaleNummer;
	}
	
	@Override
    public String toString(){
    	String gammelinfo = super.toString();
    	String nyinfo = "\nFastlege";
    	nyinfo += "\nAvtale nummer: " + avtaleNummer;
    	return gammelinfo + nyinfo;
    }

}



