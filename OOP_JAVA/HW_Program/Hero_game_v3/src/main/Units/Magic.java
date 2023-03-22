package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

import java.util.ArrayList;

public abstract class Magic extends Unit {

    protected boolean magic;

    protected Magic(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed,
             boolean magic, int x, int y) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, x, y);
        this.magic = magic;

    }
    
    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        if (state.equals("Die")) {hp = 0; return;}
        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).hp < team1.get(i).maxHp){
                team1.get(i).getDamage(damageMax);
                System.out.println(name + " " + getInfo() + "  ->  " + team1.get(i).name + " " + team1.get(i).getInfo());
                break;
            }
        }

    }

    @Override
    public String toString() {
        return "\uD83E\uDDD9" +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) + " " +
                state;
    }
    
}
