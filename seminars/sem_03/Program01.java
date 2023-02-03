/**
 * Задание на семинаре:
 * Создать два списка. 
 * Первый хранить будет 5-7 слов любых. Второй список будет int, там будут числа от 0 до 10.
 * Вывести содержимое списков.
 * Удалить все элементы из списка со строками, длинны которых меньше,
 * чем числа выпавшие случайным путем во втором списке с тем же индексом.
 */ 

package seminars.sem_03;

import java.util.ArrayList;
import java.util.Random;

public class Program01 {
    public static void main(String[] args) {
        ArrayList <String> str = new ArrayList<>();
        str.add("Great");
        str.add("Excellently");
        str.add("Name");
        str.add("Family");
        str.add("Hello");
        str.add("Two");
        str.add("Friday");

        ArrayList <Integer> numbers = new ArrayList<>();
        Random rnd = new Random();
        
        for (int i = 0; i < str.size(); i++) {
            numbers.add(rnd.nextInt(10));
        }

        System.out.println(str); // [Great, Excellently, Name, Family, Hello, Two, Friday]
        System.out.println(numbers); // [0, 4, 8, 9, 3, 9, 7]

        ArrayList <String> str2 = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() > numbers.get(i)) {
                str2.add(str.get(i));
            };
        }
        System.out.println(str2); // [Great, Excellently, Hello]

        str.removeAll(str2); // Удаляет все элементы из списка, для которого он вызван, 
        // которые встречаются в списке переданным в параметре.
        System.out.println(str); // [Name, Family, Two, Friday] - это то, что нужно было удалить.
    }
}
