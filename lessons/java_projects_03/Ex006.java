package lessons.java_projects_03;

import java.util.ArrayList;
import java.util.List;

public class Ex006 {
    public static void main(String[] args) {
        Character value = null;
        // List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        List<Character> list1 = new ArrayList<Character>(); // Создание массива по классике.
        list1.add('S'); // Добавляю элемент в массив list1.
        list1.add('e');
        list1.add('r');
        System.out.println(list1); // [S, e, r]

        list1.remove(1); // java.lang.UnsupportedOperationException
        // Ошибка, т.к. изменить элемент созданный через встроенную функцию List.of(); так просто нельзя.
        // Нужно создать массив по классике, добавить в него элементы и тогда .remove(); удалит указанный элемент.
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2); // [S, r]
        
    }
}

