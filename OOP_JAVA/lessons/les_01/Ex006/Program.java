package OOP_JAVA.lessons.les_01.Ex006;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician(); // Создал мага
        System.out.println(hero1.getInfo()); // посмотрел информацию о нем.
        
        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

/**
 * Если я хочу наладить какое-то взоимодействие с этими персонажами.
 * Как это сделать?
 * Вот так - hero3.GetDamage(hero2.Attack());
 * Конечно это не корректро с точки логики.
 */

        hero3.GetDamage(hero2.Attack());
        hero3.GetDamage(hero3.Attack());
        System.out.println(hero3.getInfo());
        System.out.println(hero2.getInfo());
        //hero3.GetDamage(hero3.Attack()); // А так персонаж может ударить сам себя )))
    }
}

// 