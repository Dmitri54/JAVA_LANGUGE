// Коллекции. Функционал.

package lessons.java_projects_03;

import java.util.Arrays;
import java.util.List;

public class Ex005 {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = new StringBuilder[] {day, month, year};
        List<StringBuilder> d = Arrays.asList(date);
        // List<StringBuilder> d = Arrays.asList(day, month, year);
        System.out.println(d); // [28, 9, 1990]
        date[1] = new StringBuilder("09");
        System.out.println(d); // [28, 09, 1990] // Должно быть [29, 9, 1990]
    }
}
