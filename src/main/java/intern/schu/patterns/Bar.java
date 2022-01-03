package intern.schu.patterns;

import intern.schu.patterns.Bekleidnug.Mensch;
import intern.schu.patterns.Interface.Ort;

/***
 * Pattern: Visitor
 * @author a814887
 *
 */
public class Bar implements Ort{

    public void nahkampf(Mensch r) {
        System.out.println("Der Mensch säuft in der Bar und zeigt sein Schwert");
        
    }

    public void fernkampf(Mensch r) {
        System.out.println("Der Mensch säuft in der Bar und zeigt sein Bogen");
        
    }
    
    

}
