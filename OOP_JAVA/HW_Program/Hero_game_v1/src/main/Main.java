package OOP_JAVA.HW_Program.Hero_game_v1.src.main;


import java.util.ArrayList;
import java.util.Comparator;

import OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units.*;



public class Main {
    public static void main (String[] args){

        Fermer fermer = new Fermer("Миха");
        System.out.println(fermer.getInfo());
        
        ArrayList<Unit> arrayList1 = new ArrayList<>();
        arrayList1.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });

        for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей
            Unit.createArreyUnit1(arrayList1, Unit.setClass());
        }

        System.out.println("Команда 1:");

        for (int i = 0; i < arrayList1.size(); i++) {

            System.out.print(arrayList1.get(i).getInfo());
        }

        ArrayList<Unit> arrayList2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей
            Unit.createArreyUnit2(arrayList2, Unit.setClass());
        }
        System.out.println();
        System.out.println("Команда 2:");


        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.print(arrayList2.get(i).getInfo());
        }

        ArrayList arreyAll = new ArrayList<>(arrayList1);

        for (int i = 0; i < arrayList2.size(); i++) {
            arreyAll.add(arrayList2.get(i));
        }

        arreyAll.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                if (o2.getSpeed() == o1.getSpeed()) {
                    return o1.getHp() - o2.getHp();
                }
                return o2.getSpeed() - o1.getSpeed();
            }
        });

        System.out.println();
        System.out.println(arreyAll);

    }
}




/**
 * Задача, 2 семинар:
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
 * ===================================================================================================
 * Задача, 3 семинар: 
 * Добавить/Исправить.
 * 
 * Атака, защита - должны быть объявлены в abstract class
 * Выстрелы - только у лучника и арбалетчиков. Стрелы заканчиваются и лучник становиться не боеспособным.
 * Крестьянин - за один ход приносит одну стрелу лучнику.
 * Урон - должно быть две цифры damegeMin и damegeMax.
 * hp - должно быть текущее и maxHp.
 * speed - по нему определяется время очередности персонажа.
 * x, y - добавить координаты.
 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Д/з:
 * Сделать два списка (команды) по 10:
 * Первый список - или Крестьянин, или Разбойник, или Снайпер, или Колдун;
 * Второй - или Крестьянин, или Копейщик, или Арбалетчик, или Монах.
 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Вывести в консоль список персонажей с учетом скорости, чтобы в начале были те у которых 
 * скорость выше внезависимости, от того в каком списки они находятся.
 */