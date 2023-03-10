package OOP_JAVA.HW_Program.Hero_game_v2.scr.main.Units;


public class Spearman extends Warrior{


    public Spearman(String name, int x, int y) {
        super(name, 4, 10, 5, 1, 3, x, y, 4);
    }


    @Override
    public String getInfo() {
        return "Копейщик";
    }

}
