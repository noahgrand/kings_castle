package intern.schu.patterns.Essen;

import intern.schu.patterns.Interface.IEssen;
import intern.schu.patterns.Interface.IPizzaWrapper;

public class SalamiBelag implements IPizzaWrapper, IEssen{
    
    private IPizzaWrapper parent;
    
    private EssenMediator em;

    public SalamiBelag(IPizzaWrapper ipw) {
        parent = ipw;
    }

    @Override
    public void printBelag(String belag) {
        parent.printBelag(belag + " mit Salami");
        
    }

    @Override
    public void setMediator(EssenMediator em) {
        this.em = em;
        
    }
    
    

}
