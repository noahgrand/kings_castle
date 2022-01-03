package intern.schu.patterns.Bekleidnug;

import java.util.concurrent.ThreadLocalRandom;

import intern.schu.patterns.Interface.IRüstungsModifikator;

public abstract class Kleidungsstück {
    
    protected IRüstungsModifikator modifikator = new Neutralmodifikator();
    
    private final IRüstungsModifikator[] modArr = {new Glücksmodifikator(), new Pechmodifikator(), new Neutralmodifikator()};

    public Kleidungsstück() {
       modifikator = modArr[ThreadLocalRandom.current().nextInt(0, 3)];
    }
    
    public abstract void bekleiden(Mensch m);
    
    public abstract int getLeben();
    
    public abstract void setLeben(int in);
    
    public void setModifikator(IRüstungsModifikator in) {
        modifikator = in;
    }
    
    public IRüstungsModifikator getModifikator() {
        return modifikator;
    }
}
