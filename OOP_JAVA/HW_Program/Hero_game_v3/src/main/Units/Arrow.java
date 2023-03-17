package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

import java.util.ArrayList;

public class Arrow extends Unit { // Стрелок

    protected int cartridges, range;

    protected Arrow(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int x, int y, int cartridges, int range) {
        super(name, hp, maxHp, attack, damageMin, damageMax, speed, defense, x, y);
        this.cartridges = cartridges;
        this.range = range;
    }

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2 ){
        if (state.equals("Die")) {hp = 0; return;}
        if (state.equals("DIe") || cartridges == 0) return;
        Unit victim = team2.get(findNearest(team2));

        float damage = (victim.defense - attack > 0) ? damageMin : (victim.defense - attack < 0) ? damageMax : ( (damageMax+damageMin) / 2);
                victim.getDamage(damage);

        for (int i = 0; i < team1.size(); i++) {
            if (( team1.get(i).getInfo().equals("Фермер")) && team1.get(i).state.equals("Stand")){
                System.out.println("Фермер " + team1.get(i).name + " занят");
                team1.get(i).state = "Busy";
                return;
            }
        }
        cartridges --;
    }

        // if (state.equals("Die") || cartridges == 0) return; // 3.1 

        // Unit victim = team2.get(findNearest(team2)); // 3.2 
        // float damage = (victim.defense - attack) > 0 ? damageMin : (victim.defense - attack) < 0 ? damageMax : (damageMin + damageMax) / 2; // 3.3
        // victim.getDamage(damage);
        // for (Unit unit : team1) { // 3.4
        //     if (unit.getInfo().toString().split(":")[0].equals("Фермер") && unit.state.equals("Stand")){
        //         unit.state = "Busy";
        //         return;
        //     }
        // }
        // cartridges--; // 3.5 
    

    @Override
    public String toString() {
        return name +
                " H:" + defense +
                " D:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) +
                " Shots:" + cartridges + " " +
                state;
    }

}


// 3 Урок.
//  Реализовать метод step() лучников.
//    3.1 Если жизнь равна нулю или стрел нет, завершить обработку.
//    3.2 Поиск среди противников наиболее приближённого.
//    3.3 Нанести среднее повреждение найденному противнику.
//    3.4 Найти среди своих крестьянина.
//    3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.