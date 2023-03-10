package OOP_JAVA.HW_Program.Hero_game_v2.scr.main.Units;


public class Outlaw extends Warrior { // Вне закона, разбойник, бандит.


    public Outlaw(String name, int x, int y) {
        super(name, 6, 10, 3, 2, 4, x, y, 8);
    }



    @Override
    public String getInfo() {
        return "Разбойник";
    }


}
