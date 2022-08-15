public class LegemiddelB extends Legemiddel {
        
    // Denne LegemiddelB subklassen legger til en metode
    private int vanedannendeStyrke;

    public LegemiddelB(String navn, double pris, double virkestoff, int vanedannendeStyrke) {
        //Konstruktør til subklassen 
        super(navn, pris, virkestoff);
        this.vanedannendeStyrke = vanedannendeStyrke;
    }   
        
    //LegemiddelB subklassen legger til en ekstra metode 
    public double hentVanedannendeStyrke() {
        return vanedannendeStyrke;
    }   

    @Override
    public void skrivUt(){
        super.skrivUt();
        System.out.println("vanedannende styrke: " + vanedannendeStyrke);
    
    }


}