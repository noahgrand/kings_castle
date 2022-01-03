package intern.schu.patterns.Endboss;

import intern.schu.patterns.Interface.ICommand;
import intern.schu.patterns.model.Kaserne;

public class Level1Command implements ICommand{
    
    public void schlagen() {
        int res = Münze.werfeMünze();
        if(res == 0) {
            Kaserne.getInstance().schadeRitter(25);
        }else {
            Kaserne.getInstance().schadeRitter(50);
        }
        
    }

}
