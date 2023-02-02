// Коллекции. ArrayList.
// Правильное использование этой коллекции.

package lessons.java_projects_03;

import java.util.ArrayList;

public class Ex003 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>(); 
        // Не пишу <Integer>, т.к. определил тип на первом этапе. Лучше писать всегда.
        ArrayList<Integer> list3 = new ArrayList<>(10); // (10) - это говорит о том, что
        // изначально в моей коллекции будет 10 элементов.
        ArrayList<Integer> list4 = new ArrayList<>(list3);
        System.out.println(list3); // []
        list1.add(1);
        list3.add(123);
        // list3.add("Hello!"); // Не пройдет компиляцию, т.к. это String, а метод ждет Integer.
        System.out.println(list4); // []
        System.out.println(list3); // [123]

    }
}
// Плюсы от использования такого метода:
// Меньше ошибок на этапе компиляции кода;
// Повторное использование кода.