package intern.schu.patterns;

import intern.schu.patterns.Interface.Zustand;
import intern.schu.patterns.model.Kaserne;

/**
 * Pattern: (Singleton), State, Observer
 * @author a814887
 *
 */
public class Wütend implements Zustand {
    
    public void befehlen() {
       //Observer Pattern
       Kaserne.getInstance().notifyRitter(new Schlachtfeld()); 
    }

}
