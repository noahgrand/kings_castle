package intern.schu.patterns.model;

import java.util.Iterator;

import intern.schu.patterns.Bekleidnug.Mensch;

public class Ritterator implements Iterator<Mensch>{

    private Mensch currentRitter;
    
    public Ritterator(Mensch bs) {
        currentRitter = bs;
    }
    
    @Override
    public boolean hasNext() {
        if(currentRitter.getNext() == null) {
            return false;
        }
        
        return true;
    }

    @Override
    public Mensch next() {
        Mensch r = currentRitter.getNext();
        currentRitter = r;
        return currentRitter;
    }
    
    public Mensch getCurrentRitter() {
        return currentRitter;
    }

}
