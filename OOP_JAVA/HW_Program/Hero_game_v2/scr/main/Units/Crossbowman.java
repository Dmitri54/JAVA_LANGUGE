package OOP_JAVA.HW_Program.Hero_game_v2.scr.main.Units;

import java.util.ArrayList;


public class Crossbowman extends Shooter{ // Арбалетчик

    public Crossbowman(String name, int x, int y) {
        super(name, 4, 10, 3, 2, 3, x, y, 6, 16);
    }


    @Override
    public void step(ArrayList<Unit> t1, ArrayList<Unit> t2) {
        super.step(t1, t2);
    }


    @Override
    public String getInfo() {
        return "Арбалетчик";
    }
}