package intern.schu.patterns.Essen;

public class SpaghettiNudeln extends AbstractNudeln{

    private String sauce = "Bolognese";
    
    @Override
    public void addPasta() {
        System.out.println("Spaghetti wird ins Wasser geworfen");
        
    }
    
    @Override
    public void addSauce() {
      System.out.println(sauce + " wird hinzugefügt"); 
    }
    
    public AbstractNudeln setSauce(String in) {
        sauce = in;
        return this;
    }
}
