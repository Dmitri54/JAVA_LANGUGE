package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

public class Monk extends Unit{ // Монах

    int motivation; // Мотивация
    int combatSkill; // Боевой навык

    public Monk(String name) {
        super(name, 100, 1, 100, false, 20, 100, 10, 10, 20);
        this.motivation = 10;
        this.combatSkill = 10;
    }

    public Monk(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int motivation, int combatSkill) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax);
        this.motivation = motivation;
        this.combatSkill = combatSkill;
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я, монах! ";
    }

    public void hit(){ // Удар

    }
    
    public void getMotivation(){ // Дать мотивацию

    }
}
