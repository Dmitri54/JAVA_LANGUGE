package OOP_JAVA.HW_Program.Hero_game_v2.scr.main.Units;

import java.util.ArrayList;


public class Farmer extends Unit{
    protected boolean delivery;


    public Farmer(String name, int x, int y) {
        super(name, 3, 1, 1, 1, 1, x, y, 1);
        this.delivery = true;
    }


    @Override
    public void step(ArrayList<Unit> t1, ArrayList<Unit> t2) {
        if (state.equals("Die")) {hp = 0; return;}
        if (!state.equals("Die")) state = "Stand";
        System.out.println("Фермер " + name + " освободился");
    }

    @Override
    public String getInfo() {
        return "Фермер";
    }


}
