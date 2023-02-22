package OOP_JAVA.HW_Program.Hero_game_v1.src.main;

import java.util.ArrayList;

import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.*;



public class Main {
    public static void main (String[] args){

        Fermer fermer = new Fermer("Миха");
        
        Robber robber = new Robber("Лысый");
        System.out.println(robber.getInfo());

        Sniper sniper = new Sniper("Серега");
        System.out.println(sniper.getInfo());

        Mag witch = new Mag("Антон");
        System.out.println(witch.getInfo());

        Spearman spearman = new Spearman("Егор");
        System.out.println(spearman.getInfo());

        Crossbowman crossbowman = new Crossbowman("Вова");
        System.out.println(crossbowman.getInfo());

        Monk monk = new Monk("Иосиф");
        System.out.println(monk.getInfo());

        System.out.println("\n10 случайных персонажей\n");

        ArrayList <Unit> arrayList1 = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей
            Unit.createArreyUnit1(arrayList1, Unit.setClass());
        }

        for (int i = 0; i < arrayList1.size(); i++) {

            System.out.print(arrayList1.get(i).getInfo());
        }      

    }

}



/**
 * Задача:
 * Доделать мою программу, чтобы можно было простым конструктором (только name) создавать экземпляры 
 * персонажей (Крестьянин * Разбойник * Снайпер * Колдун * Копейщик * Арбалетчик * Монах).
 * Добавить интерфейс в котором, будут описанно два метода (getInfo, step).  
 * Метод getInfo - реализовать и переопределить в каждом классе, чтобы он возвращал (Я "name class"!)
 * --------------------------------------------------------------------------------------------------
 * Доработать дерево классов так, чтобы экземпляры классов создавались конструктором с именем 
 * в параметре а остальные параметры инициализировали сами в зависимости от персонажа. 
 * Добавить файл интерфейса в котором описать два метода, void step(); и String getInfo(); 
 * Добавить реализацию интерфейса в ваш коренной абстрактный класс. 
 * Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер" и так далее 
 * в зависимости от типа персонажа. 
 * В основном классе создать список и добавить в него 10 случаных персонажей. 
 * Пройти по списку и вывести строку возвращаемую getInfo.
 */