package OOP_JAVA.lessons.les_03.Ex001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(); // Создаю коллекцию
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator(); // Создаю коллекцию Итератор (Iterator<E>) с именем iter
// Пишу имя моей коллекции (nums) и обращаюсь к Итератору, через точку (nums.iterator())
// И привожу к нужному типу <Integer>
        while (iter.hasNext()) { // Цикл (пока есть следующий)
            System.out.println(iter.next()); // Печатать пока есть следующий
        }

// Но если я создам класс Worker.java и создам экземпляр класса Worker

        Worker worker = new Worker(
            "Имя", "Фамилия", 23, 4567);

        // Iterator<Object> components = worker.iterator(); // Подчеркивает красным (iterator)
        
// Потому что он у меня не реализован.
/**
 * Вопрос: Как заставить Итератор ходить по отдельным членам моего класса (к примеру Worker)
 * Ответ: Для этого нужны Интерфейсы.
 * 
 * Пример: Ex002
 */
        
    }
}
