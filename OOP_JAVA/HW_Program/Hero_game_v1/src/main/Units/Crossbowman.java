package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

public class Crossbowman extends Arrow { // Арбалетчик
 
    protected int concentration; // Концентрация
    protected boolean keepInLine; // Держать строй

    public Crossbowman(String name) {
        super(name, 
        100, 
        1, 
        100, 
        false, 
        10, 
        100, 
        10, 
        5, 
        20, 
        1, 
        1, 
        10, 5);
        this.concentration = 0;
        this.keepInLine = false;
    }

    public Crossbowman(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int cartriges, int distance, int concentration, boolean keepInLine) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y, cartriges, distance);
        this.concentration = concentration;
        this.keepInLine = keepInLine;
    }

    @Override
    public void step() {super.step(); }

    @Override
    public String getInfo() {
        return "Я, арбалетчик! ";
    }

    public void shoot(){ // Выстрел

    }

    public void  needHelp(){ // Нужна помощь

    }
}
