package intern.schu.patterns.Bekleidnug;

import intern.schu.patterns.Interface.IRÃ¼stungsModifikator;

public class Pechmodifikator implements IRÃ¼stungsModifikator{

    @Override
    public int berechneLeben(int urspLeben) {
        return urspLeben / 4;
    }

}
