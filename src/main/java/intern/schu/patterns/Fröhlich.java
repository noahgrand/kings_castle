package intern.schu.patterns;

import intern.schu.patterns.Interface.Zustand;
import intern.schu.patterns.model.Kaserne;

/***
 * Patterns: (Singleton), State, Observer
 * @author a814887
 *
 */
public class Fröhlich implements Zustand{
    
    
    //Observer pattern
    public void befehlen() {
       Kaserne.getInstance().notifyRitter(new Bar()); 
    }

}
