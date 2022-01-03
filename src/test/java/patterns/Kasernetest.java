package patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import intern.schu.patterns.Bekleidnug.Mensch;
import intern.schu.patterns.model.Kaserne;

public class Kasernetest {

    Kaserne kaserne = Kaserne.getInstance();
    
    
    @Test
    public void testSetNextRitter() {
        Mensch m1 = kaserne.generateRitter("first");
        Mensch m2 = kaserne.generateRitter("second");
        kaserne.addRitter(m1);
        kaserne.addRitter(m2);
        assertEquals(kaserne.firstRitter.getNext().getName(), "second");
    }
    
}
