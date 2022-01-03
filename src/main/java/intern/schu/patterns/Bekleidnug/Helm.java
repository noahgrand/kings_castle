package intern.schu.patterns.Bekleidnug;

public class Helm extends Kleidungsstück{
    
    private int leben = 15;
    
    public Helm() {
        super();
    }
    
    @Override
    public void bekleiden(Mensch m) {
        System.out.println("Ich trage einen Helm!");
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
