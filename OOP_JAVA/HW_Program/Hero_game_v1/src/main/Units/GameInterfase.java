package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

import java.util.ArrayList;

public interface GameInterfase {
    StringBuilder getInfo();
    void step(ArrayList<Human> team1, ArrayList<Human> team2);

}
