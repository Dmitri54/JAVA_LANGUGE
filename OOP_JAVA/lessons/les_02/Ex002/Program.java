package OOP_JAVA.lessons.les_02.Ex002;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        // #region teams
        // abstract герой
        int teamCount = 10;
        Random rand = new Random();

        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    teams.add(new Priest());
                    break;
                case 1:
                    teams.add(new Magician());
                    break;
                case 2:
                    teams.add(new Druid());
                    break;
                // default:
                    // teams.add(new BaseHero()); // Выделен красным цветом.
// Возможность создания запрещена, т.к. в методе этого класса поставил слово abstract
// т.е. если я хочу ограничить создание экземпляров каково-то типа, то я пишу, слово abstract и этот
// класс будет абстрактный.
                    // break;
            }
            System.out.println(teams.get(i).getInfo());
        }

        System.out.println();

        // #endregion
        // #region

        // BaseHero hero = new BaseHero();
        // System.out.println(hero.getInfo());
        Priest priest = new Priest();
        System.out.println(priest.getInfo());
        Druid druid = new Druid();
        System.out.println(druid.getInfo());
        Magician magician = new Magician();
        System.out.println(magician.getInfo());

        priest.attack(magician);
        System.out.println(magician.getInfo());
        priest.attack(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician);
        System.out.println(magician.getInfo());

        // #endregion

    }
}
