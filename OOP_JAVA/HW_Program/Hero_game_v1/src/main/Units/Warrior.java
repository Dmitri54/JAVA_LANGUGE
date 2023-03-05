package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

// import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.Human;

public abstract class Warrior extends Human {

    public Warrior(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
    }

}
