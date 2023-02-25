package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

public class Arrow extends Unit { // Стрелок

    int cartriges, distance;

    public Arrow(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int cartriges, int distance, int x, int y) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y);
        this.cartriges = cartriges;
        this.distance = distance;
    }
}
