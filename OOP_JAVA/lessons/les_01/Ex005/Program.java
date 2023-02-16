package OOP_JAVA.lessons.les_01.Ex005;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());
        
        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

    }
}
/**
 * Что не так с этим кодом?
 * --------------------------------------------------------------------------------------------
 * Нарушает принцип "Don't repeat yourself!".
 * Тут одинаковая реализация персонажей и методов с разницей в одну строку elixir или mana.
 * Это плохо, т.к. персонаже может быть много и каждому выделять по 58 строк кода не нужно.
 * Как это решить?
 * Принцип наследования! 
 * Описываю общее состояние и поведение. 
 * Дальше при необходимости дополняю новый класс используя частично или быть может полностью
 * описанный ранее функционал.
 */

