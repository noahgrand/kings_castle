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
public class Fernkampfritter extends Mensch{
    
    private Mensch nextRitter;
    
    //?? Pattern
    private Outfit outfit;
    public void setOutfit(Outfit o) {this.outfit = o;}
    public Outfit getOutfit() {return outfit;}
   
    private Kampfart kampfart;  //Strategy pattern
    
    //Strategy Pattern
    public Fernkampfritter(Kampfart in, String name, int leben, int id) {
        super(name, leben, id);
        this.kampfart = in;
    }
    
    
    public void handeln(Ort ort) {
       //Strategy pattern
       kampfart.kämpfen();
       
       //Visitor Pattern
       ort.fernkampf(this); 
    }
    
    @Override
    public Mensch töteMensch(String name) {
        if(super.name.equals(name)) {
            leben = -1;
//            System.out.println("Der Mensch: "+ name + " ist gestorben");
            return this;
        }else {
            return nextRitter.töteMensch(name);
        }
        
    }
    @Override
    public void setNext(Mensch r) {
        nextRitter = r;
        
    }
    @Override
    public Mensch getNext() {
        return nextRitter;
    }
    
    public int getId() {
        return super.getId();
    }

}
