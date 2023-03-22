package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

import java.util.ArrayList;

public class Mag extends Magic{ // Колдун, Волшебник

    public Mag(String name, Vector2D pos) {
        super(name, 30, 30, 17, -5, -5, 12, 9, true, pos.x, pos.y);
    }

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        super.step(team1, team2);
    }

    @Override
    public String getInfo() {
        return "Волшебник";
    }

}
