package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

import java.util.ArrayList;

public class Farmer extends Human {
    protected int cartridges;
    protected Farmer(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
                  int speed, int cartridges, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.cartridges = cartridges;
    }
    public Farmer(String name, Vector2D coords) {
        super(name, 50.f, 50, 1, 1, 1, 1,
                3, coords.posX, coords.posY);
        this.cartridges = 1;
    }

    @Override
    public void step (ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die")) state = "Stand";
    }

    
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Farmer.super.name)
                .append("\t| ATK:\t").append(Farmer.super.attack)
                .append("\t| HP:\t").append(Farmer.super.hp)
                .append(" \t| Arrows: ").append(Farmer.this.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(Farmer.super.coords.posX).append(".").append(Farmer.super.coords.posY);
    }
}
