package intern.schu.patterns.Interface;

import java.util.List;

import intern.schu.patterns.Bekleidnug.Mensch;

public interface IGarderobe {

    public void betreten();
    
    public void kleiden(List<String> kleidungsList, Mensch r);
}
