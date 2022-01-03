package intern.schu.patterns;

import java.util.ArrayList;
import java.util.List;

import intern.schu.patterns.Bekleidnug.Brustplatte;
import intern.schu.patterns.Bekleidnug.Glücksmodifikator;
import intern.schu.patterns.Bekleidnug.Helm;
import intern.schu.patterns.Bekleidnug.Kleidungsstück;
import intern.schu.patterns.Bekleidnug.Neutralmodifikator;
import intern.schu.patterns.Bekleidnug.Pechmodifikator;
import intern.schu.patterns.Interface.IRüstungsModifikator;

public class Outfit {
    
    private List<Kleidungsstück> kleidungsListe = new ArrayList();
    public List<Kleidungsstück> getKleidungsListe(){return kleidungsListe;}

    public Outfit withHelm() {
        Helm hose = new Helm();
        hose.setLeben(hose.getModifikator().berechneLeben(hose.getLeben()));
        kleidungsListe.add(hose);
        return this;
    }

    public Outfit withBrustplatte() {
        Brustplatte brustplatte = new Brustplatte();
        brustplatte.setLeben(brustplatte.getModifikator().berechneLeben(brustplatte.getLeben()));
        kleidungsListe.add(brustplatte);
        return this;
    }
    
    public void löscheOutfit() {
        kleidungsListe.clear();
    }
    
    


}
