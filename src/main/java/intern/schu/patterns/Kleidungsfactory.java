package intern.schu.patterns;


public class Kleidungsfactory{

    Outfit outfit = new Outfit();

    public Outfit getKleidung(String kleidungsstück) {
        if(kleidungsstück == "Helm") {
            outfit = outfit.withHelm();
        }else if ( kleidungsstück == "Brustplatte") {
            outfit = outfit.withBrustplatte();
        }
        
        return outfit;
    }

}
