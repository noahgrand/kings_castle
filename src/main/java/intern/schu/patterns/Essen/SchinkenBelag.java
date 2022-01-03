package intern.schu.patterns.Essen;

import intern.schu.patterns.Interface.IEssen;
import intern.schu.patterns.Interface.IPizzaWrapper;

public class SchinkenBelag implements IPizzaWrapper, IEssen{

    private EssenMediator em;
    
    private IPizzaWrapper parent;

    public SchinkenBelag(IPizzaWrapper ipw) {
        parent = ipw;
    } 
    
    @Override
    public void printBelag(String belag) {
       parent.printBelag(belag + " mit Schinken"); 
        
    }

    @Override
    public void setMediator(EssenMediator em) {
        this.em = em;
        
    }

}
