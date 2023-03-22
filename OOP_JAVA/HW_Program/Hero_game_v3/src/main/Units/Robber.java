package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

public class Robber extends Warrior { // Разбойник


    public Robber(String name, Vector2D pos){
        super(name, 10, 10, 8, 2, 4, 3, 6, pos.x, pos.y);
    }

    @Override
    public String getInfo() {
        return "Разбойник";
    }

}
