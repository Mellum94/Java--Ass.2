public class LegemiddelA extends Legemiddel {
        
    // Denne LegemiddelA subklassen legger til en metode
    private int narkotiskStyrke;

    public LegemiddelA(String navn, double pris, double virkestoff, int narkotiskStyrke) {
        //Konstruktør til subklassen 
        super(navn, pris, virkestoff);
        this.narkotiskStyrke = narkotiskStyrke;
    }   
        
    //LegemiddelA subklassen legger til en ekstra metode 
    public double hentNarkotiskStyrke() {
        return narkotiskStyrke;
    } 

    @Override
    public void skrivUt(){
        super.skrivUt();
        System.out.println("Narkotisk styrke: " + narkotiskStyrke);
    }  
}