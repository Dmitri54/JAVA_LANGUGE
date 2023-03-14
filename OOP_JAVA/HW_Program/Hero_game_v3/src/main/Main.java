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
                    team.add(new Witch(getName(), new Vector2D(i + 1, y)));
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

    //     Farmer fermer = new Farmer("Миха");
    //     System.out.println(fermer.getInfo());
        
    //     ArrayList<Unit> arrayList1 = new ArrayList<>();
    //     arrayList1.sort(new Comparator<Unit>() {
    //         @Override
    //         public int compare(Unit o1, Unit o2) {
    //             return o1.getSpeed() - o2.getSpeed();
    //         }
    //     });

    //     for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей
    //         Unit.createArreyUnit1(arrayList1, Unit.setClass());
    //     }

    //     System.out.println("Команда 1:");

    //     for (int i = 0; i < arrayList1.size(); i++) {

    //         System.out.print(arrayList1.get(i).getInfo());
    //     }

    //     ArrayList<Unit> arrayList2 = new ArrayList<>();

    //     for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей
    //         Unit.createArreyUnit2(arrayList2, Unit.setClass());
    //     }
    //     System.out.println();
    //     System.out.println("Команда 2:");


    //     for (int i = 0; i < arrayList2.size(); i++) {
    //         System.out.print(arrayList2.get(i).getInfo());
    //     }

    //     ArrayList arreyAll = new ArrayList<>(arrayList1);

    //     for (int i = 0; i < arrayList2.size(); i++) {
    //         arreyAll.add(arrayList2.get(i));
    //     }

    //     arreyAll.sort(new Comparator<Unit>() {
    //         @Override
    //         public int compare(Unit o1, Unit o2) {
    //             if (o2.getSpeed() == o1.getSpeed()) {
    //                 return o1.getHp() - o2.getHp();
    //             }
    //             return o2.getSpeed() - o1.getSpeed();
    //         }
    //     });

    //     System.out.println();
    //     System.out.println(arreyAll);

}

