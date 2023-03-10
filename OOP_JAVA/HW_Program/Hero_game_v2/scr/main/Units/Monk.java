package OOP_JAVA.HW_Program.Hero_game_v2.scr.main.Units;


public class Monk extends  Magic{


    public Monk(String name, int x, int y) {
        super(name, 5, 30, 7, -4, -4, x, y, 12, true);
    }



    @Override
    public String getInfo() {
        return "Монах";
    }
}
