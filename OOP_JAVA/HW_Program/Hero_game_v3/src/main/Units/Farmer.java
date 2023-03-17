package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

import java.util.ArrayList;

public class Farmer extends Unit {
    protected int cartridges;
    protected Farmer(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int cartridges, int x, int y) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, x, y);
        this.cartridges = cartridges;
    }
    public Farmer(String name, Vector2D pos) {
        super(name, 50.f, 50, 1, 1, 1, 1,
                3, pos.x, pos.y);
        this.cartridges = 1;
    }

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) { // Д/з урок 5
        if (state.equals("Die")) {hp = 0; return;}
        if (!state.equals("Die")) state = "Stand";
        System.out.println("Фермер " + name + " освободился");
    }

    @Override
    public String getInfo() {
        return "Фермер";
    }
}
