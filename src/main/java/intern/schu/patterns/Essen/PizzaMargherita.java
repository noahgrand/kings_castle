package intern.schu.patterns.Essen;

import intern.schu.patterns.Interface.IEssen;
import intern.schu.patterns.Interface.IPizzaWrapper;

public class PizzaMargherita implements IPizzaWrapper, IEssen{

    private EssenMediator em;
    
    @Override
    public void printBelag(String belag) {
        System.out.println("Pizza margherita" + belag);
        
    }

    @Override
    public void setMediator(EssenMediator em) {
        this.em = em;
        
    }



}
