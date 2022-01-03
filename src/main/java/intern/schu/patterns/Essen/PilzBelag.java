package intern.schu.patterns.Essen;

import intern.schu.patterns.Interface.IEssen;
import intern.schu.patterns.Interface.IPizzaWrapper;

public class PilzBelag implements IPizzaWrapper, IEssen{

    private IPizzaWrapper parent;
    
    private EssenMediator em;
    
    public PilzBelag(IPizzaWrapper ipw) {
        parent = ipw;
    }
    
    @Override
    public void printBelag(String belag) {
        parent.printBelag(belag + " mit Pilzen");
        
    }

    @Override
    public void setMediator(EssenMediator em) {
        this.em = em;
    }

}
