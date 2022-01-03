package intern.schu.patterns.Feld;

import java.util.Arrays;
import java.util.List;

import intern.schu.patterns.Interface.IGenerator;

public class FieldDrawer {

     private DefaultGenerator dg = new DefaultGenerator();
     
     
     public void addDrawing(List<String> drawing, IGenerator generator) {
         for (String s : drawing) {
             switch (s) {
                 case "leer":
                     dg.addBlock(dg.generiereBoden());
                     break;
                 case "tier":
                     dg.addBlock(generator.generiereTier());
//                     addDrawing(Arrays.asList("leer"), generator);
                     break;
                 case "baum":
                     dg.addBlock(generator.generiereBaum());
                     addDrawing(Arrays.asList("leer"), generator);
                     break;
                 case "boss1":
                     dg.addBlock(Bossgenerator.generiereBoss1());
                     addDrawing(Arrays.asList("leer"), generator);
                     break;
                 case "boss2":
                     dg.addBlock(Bossgenerator.generiereBoss21());
                     dg.addBlock(Bossgenerator.generiereBoss22());
                     addDrawing(Arrays.asList("leer"), generator);
                     break;
                 case "boss3":
                     dg.addBlock(Bossgenerator.generiereBoss31());
                     dg.addBlock(Bossgenerator.generiereBoss32());
                     addDrawing(Arrays.asList("leer"), generator);
                     break;
             }
         }
     }
     
     public void printDrawing() {
         dg.printFeld();
     }
     
     public DefaultGenerator getDg() {
         return dg;
     }
    
}
