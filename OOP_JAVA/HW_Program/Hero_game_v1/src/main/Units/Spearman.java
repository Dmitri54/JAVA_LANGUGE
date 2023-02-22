package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

public class Spearman extends Unit{ // Копейщик

    protected boolean keepInLine; // Держать строй

    public Spearman(String name){
        super(name, 80, 1, 50, false, 12, 80, 5, 10, 30);
        this.keepInLine = false;
    }

    public Spearman(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, boolean keepInLine) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax);
        this.keepInLine = keepInLine;
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я, копейщик! ";
    }

    public void needHelp(){ // Нужна помощь

    }

    public void capture(){ // Захват территории

    }

}
