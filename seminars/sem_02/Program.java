// Урок 2 (семинар). Почему вы не можете не использовать API
// ==============================================================================================
/**
 * Разбор Д/з.
 * Нужно было решить через массивы, я и решил.
 * Возможные решения задачи, если не через массивы:
 * ArrayList<Integer> list; - через list - минус, больше места занимает чем массив.
 * String s = ""; - через String.
 * s += "!";
 * Минус, если нужно добавить один символ к строке, то будет создана новая сторока с этим символом, 
 * а стара будет удалена. На выполнение этих операций тратиться много времени и требует много памяти.
 */

package seminars.sem_02;

// import java.io.StringReader;

// import java.util.Random;

// public class Program {
//     public static void main(String[] args) {
//         int x = new Random().nextInt(1000);
//         int n = Integer.toBinaryString(x).length();
//         int cnt = 0;
//         for (int i = Short.MIN_VALUE; i < x; i++) {
//             if (i % n == 0) cnt++;           
//         }
//         int[] m = new int[cnt];
//         cnt = 0;
//         for (int i = Short.MIN_VALUE; i < x; i++) {
//             if (i % n == 0) m[cnt++] = i;           
//         }
//     }
// }

// Это решение первого д/з.
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2.
// Оно долгое по выполнению, но и так можно было.
// ==============================================================================================
// import java.io.StringReader;

/**
 * Program
 */
// public class Program {

//     public static void main(String[] args) {

//         long begin = System.currentTimeMillis(); // Старт отчета времени выполнения программы.
//         // long begin = System.nanoTime(); // Тоже отчет времени в нано секундах.

//         String s = "qw";
//         String e = "qw";

     
//         StringBuilder builder = new StringBuilder("Hello");
//         // StringBuilder - это не String. Это класс, при инициализации нужно сначала сказать сколько место
//         // выделить и ссылку получить (new), и передать конструктор (StringBuilder();).
//         // StringBuilder(); - это метод, который приводит класс в начальное состояние, чтобы экземпляр 
//         // класса (объект) был в правильном состоянии в начале.
//         // s  = builder; // Записать builder в String простотак нельзя. Нужно преобразовать в строку.
//         s = builder.toString();
//         // builder += "!"; // Так прибавить к builder строку нельзя, т.к. у него + не переопределен.
//         // Для это есть специальные методы.
//         // builder.append("a");
//         // builder.append(3.7f);
//         // builder.append(builder);
//         // builder.replace(0, 0, s);
//         builder.append("!");
//         System.out.println(builder); // Hello!
//         System.out.println(builder.reverse()); // !olleH // Развернул строку.
//         System.out.println(builder); // !olleH // Строка осталась развернутой, т.к. 
//         // StringBuilder меняет оригинал, а не создает новую строку.
//         builder.deleteCharAt(0); // Удалит элемент строки по индексу.
//         System.out.println(builder); // olleH
        
//         // Чтобы измерять время.
//         // long begin = System.currentTimeMillis(); // Перенес в начало программы.

//         long end = System.currentTimeMillis(); // Конец отчета времени выполнения программы.
//         // long end = System.nanoTime(); 

//         System.out.println(end - begin); // Время работы программы.
        
//     }
// }
// =============================================================================================
/**
 * Задача 1.
 * 1. Создать приложение в котором будет StringBuilder, пока один.
 * В него добавить четыре приметивных типа данных. Результат вывести в консоль.
 * 2. Создать две строки и сравнить их одинаковые ли они.
 */ 
// ==============================================================================================

/**
 * Program
 */
// public class Program {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder(); // инициализации StringBuilder.
//         sb.append(5); // Добавил число. Первый тип данных int, 
//         sb.append('A'); // Добавил символ (в памяти как число). char.
//         sb.append(false); // boolean
//         sb.append("Hello!"); // String
//         sb.append(1.23); // dooble
//         System.out.println(sb); // 5AfalseHello!1.23

//         StringBuilder sb2 = new StringBuilder();
//         sb2.append(5);
//         sb2.append('A');
//         sb2.append(false);
//         sb2.append("Hello!");
//         sb2.append(1.23);
//         System.out.println(sb2); // 5AfalseHello!1.23

