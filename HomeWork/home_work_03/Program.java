/**
 * Задание. 3 семинар.
 * 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
 * 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
 * 3. Вставить элемент в список в первой позиции.
 * 4. Извлечь элемент (по указанному индексу) из заданного списка.
 * 5. Обновить определенный элемент списка по заданному индексу.
 * 6. Удалить третий элемент из списка.
 * 7. Поиска элемента в списке по строке.
 * 8. Создать новый список и добавить в него несколько елементов первого списка.
 * 9. Удалить из первого списка все элементы отсутствующие во втором списке.
 * 10* Сортировка списка.
 */

package HomeWork.home_work_03;

import java.util.ArrayList;
import java.util.Collections;


public class Program {
    public static void main(String[] args) {
// 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.--------------------
        ArrayList <String> str = new ArrayList<>();
        str.add("Great");
        str.add("Excellently");
        str.add("Family");
        str.add("Hello");
        System.out.println(str); // [Great, Excellently, Family, Hello]
// 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.-----------------------
        ArrayList <String> str1 = new ArrayList<>();
        str1.add("red");
        str1.add("black");
        str1.add("yellou");
        str1.add("green"); 
        str1.add("blue");

        for (int i=0; i<str1.size(); i++) {
            String tmp = new String();
            tmp = (String) str1.get(i);
            tmp += "!";
            str1.set(i, tmp);
        }
        System.out.println(str1); // [red!, black!, yellou!, green!, blue!] 
// 3. Вставить элемент в список в первой позиции.-----------------------------------------------------
        str.add(0, "Hello World!");
        System.out.println(str); // [Hello World!, Great, Excellently, Family, Hello] // (3)
// 4. Извлечь элемент (по указанному индексу) из заданного списка.------------------------------------
        System.out.println(str.get(2)); // Excellently (4)
// 5. Обновить определенный элемент списка по заданному индексу.--------------------------------------
        str.set(3, "Sky!");
        System.out.println(str); // [Hello World!, Great, Excellently, Sky!, Hello] (5)
// 6. Удалить третий элемент из списка.---------------------------------------------------------------  
        str.remove(2);
        System.out.println(str); // [Hello World!, Great, Sky!, Hello] (6)
// 7. Поиска элемента в списке по строке.-------------------------------------------------------------
        System.out.println(str.indexOf("Sky!"));
// 8. Создать новый список и добавить в него несколько елементов первого списка.----------------------
        ArrayList <String> str2 = new ArrayList<>();
        str2.add("Great");
        str2.add("Hello");
        System.out.println(str2); // [Great, Hello]
// 9. Удалить из первого списка все элементы отсутствующие во втором списке.--------------------------
        str.retainAll(str2);
        System.out.println(str); // [Great, Hello]
// 10* Сортировка списка.-----------------------------------------------------------------------------
        Collections.sort(str1);
        System.out.println(str1); // [black!, blue!, green!, red!, yellou!]
    }
}
