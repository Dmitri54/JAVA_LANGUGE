package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

import java.util.ArrayList;

public class Crossbowman extends Arrow { // Арбалетчик
 

    public Crossbowman(String name, Vector2D pos) {
        super(name, 10, 10, 6, 2, 3, 3, 4, pos.x, pos.y, 16, 10 );

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
