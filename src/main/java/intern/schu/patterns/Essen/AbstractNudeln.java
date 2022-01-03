package intern.schu.patterns.Essen;

import intern.schu.patterns.Interface.IEssen;

public abstract class AbstractNudeln implements IEssen{
    
   protected EssenMediator em;
   
   public void cookPasta() {
       wasserKochen();
       wasserSalzen();
       addPasta();
       wartenBisAlDente();
       addSauce();
       servieren();
   }
    
   private void wasserKochen() {
       System.out.println("\n\n----------");
       System.out.println("Das Wasser kocht");
   }
   
   private void wasserSalzen() {
       System.out.println("Das Wasser wird gesalzt");
   }
   
   public abstract void addPasta(); 
   
   private void wartenBisAlDente() {
       System.out.println("Die Pasta ist am kochen");
   }
   
   public void addSauce() {
      System.out.println("Tomatensauce wird hinzugefügt"); 
   }
   
   private void servieren() {
       System.out.println("Die Pasta wird serviert");
   }
   
   public void setMediator(EssenMediator em) {
       this.em = em;
   }
   
   public abstract AbstractNudeln setSauce(String in);
       
       

}
