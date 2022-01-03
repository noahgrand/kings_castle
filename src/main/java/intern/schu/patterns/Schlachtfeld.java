package intern.schu.patterns;

import intern.schu.patterns.Bekleidnug.Mensch;
import intern.schu.patterns.Interface.Ort;

/**
 * Pattern: Visitor
 * @author a814887
 *
 */
public class Schlachtfeld implements Ort{

    public void nahkampf(Mensch r) {
        System.out.println("Der Mensch kämpft auf dem Schlachtfeld mit seinen Fäusten!");
        
    }

    public void fernkampf(Mensch r) {
        System.out.println("Der Mensch kämpft auf dem Schlachtfeld mit seinem Bogen!");
        
    }


}
