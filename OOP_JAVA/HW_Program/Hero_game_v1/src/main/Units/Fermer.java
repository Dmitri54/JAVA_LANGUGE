package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

public class Fermer extends Unit{ // Крестьянин
    int food;
    int cartriges; // Боеприпасы

    public Fermer(String name){
        super(name, 80, 1, 50, false, 12, 80, 5, 10, 30);
        this.food = 20;
        this.cartriges = 50;
    }

    public Fermer(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int food, int cartriges) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax);
        this.food = food;
        this.cartriges = cartriges;
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я фермер! ";
    }

    public int getCartriges() { // Дать боеприпасы
        return 10;
    }

    public int getFood() { // Дать еду
        return 10;
    }
}
