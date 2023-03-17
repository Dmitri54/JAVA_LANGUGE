package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

import java.util.ArrayList;

public abstract class Magic extends Unit {

    protected int mana;
    protected int maxMana;

    protected Magic(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed,
             int mana, int maxMana, int x, int y) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, x, y);
        this.mana = mana;
        this.maxMana = maxMana;

    }

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        for (Unit human : team1) {
            if(human.hp < human.maxHp) {
                human.getDamage(damageMax);
                break;
            }
            
        }
    }
    
    
}
