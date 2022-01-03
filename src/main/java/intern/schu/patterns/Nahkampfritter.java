package intern.schu.patterns;

import intern.schu.patterns.Bekleidnug.Mensch;
import intern.schu.patterns.Interface.Kampfart;
import intern.schu.patterns.Interface.Ort;
import intern.schu.patterns.model.Kaserne;

/***
 * Patterns: Visitor, Strategy
 * @author a814887
 *
 */

public class Nahkampfritter extends Mensch{
    
    private Mensch nextRitter;
    
    //?? Pattern
    private Outfit outfit;
    public void setOutfit(Outfit o) {this.outfit = o;}
    public Outfit getOutfit() {return outfit;}
    
    //Strategy Pattern
    private Kampfart kampfart; 
    
    //Strategy Pattern
    public Nahkampfritter(Kampfart in, String name, int leben, int id) {
        super(name, leben, id);
        this.kampfart = in;
    }

    public void handeln(Ort ort) {
       //Strategy Pattern
       kampfart.kämpfen();
       
       //Visitor Pattern
       ort.nahkampf(this); 
    }
    @Override
    public void setNext(Mensch r) {
        nextRitter = r;
        
    }
    @Override
    public Mensch getNext() {
        return nextRitter;
    }

    @Override
    public Mensch töteMensch(String name) {
        if(super.name.equals(name)) {
            super.leben = -1;
//            System.out.println("Der Mensch: "+ name + " ist gestorben");
            return this;
        }else {
            return nextRitter.töteMensch(name);
        }
        
    }
    
    public int getId(){
        return super.getId();
    }
    

}
