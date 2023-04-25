
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Units.Crossbowman;
import Units.Monk;
import Units.Names;
import Units.Peasant;
import Units.Sniper;
import Units.Spearman;
import Units.Thief;
import Units.Unit;
import Units.XBowMan;

public class Main {
    public static void main(String[] args) {
        //Peasant peasant = new Peasant("Петя");
        //Thief thief = new Thief("Толя");
        //Sniper sniper = new Sniper("Саша");
        //Spearman spearman = new Spearman("Олег");
        //Crossbowman crossbowman = new Crossbowman("Коля");
        //Monk monk = new Monk("Витя");
        //XBowMan xbowman = new XBowMan("Иван");
        //System.out.println(peasant);
        //System.out.println(thief);
        //System.out.println(sniper);
        //System.out.println(spearman.getInfo());
        //System.out.println(crossbowman);
        //System.out.println(monk);
        //System.out.println(xbowman.getInfo());

        ArrayList<Unit> team1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch(new Random().nextInt(3)){
                case 0:
                team1.add(new Peasant(getName(), team1));
                break;
                case 1:
                team1.add(new Spearman(getName(), team1));
                break;
                case 2:
                team1.add(new Crossbowman(getName(), team1));
                break;
                case 3:
                team1.add(new Crossbowman(getName(), team1));
                break;
                case 4:
                team1.add(new XBowMan(getName(), team1));
                break;
            }
        }
        //System.out.println("[Команда 1]");
        //team1.forEach(n -> System.out.println(n.getInfo()));
        //System.out.println();

        ArrayList<Unit> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch(new Random().nextInt(3)){
                case 0:
                team2.add(new Thief(getName(), team2));
                break;
                case 1:
                team2.add(new Sniper(getName(), team2));
                break;
                case 2:
                team2.add(new Monk(getName(), team2));
                break;
                case 3:
                team2.add(new Crossbowman(getName(), team2));
                break;
                case 4:
                team2.add(new XBowMan(getName(), team2));
                break;
            }
        }

        ArrayList<Unit> team3 = new ArrayList<Unit>();
        team3.addAll(team1);
        team3.addAll(team2);
        team3.sort(new Comparator<Unit>() {
           
            @Override
            public int compare(Unit o1, Unit o2) {
                return o2.speed - o1.speed;
            }
            
        });
        //System.out.println("[Команда 2]");
        //team2.forEach(n -> System.out.println(n.getInfo()));
        //System.out.println();
        
        team3.forEach(n -> n.getDmage(2));

        System.out.println("[Команда 1]");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("[Команда 2]");
        team2.forEach(n -> System.out.println(n.getInfo()));

        System.out.println("\n[Инициатива]");
        System.out.println(team3);

        System.out.println("-".repeat(15));
        team3.forEach(n -> n.step());
        System.out.println("\n[Команда 1]");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\n[Команда 2]");
        team2.forEach(n -> System.out.println(n.getInfo()));
    }


    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    } 
}