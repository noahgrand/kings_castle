package intern.schu.patterns.Bekleidnug;

import intern.schu.patterns.Interface.IRüstungsModifikator;

public class Pechmodifikator implements IRüstungsModifikator{

    @Override
    public int berechneLeben(int urspLeben) {
        return urspLeben / 4;
    }

}
