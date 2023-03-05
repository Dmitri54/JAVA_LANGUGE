package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

import java.util.ArrayList;

public abstract class Shooter extends Human {
    protected int range;
    protected int cartridges;

    protected Shooter(String name, float hp, int maxHp, int attack, int damageMin,
                   int damageMax, int defense, int speed, int cartridges,
                   int range, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.range = range;
        this.cartridges = cartridges;
    }

//    Реализовать метод step() лучников.
//    3.1 Если жизнь равна нулю или стрел нет, завершить обработку.
//    3.2 Поиск среди противников наиболее приближённого.
//    3.3 Нанести среднее повреждение найденному противнику.
//    3.4 Найти среди своих крестьянина.
//    3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die") || cartridges == 0) return; // 3.1
        int target = findNearest(team2); // 3.2

        float damage = (team2.get(target).defense - attack > 0) ? 
        damageMin : (team2.get(target).defense - attack < 0) ? 
        damageMax : (damageMax+damageMin)/2;
        team2.get(target).getDamage(damage); // 3.3

        for (int i = 0; i < team1.size(); i++) { // 3.4
            if (team1.get(i).getInfo().toString().split(":")[0].equals("Фермер") && team1.get(i).state.equals("Stand")) {
                team1.get(i).state = "Busy";
                return;
            }
        }
        cartridges--;
    }

    // protected boolean findFarmer(ArrayList<Human> team) {
    //     ArrayList <Human> arrayFarmer = new ArrayList<>();
    //     for (int i = 0; i < team.size(); i++) {
    //         if (team.get(i).getClass() == Farmer.class) {
    //             if(((Farmer) team.get(i)).getCartridgesFarmer() > 0) {
    //                 arrayFarmer.add(team.get(i));
    //             }
    //         }
    //     }
    //     switch (arrayFarmer.size()) {
    //         case (0):
    //             return false;
    //         case (1):
    //             ((Farmer) arrayFarmer.get(0)).setCartridgesFarmer(0);
    //             return true;
    //         default:
    //             ((Farmer) arrayFarmer.get(findNearest(arrayFarmer))).setCartridgesFarmer(0);
    //             return true;
    //     }
    // }

}
