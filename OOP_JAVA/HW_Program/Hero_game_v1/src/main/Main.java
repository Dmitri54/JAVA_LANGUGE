package OOP_JAVA.HW_Program.Hero_game_v1.src.main;

import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.Crossbowman;
import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.Farmer;
import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.Human;
import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.Monk;
import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.Names;
import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.Robber;
import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.Sniper;
import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.Spearman;
import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.Vector2D;
import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.Witch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static final int UNITS = 10;

    public static void main(String[] args) {

        ArrayList<Human> holyTeam = new ArrayList<>();
        ArrayList<Human> darkTeam = new ArrayList<>();
        ArrayList<Human> allTeam = new ArrayList<>();
        Scanner user_input = new Scanner(System.in); 
        
        createTeam(holyTeam, 0, 1);
        createTeam(darkTeam, 3, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortTeam(allTeam);

        for (Human human: allTeam) {
            if (holyTeam.contains(human)) human.step(holyTeam, darkTeam);
            else human.step(darkTeam, holyTeam);
        }

        while (true){
            user_input.nextLine();

        }

    }
    static void createTeam (ArrayList team, int offset, int posY) {
        for (int i = 0; i <= UNITS; i++) {
            int rnd = new Random().nextInt(4)+offset;
            switch (rnd) {
                case (0):
                    team.add(new Sniper(getName(), new Vector2D(i, posY)));
                    break;
                case (1):
                    team.add(new Robber(getName(), new Vector2D(i, posY)));
                    break;
                case (2):
                    team.add(new Witch(getName(), new Vector2D(i, posY)));
                    break;
                case (3):
                    team.add(new Farmer(getName(), new Vector2D(i, posY)));
                    break;
                case (4):
                    team.add(new Crossbowman(getName(), new Vector2D(i, posY)));
                    break;
                case (5):
                    team.add(new Monk(getName(), new Vector2D(i, posY)));
                    break;
                case (6):
                    team.add(new Spearman(getName(), new Vector2D(i, posY)));
                    break;
            }
        }
    }
    static void sortTeam (ArrayList<Human> team){
        team.sort(new Comparator<Human>() {
            @Override
            public int compare(Human t0, Human t1) {
                if (t1.getSpeed() == t0.getSpeed()) return (int) (t1.getHp() - t0.getHp());
                else  return (int) (t1.getSpeed() - t0.getSpeed());
            }
        });
    }
    static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
}
