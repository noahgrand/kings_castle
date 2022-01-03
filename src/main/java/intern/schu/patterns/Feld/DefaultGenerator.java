package intern.schu.patterns.Feld;

import java.util.ArrayList;
import java.util.List;

public class DefaultGenerator {

    
   private String linie4 = "";
   private String linie3 = "";
   private String linie2 = "";
   private String linie1 = "";
   private String linie0 = "";
   
   
    
    public String[][] generiereBoden(){
         String[][]feld = {
                {" "," "," "," "," "},
                {" "," "," "," "," "},
                {" "," "," "," "," "},
                {" "," "," "," "," "},
                {"_","_","_","_","_"}
        };
        
        return feld;
    }
    
    
    public void addBlock(String[][] input) {
        for(int i=0;i<5;i++) {
            linie0+=input[0][i];
        }
        for(int i=0;i<5;i++) {
            linie1+=input[1][i];
        }
        for(int i=0;i<5;i++) {
            linie2+=input[2][i];
        }
        for(int i=0;i<5;i++) {
            linie3+=input[3][i];
        }
        for(int i=0;i<5;i++) {
            linie4+=input[4][i];
        }
        

    }
    
    public void addSingeColumn() {
        linie4+="_";
        linie1+=" ";
        linie2+=" ";
        linie3+=" ";
        linie0+=" ";
    }
    
    public void printFeld() {
        System.out.println(linie0);
        System.out.println(linie1);
        System.out.println(linie2);
        System.out.println(linie3);
        System.out.println(linie4);
    }
}
