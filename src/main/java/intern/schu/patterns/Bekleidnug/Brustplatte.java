package intern.schu.patterns.Bekleidnug;

public class Brustplatte extends Kleidungsstück{
    
   private int leben = 30;
    
   public Brustplatte() {
       super();
   }
   
    @Override
    public void bekleiden(Mensch m) {
        System.out.println("Ich trage eine Brustplatte");
    }

    @Override
    public int getLeben() {
        return leben;
        
    }

    @Override
    public void setLeben(int in) {
        leben = in;
        
    }
    
    

}
