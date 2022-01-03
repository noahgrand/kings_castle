package intern.schu.patterns.Essen;

import java.util.List;

import intern.schu.patterns.Interface.IEssen;
import intern.schu.patterns.Interface.IPizzaWrapper;

public class Küche implements IEssen {

    private EssenMediator em;
    
    @Override
    public void setMediator(EssenMediator em) {
        this.em = em;
    }
    
    public void bestellePizza(List<String> toppingList) {
        
        IPizzaWrapper finalPizza = new PizzaMargherita();
        for(String s : toppingList) {
            IPizzaWrapper tempPizza = finalPizza;
            finalPizza = em.belege(s, tempPizza);
        }
        
        finalPizza.printBelag("");
        
    }
    
    public void bestelleNudeln(String nudeln, String saucen) {
       em.bestellePasta(nudeln).setSauce(saucen).cookPasta(); 
    }
    
    
    

    
    
}
