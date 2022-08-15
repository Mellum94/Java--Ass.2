public class LegemiddelC extends Legemiddel {
        
    // Denne LegemiddelC subklassen legger ikke til en ny metode. Dette er vanlig legemiddel.

    public LegemiddelC(String navn, double pris, double virkestoff) {
        //Konstruktør til subklassen 
        super(navn, pris, virkestoff);  
    }

    @Override
    public void skrivUt(){
        super.skrivUt();
        System.out.println("Vanlig legemiddel.");
    }
             
} 