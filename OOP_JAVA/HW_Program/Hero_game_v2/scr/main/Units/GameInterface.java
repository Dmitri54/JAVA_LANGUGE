package OOP_JAVA.HW_Program.Hero_game_v2.scr.main.Units;

import java.util.ArrayList;

public interface GameInterface {

    default void step(ArrayList<Unit> t1, ArrayList<Unit> t2) {
    }


    String getInfo();
}
