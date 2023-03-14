package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

import java.util.ArrayList;

public class Crossbowman extends Arrow { // Арбалетчик
 

    public Crossbowman(String name) {
        super(name, 10, 10, 6, 2, 3, 3, 4, 0, 0, 16, );

    }

    public Crossbowman(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int x, int y, int cartriges, int distance, int concentration, boolean keepInLine) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, x, y, cartriges, distance);

    }

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {super.step(team1, team2);; }

    @Override
    public String getInfo() {
        return "Арбалетчик ";
    }

    public void shoot(){ // Выстрел

    }

    public void  needHelp(){ // Нужна помощь

    }
}
