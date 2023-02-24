package OOP_JAVA.lessons.les_03.Ex005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        // #region Collections.sort(numbers);
/**
 * Если бы понадобилось коллекцию наполненную моими типами, можно было отсортировать по какому-то
 * заданному мной правилу, т.е. 
 * Есть коллекция чисел, то я её сортирую и получаю упорядоченный список элементов.
 */
        List<Integer> numbers = new ArrayList<>(); // Коллекция
        for (int i = 0; i < 10; i++) {
        numbers.add(r.nextInt(1,20)); // Random
        }

        System.out.println(numbers); // [13, 1, 19, 1, 13, 3, 10, 7, 9, 5]
        Collections.sort(numbers);
        System.out.println(numbers); // [1, 1, 3, 5, 7, 9, 10, 13, 13, 19]
        // #endregion

        // #region Comparable<Worker>
/**
 * А если я наполню эту коллекцию условными рабочими, то как определить, что значит один рабочий 
 * больше другого?
 */
        List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
        db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18,31),
        r.nextInt(10000)));
        }
        System.out.println(db);

        // Collections.sort(db); // Сортировка почему-то произошла по возрасту.
// Произошло это потому, что у меня в рамках класса Worker implements Comparable<Worker>

        // db.sort(new AgeComporator());
// Можно так после создания AgeComporator.java 

        // db.sort((w1, w2) -> Integer.compare(w1.age, w2.age));
// Можно так написать в одну строку.
        // db.sort((w1, w2) -> Integer.compare(w1.salary, w2.salary));
// Использую встроенный метод сортировки (.compare()) и передаю ему те параметры по которым 
// Нужно сравнивать. Теперь поменяв age на salary не нужно создавать AgeComporator.java 

        // Array.sort(...)

        System.out.println(db);

        // #endregion

        // #region Comparable<Worker>

        // List<Worker> db = new ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        //     db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31), r.nextInt(10000)));
        // }
        // System.out.println(db);

        // db.sort(new AgeComporator());
// Можно так после создания AgeComporator.java 

        // System.out.println(db);

        // #endregion

        //#region

        // Worker w1 = new Worker("Имя", "Фамилия", 20, 20);
        // Worker w2 = new Worker("Имя", "Фамилия", 20, 20);
        

        //#endregion

    }
}
