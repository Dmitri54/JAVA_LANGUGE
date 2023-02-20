package OOP_JAVA.lessons.les_02.Ex003;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import OOP_JAVA.lessons.les_02.Ex003.*;
import OOP_JAVA.lessons.les_02.Ex003.alliance.*;


public class Program {
    public static void main(String[] args) {

        // #region teams
        // Когда героев становится больше

        // int teamCount = 10;
        // Random rand = new Random();

        // List<BaseHero> teams = new ArrayList<>();
        // for (int i = 0; i < teamCount; i++) {
        //     int val = rand.nextInt(4);
        //     switch (val) {
        //         case 0:
        //             teams.add(new Priest());
        //             break;
        //         case 1:
        //             teams.add(new Magician());
        //             break;
        //         case 2:
        //             // teams.add(new Druid());
        //             teams.add(new Human());
        //             break;
        //         default:
        //             // teams.add(new BaseHero());
        //             break;
        //     }
        //     // System.out.println(teams.get(i).getInfo());
        // }

        // // System.out.println();

        // // #endregion

        // // #region ToDo BaseHero

        // // BaseHero hero = new BaseHero();
        // // System.out.println(hero.getInfo());
        // // ToDo BaseHero
        Priest priest = new Priest();
        System.out.println(priest.getInfo());
        Druid druid = new Druid();
        // BaseHero druid = new Druid(); 
// В качестве базового класса может выступать BaseHero, т.к. класс Druid наследник BaseHero.
// Но тогда нужно переписать некоторое поведение (методы).
        System.out.println(druid.getInfo());
        Magician magician = new Magician();
        System.out.println(magician.getInfo());

        priest.attack(magician);
        System.out.println(magician.getInfo());
        priest.attack(magician);
        System.out.println(magician.getInfo());
        druid.healing(magician); // Подчеркивает красным, нужно кастануть к Druid.
        // ((Druid)(druid)).healing(magician); // Вот так.

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

        // #region
        BaseHero dh = new Druid();
        /*BaseHero*/
        Dwarf dwarf = new Dwarf();
        dwarf.dwarf_method();
        ((Dwarf)dwarf).dwarf_method();
        System.out.println(dwarf.name);
        // #endregion

// Могу использовать, для экземпляра Dwarf, могу использовать в качестве базового типа класс Druid и так 
// же можно использовать базовый тип BaseHero.

    }
}
