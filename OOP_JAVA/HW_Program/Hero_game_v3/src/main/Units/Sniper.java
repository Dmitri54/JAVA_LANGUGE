package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

import java.util.ArrayList;

public class Sniper extends Arrow { // Снайпер

    public Sniper(String name, Vector2D pos){
        super(name, 15, 15, 12, 8, 10, 10, 9, pos.x, pos.y, 15, 10);
        
    }

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        super.step(team1, team2);
    }

    @Override
    public String getInfo() {
        return "Снайпер! ";
    }

}
