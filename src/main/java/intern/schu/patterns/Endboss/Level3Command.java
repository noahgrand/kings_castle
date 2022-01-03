package intern.schu.patterns.Endboss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import intern.schu.patterns.Bekleidnug.Mensch;
import intern.schu.patterns.Interface.ICommand;
import intern.schu.patterns.model.Kaserne;
import intern.schu.patterns.model.Ritterator;

public class Level3Command implements ICommand{
    
    public void schlagen() {
       int res = Münze.werfeMünze();
       if(res == 0) {
           Kaserne.getInstance().schadeRitter(90);
       }else {
           List<String>nameList = new ArrayList();
           Iterator<Mensch>ritterator = new Ritterator(Kaserne.getInstance().firstRitter);
           nameList.add(Kaserne.getInstance().firstRitter.getName());
           while(ritterator.hasNext()) {
               nameList.add(ritterator.next().getName());
           }
           if(nameList.size()>0) {
               Kaserne.getInstance().removeRitter(Kaserne.getInstance().firstRitter.töteMensch(nameList.get(0)).getId());
           }
       }
    }

}
