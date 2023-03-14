package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

import java.util.ArrayList;

public class Monk extends Mag{
    
    public Monk(String name, Vector2D coords) {
        super(name, 50.f, 50, 10, -7, -7, 3,
                7, 5 ,5, coords.posX, coords.posY);

    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        super.step(team1, team2); // Так будет выполняться step описанный в классе Mag.
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attack)
                .append("\t| HP:\t").append(Monk.super.hp)
                .append(" \t| MP:\t").append(Monk.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.coords.posX).append(".").append(Monk.super.coords.posY);
    }
}
