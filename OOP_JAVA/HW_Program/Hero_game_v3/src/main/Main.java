package OOP_JAVA.HW_Program.Hero_game_v3.src.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units.*;



public class Main {
    static final int UNITS = 10;
    public static ArrayList<Unit> holyTeam = new ArrayList<>(); 
    public static ArrayList<Unit> darkTeam = new ArrayList<>();
    public static ArrayList<Unit> allTeam = new ArrayList<>();
    static int dieHolyTeam = 0;
    static int dieDarkTeam = 0;
    
    public static void main (String[] args){

        // ArrayList<Unit> holyTeam = new ArrayList<>(); 
        // ArrayList<Unit> darkTeam = new ArrayList<>();
        // ArrayList<Unit> allTeam = new ArrayList<>();

        Scanner user_input = new Scanner(System.in);
        System.out.println("Press Enter to bigen.");
        user_input.nextLine(); 
        
        createTeam(holyTeam, 0, 1);
        createTeam(darkTeam, 3, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortTeam(allTeam);
    
        while (true){
            View.view();
            user_input.nextLine();
            for (Unit unit: allTeam) {
                if (holyTeam.contains(unit)) unit.step(holyTeam, darkTeam);
                else unit.step(darkTeam, holyTeam);
            }
            for (Unit unit: holyTeam) {
                if (unit.getState() == "Die") dieHolyTeam++;
            }
            if (dieHolyTeam == 10){
                System.out.println("*******************************************Green winner!*******************************************");
                break;
            } else dieHolyTeam = 0;
            for (Unit unit: darkTeam) {
                if (unit.getState() == "Die") dieDarkTeam++;
            }
            if (dieDarkTeam == 10){
                System.out.println("*******************************************Blue winner!*******************************************");
                break;
            } else dieDarkTeam = 0;

        }

    }
    static void createTeam (ArrayList<Unit> team, int offset, int y) {
        for (int i = 0; i <= UNITS; i++) {
            int rnd = new Random().nextInt(4) + offset;
            switch (rnd) {
                case (0):
                    team.add(new Sniper(getName(), new Vector2D(i, y)));
                    break;
                case (1):
                    team.add(new Robber(getName(), new Vector2D(i, y)));
                    break;
                case (2):
                    team.add(new Mag(getName(), new Vector2D(i, y)));
                    break;
                case (3):
                    team.add(new Farmer(getName(), new Vector2D(i, y)));
                    break;
                case (4):
                    team.add(new Crossbowman(getName(), new Vector2D(i, y)));
                    break;
                case (5):
                    team.add(new Monk(getName(), new Vector2D(i, y)));
                    break;
                case (6):
                    team.add(new Spearman(getName(), new Vector2D(i, y)));
                    break;
            }
        }
    }
    static void sortTeam (ArrayList<Unit> team){
        team.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit team1, Unit team2) {
                if (team2.getSpeed() == team1.getSpeed()) {
                    return (int) (team2.getHp() - team1.getHp());
                }
                return (int) (team2.getSpeed() - team1.getSpeed());
            }
            
        });
    }
    static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }

}

