package intern.schu.patterns;

import java.util.List;

import intern.schu.patterns.Bekleidnug.Mensch;
import intern.schu.patterns.Interface.IGarderobe;

public class RealGarderobe implements IGarderobe{
    
    Kleidungsfactory kf;

    public RealGarderobe() {
        kf = new Kleidungsfactory();
        waschen();
    }
    public void betreten() {
       System.out.println("Der Mensch betritt die Garderobe"); 
    }
    
    public void waschen() {
        System.out.println("Die Garderobe ist gewaschen");
    }

    public void kleiden(List<String> kleidungsListe, Mensch r) {
        for(String s : kleidungsListe) {
           r.setOutfit(kf.getKleidung(s));
        }
        
    }

}
