package intern.schu.patterns.Endboss;

import intern.schu.patterns.Interface.ICommand;
import intern.schu.patterns.model.Kaserne;

public class Boss {
    
    private ICommand command;
    
    public Boss(ICommand in) {
        this.command = in;
    }
    
    
    
    public void schlagen() {
        if (Kaserne.getInstance().firstRitter == null) {
            System.out.println("DU HAST VERLOREN!!!");
            return;
        }
        command.schlagen();
    }

}
