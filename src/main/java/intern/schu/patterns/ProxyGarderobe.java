package intern.schu.patterns;

import java.util.List;

import intern.schu.patterns.Bekleidnug.Mensch;
import intern.schu.patterns.Interface.IGarderobe;

public class ProxyGarderobe implements IGarderobe{

    private RealGarderobe rg;
    
    public void betreten() {
        if(rg == null) {
            rg = new RealGarderobe();
        }
        rg.betreten();
        
    }

    public void kleiden(List<String> kleidungsListe, Mensch r) {
        rg.kleiden(kleidungsListe, r);
        
    }

}
