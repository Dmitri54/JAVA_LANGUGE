package lessons.java_projects_05;

import java.util.*;
 
public class Ex001_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>(); // Инициализация переменнтой коллекции Map.
        db.putIfAbsent(1, "один"); 
        // .putIfAbsent() - произведет добавление если ключ не найден.
        db.put(2, "два"); 
        // .put() - добавит значение.
        db.put(null, "!null"); // Можно в названии ключа сипользовать и слово null.
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));
        //db.remove(null); 
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true
        // .containsValue() - Проверка наличия значения.
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        // .containsKey() - Проверка наличия ключа.
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet());
        // .keySet() - выдаст множество ключей.
        System.out.println(db.values());
        // .values() - выдаст набор значений.

    }
}
