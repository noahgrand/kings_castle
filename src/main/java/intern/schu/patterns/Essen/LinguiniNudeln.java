package intern.schu.patterns.Essen;

public class LinguiniNudeln extends AbstractNudeln{

    private String sauce = "Pesto";
    
    @Override
    public void addPasta() {
        System.out.println("Linguini werden ins Wasser geworfen");
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
