package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

import java.util.ArrayList;

// import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.Human;

public abstract class Mag extends Human {

    protected int mana;
    protected int maxMana;

    public Mag(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
               int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        for (Human human : team1) {
            if(human.hp < human.maxHp) {
                human.getDamage(damageMax);
                break;
            }
            
        }
    } 



}
