package intern.schu.patterns.Bekleidnug;

import intern.schu.patterns.Interface.IRüstungsModifikator;

public class Glücksmodifikator implements IRüstungsModifikator{

    @Override
    public int berechneLeben(int urspLeben) {
        return 2*urspLeben;
    }

}
