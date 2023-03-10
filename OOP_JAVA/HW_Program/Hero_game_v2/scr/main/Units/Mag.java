package OOP_JAVA.HW_Program.Hero_game_v2.scr.main.Units;

public class Mag extends Magic{


    public Mag(String name, int x, int y) {
        super(name, 9, 30, 12, -5, -5, x, y, 17, true);
    }

    @Override
    public String getInfo() {
        return "Волшебник";
    }

}
