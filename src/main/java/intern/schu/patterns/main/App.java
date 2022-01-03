package intern.schu.patterns.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import intern.schu.patterns.Bogen;
import intern.schu.patterns.Fernkampfritter;
import intern.schu.patterns.König;
import intern.schu.patterns.Nahkampfritter;
import intern.schu.patterns.ProxyGarderobe;
import intern.schu.patterns.Schwert;
import intern.schu.patterns.Bekleidnug.Mensch;
import intern.schu.patterns.Endboss.Boss;
import intern.schu.patterns.Endboss.Level1Command;
import intern.schu.patterns.Endboss.Level2Command;
import intern.schu.patterns.Endboss.Level3Command;
import intern.schu.patterns.Essen.EssenMediator;
import intern.schu.patterns.Essen.Küche;
import intern.schu.patterns.Feld.FieldDrawer;
import intern.schu.patterns.Feld.Polargenerator;
import intern.schu.patterns.Feld.Regenwaldgenerator;
import intern.schu.patterns.Interface.ICommand;
import intern.schu.patterns.Interface.IGenerator;
import intern.schu.patterns.model.Kaserne;
import intern.schu.patterns.model.Ritterator;

public class App 
{
    public static void main( String[] args )
    {
//        firstPatterns();
        
//        secondPatterns();
        
//          thirdPatterns();
            
            animate();
       
    }
    
    private static void firstPatterns() {
       König könig = König.getInstance();
       Kaserne kaserne = Kaserne.getInstance();
       
       Bogen bogen = new Bogen();
       Schwert schwert = new Schwert();
       
       Mensch peterNah = new Nahkampfritter(schwert, "Hans", 100,0);
       Fernkampfritter marieFern = new Fernkampfritter(bogen, "Marie", 80,1);
       
       kaserne.addRitter(peterNah);
       kaserne.addRitter(marieFern);
       
//       peterNah.töteRitter("Marie");
       
       System.out.println(marieFern.getName()+" : "+ marieFern.getLeben());
       
       
//       Zustand fröhlich = new Fröhlich();
//       Zustand wütend = new Wütend();
//       System.out.println("------------------\n FRÖHLICH \n-----------------");
//       könig.regieren(fröhlich);
//       System.out.println("------------------\n WÜTEND \n-----------------");
//       könig.regieren(wütend);
    }
    
    private static void secondPatterns() {
       Kaserne k = Kaserne.getInstance();
       Mensch nahkaRitter = new Nahkampfritter(new Bogen(), "Mert", 50, 0);
       ProxyGarderobe pg = new ProxyGarderobe();
       pg.betreten();
       pg.kleiden(Arrays.asList("Helm", "Helm"), nahkaRitter);
       nahkaRitter.getOutfit().getKleidungsListe().forEach(e -> e.bekleiden(nahkaRitter));
       System.out.println(nahkaRitter.getName()+" : "+ nahkaRitter.getLeben());
       
       for(int i =0; i<100;i++) {
           k.addRitter(Kaserne.getInstance().generateRitter("peter"+i));
       }
       k.addRitter(nahkaRitter);
       ICommand c = new Level1Command();
       Boss b = new Boss(c);
       for(int  i = 0;i<100;i++) {
           b.schlagen();
       }
       Iterator<Mensch> r = new Ritterator(Kaserne.getInstance().firstRitter);
       HashMap<String, Integer> mappp = new HashMap<String, Integer>();
       int counter = 0;
       while(r.hasNext()) {
           Mensch temp = r.next();
           counter++;
           mappp.put(temp.getName(), temp.getLeben());
       }
       System.out.println(counter);
       
       
       
               
    }
    
    private static void thirdPatterns() {

       Küche k = new Küche(); 
       k.setMediator(new EssenMediator());
       List<String>toppingList = Arrays.asList("pilz","salami", "schinken", "schinken");
//       k.bestellePizza(toppingList);
       
       k.bestelleNudeln("linguini", "Blut"); 
       
       
        
    }
    
    private static void animate() {
        IGenerator polarGenerator = new Regenwaldgenerator();
        FieldDrawer fd = new FieldDrawer();
        fd.addDrawing(Arrays.asList("leer", "leer", "baum","boss3"), polarGenerator);

        fd.printDrawing();
        for (int i = 0; i < 120; i++) {
            fd = new FieldDrawer();

            fd.addDrawing(Arrays.asList("leer", "leer", "baum"), polarGenerator);

            for (int j = 0; j < i; j++) {
                fd.getDg().addSingeColumn();
            }
            fd.addDrawing(Arrays.asList("boss3"), polarGenerator);
            for (int z = 0; z < 500; z++) {
                fd.getDg().addSingeColumn();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fd.printDrawing();
            System.out.println("\n");
        }

    }

}
