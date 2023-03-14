package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

import java.util.ArrayList;

public class Arrow extends Unit { // Стрелок

    protected int cartriges, distance;

    protected Arrow(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int x, int y, int cartriges, int distance) {
        super(name, hp, maxHp, attack, damageMin, damageMax, speed, defense, x, y);
        this.cartriges = cartriges;
        this.distance = distance;
    }

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2 ){
        if (state.equals("Die") || cartriges == 0) return;

        Unit victim = team2.get(findNearest(team2));
        float damage = (victim.defense - attack) > 0 ? damageMin : (victim.defense - attack) < 0 ? damageMax : (damageMin + damageMax) / 2;
        victim.getDamage(damage);
        for (Unit unit : team1) {
            if (unit.getInfo().toString().split(":")[0].equals("Фермер") && unit.state.equals("Stand")){
                unit.state = "Busy";
                return;
            }
        }
        cartriges--;
    }

    @Override
    public String toString() {
        return name +
                " H:" + defense +
                " D:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) +
                " Shots:" + cartridges +
                state;
    }

}
