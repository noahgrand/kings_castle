package intern.schu.patterns.Feld;

public class Bossgenerator {

    public static String[][] generiereBoss1() {
        String[][]feld = {
                {" ","_","_","_"," "},
                {"/"," ","°","°","\\"},
                {"|"," ","_","_","|"},
                {"\\","_","_","_","/"},
                {" ","|","^","|"," "},
        };
        
        return feld;
    }
    
    public static String[][] generiereBoss22() {
        String[][]feld = {
                {"_","_"," "," "," "},
                {"_","*",")"," "," "},
                {"_","]",">"," "," "},
                {" ","_","\\"," "," "},
                {"°","°","°","°","°"},
        };
        
        return feld;
    }
    
    public static String[][] generiereBoss21(){
        String[][]feld = {
                {" "," "," "," ","_"},
                {" "," "," ","(","*"},
                {" "," ","\\","[","_"},
                {" ","_","/"," "," "},
                {"°","°","°","°","°"},
        };
        
        return feld;
    }
    
    public static String[][] generiereBoss31() {
        String[][]feld = {
                {" "," "," "," "," "},
                {" ","_",".","-","."},
                {"/","`","\\","\"","/"},
                {"|","\\","_","_","_"},
                {"\\","|"," "," "," "}
        };
        
        return feld;
    }
    

    public static String[][] generiereBoss32() {
        String[][]feld = {
                {" "," "," "," "," "},
                {"_"," "," "," "," "},
                {"-","\\"," "," "," "},
                {"/","|"," "," "," "},
                {"|","/","_","_","_"}
        };
        
        return feld;
    }

}
