package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

public class Monk extends Magic{ // Монах

    public Monk(String name, Vector2D pos) {
        super(name, 30, 30, 12, -4, -4, 7, 5, true, pos.x, pos.y);
    }

    @Override
    public String getInfo() {
        return "Монах";
    }

}
