/**
 * 6. **Сравнить время последовательного и случайного перебора тысячи элементов словарей.
 */

package HomeWork.home_work_05;

import java.util.HashMap;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
// 1. Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer, String> map = new HashMap<>();

// 2. Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        map.put(1, "Yellow");
        map.put(2, "Red");
        map.put(3, "Green");
        map.put(4, "Black");
        // System.out.println(map.putIfAbsent(5, "Blue")); // null
        // System.out.println(map); // {1=Yellow, 2=Red, 3=Green, 4=Black, 5=Blue}

// 3. Изменить значения дописав восклицательные знаки.
        map.put(1, "Yellow!");
        map.put(2, "Red!");
        map.put(3, "Green!");
        map.put(4, "Black!");
        map.put(5, "Blue!");
        // System.out.println(map); // {1=Yellow!, 2=Red!, 3=Green!, 4=Black!, 5=Blue!}

// 4. *Создать TreeMap, заполнить аналогично.
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Yellow!");
        treeMap.put(2, "Red!");
        treeMap.put(3, "Green!");
        treeMap.put(4, "Black!");
        treeMap.put(5, "Blue!");
        System.out.println(treeMap); // {1=Yellow!, 2=Red!, 3=Green!, 4=Black!, 5=Blue!}

// 5. *Увеличить количество элементов до 1000 случайными ключами и общей строкой.
        for (int i = 0; i < 1000; i++) {
                map.put(i, "");
        }

        for (int j = 0; j < 1000; j++) {
                treeMap.put(j, "");
        }
        // System.out.println(map);
        // System.out.println(treeMap);

// 6. **Сравнить время последовательного и случайного перебора тысячи элементов словарей.
        long start = System.currentTimeMillis();
        for (Integer key : map.keySet()) {
            map.get(key);
        }
        long end = System.currentTimeMillis();
        long start1 = System.currentTimeMillis();
        for (Integer key : treeMap.keySet()) {
            treeMap.get(key);
        }
        long end1 = System.currentTimeMillis();

        System.out.println("Время перебора map: " + (end - start));
        System.out.println("Время перебора treeMap: " + (end1 - start1));
    }
}
