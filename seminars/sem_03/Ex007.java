package seminars.sem_03;

import java.util.*;

public class Ex007 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345); 
        // Создал коллекцию при помощи List.of()

        for (int item : list) { // Это и есть цикл for each loop.
            System.out.println(item); // Печать каждого элемента с новой строки.
        // Изменять элементы НЕЛЬЗЯ.
        }

        Iterator<Integer> col = list.iterator(); // Получаю на основе коллекции list.iterator();
        System.out.println();

        while (col.hasNext()) { // В цикле пишу, пока есть следующий элемент col.hasNext(). 
            System.out.println(col.next());
            
            // System.out.println(col.next());
            // Изменять коллекцию тут не нужно, т.е. если я получил коллецию элементов, то не нужно 
            // пытаться его удалить или дважды пытаться его получать.
            // col.remove(); // ОШИБКА! 
            // col.next(); // ОШИБКА!
        }

    }
}
