package patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import intern.schu.patterns.Nahkampfritter;
import intern.schu.patterns.Schwert;
import intern.schu.patterns.Bekleidnug.Mensch;
import intern.schu.patterns.model.Ritterator;

public class Ritteratortest {

    
    @Test
    public void testRitterator() {
       Schwert s = new Schwert();
       Mensch firstRitter = new Nahkampfritter(s, "Hans", 100,0);
       Mensch secondRitter = new Nahkampfritter(s, "Maya", 100,0);
       Ritterator r = new Ritterator(firstRitter);
       firstRitter.setNext(secondRitter);
       assertEquals(r.next().getName(), "Maya");

    }
}
