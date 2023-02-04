// Пример использования Deque.
// ====================================================================================================
package lessons.java_projects_04;

import java.util.*;

public class Ex003 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        // Первый элемент (голова)
        deque.addFirst(23); 
        // .addFirst() -  Добавит в начало списка элемент.
        deque.addFirst(2); 
        deque.addFirst(10);
        deque.removeFirst(); 
        // .removeFirst() - Удалит первый элемент.
        deque.offerFirst(11); 
        // .offerFirst() - Добавит в начало списка элемент.
        System.out.println(deque.getFirst()); // 11
        // .getFirst(); - даст доступ к первому элементу.
        deque.pollFirst(); 
        // .pollFirst() - Удалит первый элемент.
        System.out.println(deque.peekFirst()); // 2
        // .peekFirst() - даст доступ к первому элементу.
        System.out.println(deque); // [2, 23]

        // Последний элемент (хвост)
        deque.addLast(2); 
        // .addLast() - Добавит в конец списка элемент.
        deque.removeLast(); 
        // .removeLast() - Удалит последний элемент.
        deque.offerLast(54); 
        // offerLast() - Добавит в конец списка элемент.
        System.out.println(deque.getLast()); // 54
        // .getLast() - даст доступ к последнему элементу.
        deque.pollLast();
        // .pollLast() - Удалит последний элемент. 
        System.out.println(deque.peekLast()); 
        // .peekLast() - даст доступ к последнему элементу.

        System.out.println(deque);
    }
}
