package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

import java.util.ArrayList;

public abstract class Warrior extends Unit {

    public Warrior(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
            int speed, int x, int y) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, x, y);
    
    }
    
    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        if (state.equals("Die")) {hp = 0; return;}
        int target = findNearest(team2);
        if (target < 2) {
            float damage = (team2.get(target).defense - attack > 0) ?
                    damageMin : (team2.get(target).defense - attack < 0) ?
                    damageMax : ( (damageMax+damageMin) / 2);
                    team2.get(target).getDamage(damage);
            return;
        }
        moveToOpponent(target, team2);
    }

    void moveToOpponent(int target, ArrayList<Unit> team2){
        if (pos.onTheTop(team2.get(target).pos) & (pos.y != team2.get(target).pos.y)){
            pos.y++;
            return;
        } else if (!pos.onTheTop(team2.get(target).pos) & (pos.y != team2.get(target).pos.y)) {
            pos.y--;
            return;
        }
        if (pos.onTheLeft(team2.get(target).pos)) {
            pos.x++;
            return;
        } else if (!pos.onTheLeft(team2.get(target).pos)){
            pos.x--;
            return;
        }
    }

    @Override
    public String toString() {
        return "\uD83D\uDC82" +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) + " " +
                state;
    }
}
