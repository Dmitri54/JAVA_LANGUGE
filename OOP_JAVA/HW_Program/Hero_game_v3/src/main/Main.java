package OOP_JAVA.HW_Program.Hero_game_v3.src.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units.*;



public class Main {
    static final int UNITS = 10;

    
    public static void main (String[] args){

        ArrayList<Unit> holyTeam = new ArrayList<>(); 
        ArrayList<Unit> darkTeam = new ArrayList<>();
        ArrayList<Unit> allTeam = new ArrayList<>();

        Scanner user_input = new Scanner(System.in);
        System.out.println("Press Enter to bigen.");
        user_input.nextLine(); 
        
        createTeam(holyTeam, 0, 1);
        createTeam(darkTeam, 3, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortTeam(allTeam);
    
        while (true){
            
            user_input.nextLine();
            for (Unit human: allTeam) {
                if (holyTeam.contains(human)) human.step(holyTeam, darkTeam);
                else human.step(darkTeam, holyTeam);
            }

        }

    }
    static void createTeam (ArrayList<Unit> team, int offset, int y) {
        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4)+offset;
            switch (rnd) {
                case (0):
                    team.add(new Sniper(getName(), new Vector2D(i + 1, y)));
                    break;
                case (1):
                    team.add(new Robber(getName(), new Vector2D(i + 1, y)));
                    break;
                case (2):
                    team.add(new Mag(getName(), new Vector2D(i + 1, y)));
                    break;
                case (3):
                    team.add(new Farmer(getName(), new Vector2D(i + 1, y)));
                    break;
                case (4):
                    team.add(new Crossbowman(getName(), new Vector2D(i + 1, y)));
                    break;
                case (5):
                    team.add(new Monk(getName(), new Vector2D(i + 1, y)));
                    break;
                case (6):
                    team.add(new Spearman(getName(), new Vector2D(i + 1, y)));
                    break;
            }
        }
    }
    static void sortTeam (ArrayList<Unit> team){
        team.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit team1, Unit team2) {
                if (team2.getSpeed() == team1.getSpeed()) return (int) (team2.getHp() - team1.getHp());
                else  return (int) (team2.getSpeed() - team1.getSpeed());
            }
        });
    }
    static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }

}

