package lessons.java_projects_05;

import java.util.*;

public class Ex003_HashMapBoost {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>(); 
        // Инициализация массива HashMap без аргументов.
        Map<Integer,String> map2 = new HashMap<>(30);
        // Инициализация массива HashMap с 10 аргументами.
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f);
        // Тут указано два аргумента (9 - элементов и 0.8f - призаполнении массива на 80% увеличить размер).
        // 1.0f - при 100%
    }
}
