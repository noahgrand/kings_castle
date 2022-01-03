package intern.schu.patterns.model;

import java.util.Arrays;
import java.util.Iterator;

import intern.schu.patterns.Fernkampfritter;
import intern.schu.patterns.ProxyGarderobe;
import intern.schu.patterns.Schwert;
import intern.schu.patterns.Bekleidnug.Mensch;
import intern.schu.patterns.Interface.Ort;

/***
 * Patterns: Singleton, Observer
 * @author a814887
 */
public class Kaserne {

    public Mensch firstRitter;

    private static Kaserne instance;

    public static Kaserne getInstance() {
        if (instance == null) {
            instance = new Kaserne();
        }
        return instance;
    }

    public void addRitter(Mensch r) {
        Ritterator ri = new Ritterator(firstRitter);
        if (firstRitter == null) {
            firstRitter = r;
        } else {
            while (ri.hasNext()) {
                ri.next();
            }
            ri.getCurrentRitter().setNext(r);

        }

    }

    public void removeRitter(int id) {
        Mensch tempR = firstRitter;
        if (tempR.getId() == id) {
            firstRitter = tempR.getNext();
            return;
        }
        while (tempR.getNext().getId() != id) {
            Mensch r = tempR.getNext();
            tempR = r;
        }
        tempR.setNext(tempR.getNext().getNext());
    }

    public void notifyRitter(Ort ort) {
        Iterator<Mensch> ri = new Ritterator(firstRitter);
        while (ri.hasNext()) {
            ri.next().handeln(ort);
        }
    }
    
    public void schadeRitter(int menge) {
        if (firstRitter == null) {
            return;
        }if (firstRitter.getLeben() <= 0) {
            removeRitter(firstRitter.getId());
            schadeRitter(menge);
        }else {
            firstRitter.nehmeLeben(menge);
//            System.out.println("Dem Ritter: "+ firstRitter.getName()+ " wurde: "+ menge+" abgezogen. er hat jetzt noch: "+firstRitter.getLeben()+" Leben");
        }
    }
    
    public Mensch generateRitter(String name) {
       Mensch nahkaRitter2 = new Fernkampfritter(new Schwert(), name, 60, 0);
       ProxyGarderobe pg2 = new ProxyGarderobe();
       pg2.betreten();
       pg2.kleiden(Arrays.asList("Helm", "Helm"), nahkaRitter2);
       nahkaRitter2.getOutfit().getKleidungsListe().forEach(e -> e.bekleiden(nahkaRitter2));
       System.out.println(nahkaRitter2.getName()+" : "+ nahkaRitter2.getLeben());
       return nahkaRitter2;
    }
}
