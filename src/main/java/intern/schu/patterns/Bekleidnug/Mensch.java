package intern.schu.patterns.Bekleidnug;

import java.util.ArrayList;
import java.util.List;

import intern.schu.patterns.Outfit;
import intern.schu.patterns.Interface.Kampfart;
import intern.schu.patterns.Interface.Ort;

/**
 * Pattern: Strategy
 * @author a814887
 *
 */
public abstract class Mensch {
    
    protected int leben;
    
    protected String name;
    
    protected Kampfart kampfart;
    
    protected int id;
    
    
    
    
    
    public Mensch(String name, int leben, int id) {
        this.name = name;
        this.leben = leben;
        this.id = id;
    }
    
    
    public abstract void handeln(Ort ort);
    
    public abstract Outfit getOutfit();
    public abstract void setOutfit(Outfit o);
    
    
    public void rennen() {
        kampfart.kämpfen();
    }
    
    public void addLeben(int menge) {
        leben += menge;
    }
    
    public void nehmeLeben(int menge) {
        int temp = menge;
        int lastIndex = getOutfit().getKleidungsListe().size()-1;
        if(menge == 0) {
            return;
        }
        if(getOutfit().getKleidungsListe().size()==0) {
            leben -= menge;
        }
        else if(getOutfit().getKleidungsListe().get(lastIndex).getLeben()<menge) {
                temp -= getOutfit().getKleidungsListe().get(lastIndex).getLeben();
                getOutfit().getKleidungsListe().remove(getOutfit().getKleidungsListe().size()-1);
                nehmeLeben(temp);
        }else if(getOutfit().getKleidungsListe().get(getOutfit().getKleidungsListe().size()-1).getLeben()>menge) {
            getOutfit().getKleidungsListe().get(getOutfit().getKleidungsListe().size()-1).setLeben(getOutfit().getKleidungsListe().get(getOutfit().getKleidungsListe().size()-1).getLeben()-menge);
        }else if(getOutfit().getKleidungsListe().get(lastIndex).getLeben()==menge) {
            getOutfit().getKleidungsListe().remove(lastIndex);
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getLeben() {
        int x = getOutfit().getKleidungsListe().stream().map(n -> n.getLeben()).reduce((i,k) -> i+k).orElse(0);
        return leben+x;
    }
    
    public void setId(int newId) {
        id = newId;
    }
    
    public int getId() {
        return id;
    }
    
    public abstract void setNext(Mensch r);
    
    public abstract Mensch getNext();
    
    public abstract Mensch töteMensch(String name);
    
}
