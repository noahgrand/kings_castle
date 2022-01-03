package intern.schu.patterns.Feld;

import intern.schu.patterns.Interface.IGenerator;

public class Polargenerator implements IGenerator{

    @Override
    public String[][] generiereBaum() {
        String[][]feld = {
                {" "," ","*"," "," "},
                {" ","*","*","*"," "},
                {"*","*","*","*","*"},
                {" ","|"," ","|"," "},
                {"_","|"," ","|","_"}
        };
        
        return feld;
    }

    @Override
    public String[][] generiereTier() {
        String[][]feld = {
                {" "," "," "," "," "},
                {"{","o",",","o","}"},
                {"/",")","_",")"," "},
                {" ","\""," ","\""," "},
                {"_","_","_","_","_"}
        };
        
        return feld;
        
    }
    
    

}
