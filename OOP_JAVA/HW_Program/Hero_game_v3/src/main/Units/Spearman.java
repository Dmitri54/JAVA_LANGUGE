package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

public class Spearman extends Warrior{ // Копейщик


    public Spearman(String name, Vector2D pos){
        super(name, 10, 10, 4, 1, 3, 5, 4, pos.x, pos.y); 
    }


    @Override
    public String getInfo() {
        return "Копейщик";
    }


}