//         // System.out.println(sb.equals(sb2)); // false - т.к. StringBuilder это объект, а не String.
//         // .equals() - сравнит дву строки сформированные StringBuilder().
//         System.out.println(sb == sb2); // false
//         System.out.println(sb.toString().equals(sb2.toString())); // true
//         // .toString() - переведет sb в String и уже к String я применяю метод .equals() в параметрах 
//         // указыват sb2.toString(). Вывод true, т.к. строки одинаковы.
//     }
// }
// ====================================================================================================
/**
 * 3адача 2. 
 * Дано два числа 3 и 56.
 * 1. Нужно вывести в консоль чему равно будет +, -, *, / (средствами StringBuilder()).
 * 2. Нужно заменить (=) надписью (равно).
 */

/**
 * Program
 */
// public class Program {

//     public static void main(String[] args) {
//         int a = 3;
//         int b = 56;

//         int x = a + b;
//         int y = a - b;
//         int z = a * b;
//         float v = (float) a / b;

//         System.out.println(x); // 59
//         System.out.println(y); // -53
//         System.out.println(z); // 168
//         System.out.println(v); // 0.05357143

//         // StringBuilder sum = new StringBuilder();
//         // sum.append(a + "+" + b + "=" + x); // Так писать не есть гуд (a + )!
//         // System.out.println(sum); // 3+56=59

//         // StringBuilder diff = new StringBuilder();
//         // diff.append(a + "-" + b + "=" + y); 
//         // System.out.println(diff); // 3-56=-53

//         // StringBuilder mult = new StringBuilder();
//         // mult.append(a + "*" + b + "=" + z); 
//         // System.out.println(mult); // 3*56=168

//         // StringBuilder div = new StringBuilder();
//         // div.append(a + "/" + b + "=" + v); 
//         // System.out.println(div); // 3/56=0.05357143

//         StringBuilder sum = new StringBuilder();
//         sum
//                 .append(a)
//                 .append(" + ")
//                 .append(b)
//                 .append(" = ")
//                 .append(a+b);
//         // System.out.println(sum); // 3 + 56 = 59
//         System.out.println(sum.replace(7, 8, " равно ")); // 3 + 56  равно  59

//         StringBuilder diff = new StringBuilder();
//         diff
//                 .append(a)
//                 .append(" - ")
//                 .append(b)
//                 .append(" = ")
//                 .append(a-b);
//         // System.out.println(diff); // 3 - 56 = -53
//         System.out.println(diff.replace(7, 8, " равно ")); // 3 - 56  равно  -53

//         StringBuilder mult = new StringBuilder();
//         mult
//                 .append(a)
//                 .append(" * ")
//                 .append(b)
//                 .append(" = ")
//                 .append(a * b);
//         // System.out.println(mult); // 3 * 56 = 168
//         System.out.println(mult.replace(7, 8, " равно ")); // 3 * 56  равно  168

//         StringBuilder div = new StringBuilder();
//         div
//                 .append(a)
//                 .append(" / ")
//                 .append(b)
//                 .append(" = ")
//                 .append((float)a / b);
//         // System.out.println(div); // 3 / 56 = 0.05357143
//         System.out.println(div.replace(7, 8, " равно ")); // 3 / 56  равно  0.05357143   

//     }
// }
// =========================================================================================
/**
 * 3адача 3. 
 * Объявить пустую строку.
 * 1. Добавить в неё в цикле 10_000 букв.
 * 2. Создать StringBuilder() и в него добавить 10_000 букв.
 * 3. Посчитать сколько это займёт времени и сравнить это время.
 */


/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        String str = "";
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 10_000; i++) {
            str += "R ";            
        }
        // System.out.println(str);

        long end1 = System.currentTimeMillis();
        System.out.println("String time = " + (end1 - start1)); // String time = 184

        StringBuilder strBuilder = new StringBuilder();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            strBuilder.append("R ");           
        }

        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder time = " + (end2 - start2)); // StringBuilder time = 0

        System.out.println("Difference = " + ((end1 - start1) - (end2 - start2))); // Difference = 184
        
        // StringBuilder - работает быстрее чем String на добавление, а на считывание готовой строки 
        // будет быстрее String.


    }
}

