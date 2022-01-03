package intern.schu.patterns.Interface;

import intern.schu.patterns.Bekleidnug.Mensch;

/**
 * Pattern: Visitor
 * @author a814887
 *
 */
public interface Ort {

    
    public void nahkampf(Mensch r);
    
    public void fernkampf(Mensch r);
}
