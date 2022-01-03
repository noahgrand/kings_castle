package intern.schu.patterns.Endboss;

import intern.schu.patterns.Interface.ICommand;
import intern.schu.patterns.model.Kaserne;

public class Level2Command implements ICommand{
    
    public void schlagen() {
       int res = Münze.werfeMünze();
       if(res == 0) {
           Kaserne.getInstance().schadeRitter(50);
       }else {
           if(!Kaserne.getInstance().firstRitter.getOutfit().getKleidungsListe().isEmpty()) {
          Kaserne.getInstance().firstRitter.getOutfit().löscheOutfit();
        System.out.println("Das outfit von: "+Kaserne.getInstance().firstRitter.getName()+" wurde gelöscht");
           }else {
               Kaserne.getInstance().schadeRitter(50);
           }
       }
    }

}
