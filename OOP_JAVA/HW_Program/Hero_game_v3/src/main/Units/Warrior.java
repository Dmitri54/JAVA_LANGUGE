package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

public abstract class Warrior extends Unit {

    public Warrior(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
            int speed, int x, int y) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, x, y);
    
    }
    
}
