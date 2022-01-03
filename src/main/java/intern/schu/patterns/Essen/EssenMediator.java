package intern.schu.patterns.Essen;

import intern.schu.patterns.Interface.IPizzaWrapper;

public class EssenMediator {

    
    public IPizzaWrapper belege(String topping, IPizzaWrapper prev) {
        switch(topping) {
            case "pilz": return new PilzBelag(prev);
            case "salami": return new SalamiBelag(prev);
            case "schinken": return new SchinkenBelag(prev);
            default: return null;
        }
    }
    
    
    public AbstractNudeln bestellePasta(String nudeln) {
       switch(nudeln) {
           case "linguini": return new LinguiniNudeln();
           case "spaghetti": return new SpaghettiNudeln();
           default: return null;
       }
    }
}
