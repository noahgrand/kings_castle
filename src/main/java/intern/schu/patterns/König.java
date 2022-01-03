package intern.schu.patterns;

import intern.schu.patterns.Interface.Zustand;

/**
 * Patterns: Singleton, (State)
 * @author a814887
 *
 */
public class König {

    private static König instance;
    
    private Zustand zustand;
    
    
    private König() {}
    
    public static König getInstance() {
        if(instance == null) {
            instance = new König();
        }
        
        return instance;
    }
    
    
    public void regieren(Zustand in) {
       zustand = in; 
       zustand.befehlen(); 
    }
    
  
    
    
}
