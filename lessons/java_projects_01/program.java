package lessons.java_projects_01;

/**
 * program
 */
// Создал class
// public class program {
// // Создал точку входа
//     public static void main(String[] args) {
//         // System.out.println("bye world"); // Вывод в консоль.
//         System.out.println("world31");
//     }
// }
// =============================================================================================
// Это классический комментарии:
/**
 * Это многострочный комментарий
 */
// ==============================================================================================
// Структура простой программы:
/**
* program
*/
// public class program {
//     public static void main(String[] args) {
//     System.out.println("Goodbye world");
//     }
// }
// =============================================================================================
/**
 * Типы данных и переменные в Java (очень похоже на C#).
 * 1. Ссылочные;
 * 2. Примитивные (boolean, int, short, long и т.д. float, double, Char).
 * ==============================================================================================
 * Создание переменной
 * <тип> <идентификатор>;
 * <идентификатор> = <значение>;
*/

/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         String s = null; // null - это пустая ссылка, но можно написать и "2".
//         // Если не положить значение в переменную, то программа не будет работать.

//         System.out.println(s);
//     }
// }
// ===========================================================================================
/**
 * int и short - отвечают за хранение целых чисел.
 */
// class program
// {
//     public static void main(String[] args) {
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age); //10
//         System.out.println(salary); //123456
//     }
// }
// ============================================================================================
/**
 * float и double - вещественный тип данных 
 */ 
// class program
// {
//     public static void main(String[] args) {
//         float e = 2.7f; // Для типа float обязательно нужно указывать f в конце значения (2.7f)
//         // float f = 123.45; - Ошибка, так писать нельзя.
//         double f = 123.45;
//         double pi = 3.1415; // Для double это можно не делать, т.к. по умолчанию воспринимается тип double.
//         System.out.println(e); // 2.7
//         System.out.println(pi); // 3.1415
//         System.out.println(f);
//     }
// }
// =====================================================================================================
/**
 * Char
 */

//  class program
//  {
//     public static void main(String[] args) {
//         char ch = '1';
//         System.out.println(Character.isDigit(ch)); // true
//         ch = 'a';
//         System.out.println(Character.isDigit(ch)); // false
//         char ch1 = 123; // Если удалю '{' и напишу 123, то я увижу, что в ch1 будет храниться {, а не число 123.
//         // т.е. происходит не явое преобразование одного типа данных в другой. Не явное, т.к. я не указываю тип.
//         System.out.println(ch1);
//         int a = 13;
//         double d = a; // Так можно int поместиться в double
//         a = d; // Так нельзя, нужно использовать преобразование.
//     }
//  } 
// =============================================================================================
/**
 * boolean 
 */

// public class program {
//     public static void main(String[] args) {
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1); // true
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2); // true
//         boolean flag3 = flag1 ^ flag2; 
//         System.out.println(flag3); // false
//         // Тут все просто, кроме непривычных операций.
//         boolean flag4 =  true && false; // В данном случает логическая операция будет определяться как && или ||.
//         // Есть ещё по битовые операции & или |
//         System.out.println(flag4); // false
//         boolean flag5 = true ^ false; // Разделяющая или (^) - разделяющая дизъюнкция.
//         // Возвращает истину тогда и только тогда, когда строго одно из значений истина.
//         System.out.println(flag5); // true
//         boolean flag6 = true ^ true;
//         System.out.println(flag6); // false
        
//     }
// }
// ===================================================================================================
/**
 * Тип данных String - не так просты!
 * Строки не являются приметивным типом.
 * Когда я определяю какую то строку, я не знаю сколько в ней будет храниться.
 */
/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         String msg = "Hello world";

//         System.out.println(msg); // Hello world
//     }
// }
// ====================================================================================================
/**
 * Неявная типизация - если я забыл какой тип данных нужно использовать.
 * var - этот тип данных будет заменен автоматически при компеляции приложения.
 */
// public class program {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a); // 123
//         var d = 123.456;
//         System.out.println(d); // 123.456
//         System.out.println(getType(a)); // Integer
//         System.out.println(getType(d)); // Double
//         d = 1022;
//         System.out.println(d); // 1022
//         // d = "mistake";
//         // error: incompatible types:
//         // String cannot be converted to double

//     }

//     static String getType(Object o) {
//         return o.getClass().getSimpleName();

//     }
// }
// ===============================================================================================
/**
 * Классы-обертки. 
 * ---------------------
 * Примитив | Обертка  |
 * ---------------------
 * int      | Integer  |
 * short    | Short    |
 * long     | Long     |
 * byte     | Byte     |
 * float    | Float    |
 * double   | Double   |
 * char     | Character|
 * boolean  | Boolean  |
 * ---------------------
 */
/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         int i = 123;
//         System.out.println(Integer.MAX_VALUE); // 2147483647 - максимальное значение числа типа int.
//         // Integer. - это класс обертка, для доступа к встроенным функциям.
//         // Character. - то же. - можно проверить на принадлежность к символьным или числовым значениям.
//         System.out.println(Integer.MIN_VALUE); // -2147483648 - минимальное значение.
//         int i = 23_123_34; // Можно так разделять большие числа, чтобы их было хорошо видно.
        
//         String s = "qwer";
//         s.charAt(1);
//     }
// }
// =================================================================================================
/**
 * Операции Java (Есть нюансы!)
 *  Присваивание:       =
 * Арифметические:      *, /, +, -, %, ++, --
 * Операции сравнения:  <, >, ==, !=, >=, <=
 * Логические операции: ||, &&, ^, !
 * Побитовые операции:  <<, >>, &, |, ^
 */
// ---------------------------------------------------------------------------------------------------
// Пример: Допустим я определил переменную целого типа и присвоил ей значение (int a = 123;).
// Далее я вывожу её на печать (System.out.println(a);).
// Допишу оператор инкримента (a++). 
// При втором вызове (System.out.println(a);) получу новое значение (124).
// Но если я пославлю инкремент в вызове функции (System.out.println(a++);) получу значение (123).
// т.е. не сработал.
// Но если я добавлю следующей строкой код (System.out.println(a);) получу значение (124).
// Получается, что приоритет операции инкремента (a++) ниже, чем операция вывода в консоль (System.out.println();).
// Но если записать инкремент перед значением (++a), то операция инкремента будет выше, чем операция вывода в консоль.
// т.е. есть посфиксный инкремент (a++) и префискный инкремент (++a).

/**
 * program
 */

//  Арифметические операции:
// public class program {

//     public static void main(String[] args) {
        // int a = 123;
        // a++;
        // System.out.println(a); // 123 // 124
        // System.out.println(a++); // 123
        // System.out.println(a); // 124
        // System.out.println(++a); // 124
        // System.out.println(a); // 124
        
        // a = --a-a--; // Такое могут спросить на собесодовании.
        // System.out.println(a); // 0
        // a = a-- - --a;
        // System.out.println(a); // 2
        // a = --a - --a;
        // System.out.println(a); // 1
        // a = a-- - a--;
        // System.out.println(a); // 1
    
//     }
// }
// -------------------------------------------------------------------------------------------
// Операции сравнения:

/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         boolean f = 123 < 234;
//         System.out.println(f); // true
//         boolean f1 = 123 > 234;
//         System.out.println(f1); // false
//         boolean f2 = 123 <= 234;
//         System.out.println(f2); // true
//         boolean f3 = 123 != 234;
//         System.out.println(f3); // true
//     }
// }
// -------------------------------------------------------------------------------------------
// Побитовые операции (>>, <<):
/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         int a = 8;
//         // 1000 - двоичная форма числа 8.
//         // a = a << 1;
//         System.out.println(a << 1); // Двигаю 8 на один бит влево. // 16
//         // 10000 - двоичная форма числа 16. При сдвиге 8 влево, добавляется 0. 
//         int b = 18;
//         // 10010
//         System.out.println(b >> 1); // 9
//         // 1001
//     }
// }
// ------------------------------------------------------------------------------------------------
// Побитовые операции (&, |):

/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a | b); // a или b. // 7
//         // 101 - 5
//         // 010 - 2
//         // 111 - 7 
//         int a1 = 5;
//         int b1 = 2;
//         System.out.println(a1 & b1); // a и b
//         // 101 - 5
//         // 010 - 2 
//         // 000 - 0
//         int a2 = 5;
//         int b2 = 2;
//         System.out.println(a2 ^ b2); // разделительная или (^) - истина тогда, когда строго одно из истино.
//         // 101 - 5
//         // 010 - 2
//         // 111 - 7
//         boolean a3 = true;
//         boolean b3 = true;
//         System.out.println(a3 & b3); // true
//         System.out.println(a3 && b3); // true - но работают они по разному.
//         String s = "qwe1";
//         boolean d = s.length() >= 5 && s.charAt(4) == '1'; // && - называют быстрой.
//         // т.к. она проверит левую часть высказывания и если она false, то проверять вторую часть не будет. 
//         // boolean d1 = s.length() >= 5 & s.charAt(4) == '1';
//         // & - данная операция обязательно проверит первое и второе условие.
//         // длинна строки >= 5 и 4 элемент = 1.   
//         System.out.println(d); // true
//         // System.out.println(d1); // 
//         String s1 = "qwwe1";
//         boolean d2 = s1.length() >= 5 || s1.charAt(4) == '1'; // Тоже самое, т.е.
//         // Если первая часьт высказывания true, то проверять вторую часть не будет.
//         boolean d3 = s1.length() >= 5 | s1.charAt(4) == '1'; // Проверит обе части высказывания.
//         System.out.println(d2);
//         System.out.println(d3);

//     }
// }
// ====================================================================================================
/**
 * Массивы. Одномерные.
 */
// public class program {
//     public static void main(String[] args) {

//         int[] arr = new int[10]; // Создание массива - тип имя = new тип[количесво элементов], по умолчанию 0.
//         System.out.println(arr[3]); // 0
//         arr[3] = 13; // Присвоит значение конкретному элементу массива.
//         System.out.println(arr[3]); // 13
//         System.out.println(arr.length); // 10

//         arr = new int[] { 1, 2, 3, 4, 5 }; // Присвоил пять значений массиву из 5 элементов.
//         System.out.println(arr.length); // 5
        
//         // int[] arr; - инициализация массива.
//         // int brr[]; - так тоже можно инициализировать массив.
//     }
// }
// -----------------------------------------------------------------------------------------------
/**
 * Массивы. Многомерные.
 */
// public class program {
//     public static void main(String[] args) {

//         int[] arr[] = new int[3][5]; // Создание многомерного массива - тип[] имя[] = new тип[строки][столбцы]. 
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d ", item);
    
//             }
//             System.out.println();
//         }
//     }
// }
// ---------------------------------------------------------------------------------------------    
// public class program {
//     public static void main(String[] args) {
    
//         int[][] arr = new int[3][5]; // Создание двумерного массива - тип[][] имя = new тип[строки][столбцы].
       
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }
// =================================================================================================
/**
 * Преобразования - из отдного типа данных в другой.
 *                  char 
 *                   |
 *                  \|
 * byte -> short -> int -> long
 *                   |  \   |
 *                  \|   \ \|
 *                 float  double               
 */
// public class program {
//         public static void main(String[] args) {
//                 int i = 123; double d = i;
//                 System.out.println(i); // 123
//                 System.out.println(d); // 123.0
//                 d = 3.1415; i = (int)d;
//                 System.out.println(d); // 3.1415
//                 System.out.println(i); // 3
//                 d = 3.9415; i = (int)d;
//                 System.out.println(d); // 3.9415
//                 System.out.println(i); // 3
//                 byte b = Byte.parseByte("123");
//                 System.out.println(b); // 123
//                 b = Byte.parseByte("1234"); 
//                 // Будет переполнение типа, т.к. byte позволяет хранить значение от 0 до 255.
//                 System.out.println(b); // NumberFormatException: Value out of range
//         }
// }
// Но ----------------------------------------------------------------------------------------
// class program
// {
//     public static void main(String[] args) {
//         int[] a = new int[10]; // Определил массив из 10 целых чисел.
//         double[] d = a; // ИЗУЧАЕМ ковариантность и контравариантность
//     } // Я не могу просто так взять и  массив типа (double) и положить в него (a).
//     // Через метод это сделать можно.
// }
/**
 * Получение данных из терминала.
 * String.
 */
// import java.util.Scanner; // Импортирую java.util.Scanner - чтобы считывать данные с консоли.
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in); // Определяю объект типа iScanner.
//         // или экземпляр класса Scanner
//         System.out.printf("name: "); // Вывод в консоль приглошение, для ввода имени.
//         String name = iScanner.nextLine(); 
//         // Определяю новую переменную name и в неё записываю введенное пользовательм значение.
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }
// ----------------------------------------------------------------------------------------------
// import java.util.Scanner;
// public class program {
//         public static void main(String[] args) {
//                 Scanner iScanner = new Scanner(System.in);
//                 System.out.printf("int a: "); 
//                 // Считывание значения, в консоль вывожу, что жду тип int
//                 int x = iScanner.nextInt(); // Сохраняю полученное значение в переменную.
//                 System.out.printf("double a: "); // Считываю значение, жду тип double.
//                 double y = iScanner.nextDouble();
//                 System.out.printf("%d + %f = %f", x, y, x + y); // Вывожу оба значения и складываю их.
//                 iScanner.close();
//         }
// }
// Проверка на соответствие получаемого типа ---------------------------------------------------------
// import java.util.Scanner;
// public class program {
//         public static void main(String[] args) {
//                 Scanner iScanner = new Scanner(System.in);
//                 System.out.printf("int a: ");
//                 boolean flag = iScanner.hasNextInt(); // Проверка на ввод элемента типа int (.hasNextInt())
//                 // .hasNextInt() - если есть int, то считываем, если нет, то (false) ошибка или то, что напишу.
//                 System.out.println(flag);
//                 int i = iScanner.nextInt();
//                 System.out.println(i);
//                 iScanner.close();
//         } 
// }
// ==================================================================================================
// Форматированный вывод (Форматы вывода)-----------------------------------------------------------
// 
// public class program {
//         public static void main(String[] args) {
//                 int a = 1, b = 2;
//                 int c = a + b;
//                 String res = a + " + " + b + " = " + c;
//                 System.out.println(res); // 1 + 2 = 3
//         }
// }
// ---------------------------------------------------------------------------------------------------
/**
 * program
 */
// Это могут спросить на собеседовании.
// Вопрос колько строк я получу?
// public class program {

//         public static void main(String[] args) {
//                 String s = "qwe"; // Первая строка
//                 int a  = 123;
//                 String q = s + a; // Первая строка + не явное преобразование int в строку (уже вторая) 
//                 // + значение s+a (уже третья) и значение q (четвертая строка).
//                 System.out.println(q);
//                 // Вопрос колько строк я получил.

//         }
// }
// ----------------------------------------------------------------------------------------------
// public class program {
//         public static void main(String[] args) {
//                 int a = 1, b = 2;
//                 int c = a + b;
//                 String res = String.format("%d + %d = %d \n", a, b, c); 
//                 // Если я куда-то хочу положить отформатированную строку, то создаю переменную (String res)
//                 System.out.printf("%d + %d = %d \n", a, b, c); // Так можно сразу вывести в консоль.
//                 System.out.println(res);
//         }
// }
/**
 * Виды спецификаторов:
 * %d: целочисленных значений
 * %x: для вывода шестнадцатеричных чисел
 * %f: для вывода чисел с плавающей точкой
 * %e: для вывода чисел в экспоненциальной форме,
 * например, 3.1415e+01
 * %c: для вывода одиночного символа
 * %s: для вывода строковых значений
 */
// --------------------------------------------------------------------------------------------------
// Вывод количества знаков после запятой.
// public class program {
//         public static void main(String[] args) {
       
//                 float pi = 3.1415f;
//                 System.out.printf("%f\n", pi); // 3,141500
//                 System.out.printf("%.2f\n", pi); // 3,14
//                 System.out.printf("%.3f\n", pi); // 3,141
//                 System.out.printf("%e\n", pi); // 3,141500e+00
//                 System.out.printf("%.2e\n", pi); // 3,14e+00
//                 System.out.printf("%.3e\n", pi); // 3,141e+00
//         }
// }
// ====================================================================================================
/**
 * Область видимости переменных.
 * У переменных существует понятие «область видимости».
 * Если переменную объявили внутри некоторого блока фигурных скобок { },
 * то снаружи этого блока переменная будет недоступна.
 */
// public class program {
//         static int t = 105;
//         public static void main(String[] args) {
//                 int b = 111;
//                 {
//                         int a = 222;
//                         System.out.println(a);
//                         System.out.println(b);
//                 }
//                 // System.out.println(a); // error: cannot find symbol

//                 int a = 123;
//                 System.out.println(a); 
//                 System.out.println(t);
//         }
// }
// =================================================================================================
/**
 * Функции и методы — это технически одно и то же. Функции могут
 * не принадлежать классам, а методы принадлежат.
 * В java все функции являются методами.
 * Описание
 * Вызов
 * Возвращаемое значение
 * Рекурсия
 */
// public class program {
//         static void sayHi() {
//                 System.out.println("hi!");
//         }
//         // Аргументы пишутся через (,) с указанием типа.
//         static int sum(int a, int b) {
//                 return a+b;
//         }
//         static double factor(int n) {
//                 if(n==1)return 1;
//                 return n * factor(n-1);
//         }
//         public static void main(String[] args) {
//                 sayHi(); // hi!
//                 System.out.println(sum(1, 3)); // 4
//                 System.out.println(factor(5)); // 120.0
//         }
// }
// Пример  ---------------------------------------------------------------------------------------
/**
 * program
 */
// public class program {

//         public static void main(String[] args) {
//                 sayHi(); // Точка входа (вызов метода)
//                 lib.sayHi(); // Если метод находиться в другом файле (lib.java).
//         }
//         static void sayHi(){
//                 System.out.println("hi"); // Метод sayHi().
//         }
// }
// ==============================================================================================
/**
 * Управляющие конструкции:
 * условный оператор
 */
// public class program {
//         public static void main(String[] args) {
//                 int a = 1;
//                 int b = 2;
//                 int c;
//                 if (a > b) {
//                         c = a;
//                 } else {
//                         c = b;
//                 }
//                 System.out.println(c); // 2
//         }
// }
// Тоже самое, но короче -------------------------------------------------------------------------
// public class program {
//         public static void main(String[] args) {
//                 int a = 1;
//                 int b = 2;
//                 int c = 0;
//                 if (a > b) c = a;
//                 if (b > a) c = b;
                
//                 System.out.println(c); // 2
//         }
// }
// -----------------------------------------------------------------------------------------------
/**
 * Управляющие конструкции:
 * тернарный оператор
 */
// public class program {
//         public static void main(String[] args) {
//                 int a = 1;
//                 int b = 2;
//                 int min = a < b ? a : b; // Если a < b, то выполнение идет до a: и вывод значения a,
//                 // если нет то вывод значение b.
//                 System.out.println(min); // 1
//         }
// }
/**
 * Оператор выбора ()
 */
// import java.util.Scanner;
// public class program {
//         public static void main(String[] args) {
//                 int mounth = value;
//                 String text = "";
//                 switch (mounth) {
//                         case 1:
//                                 text = "Autumn";
//                                 break;
//                         ...
//                         default: // Блок default заканчиваеься break
//                         text = "mistake";
//                         break;
//                 }
//                 System.out.println(text);
//                 iScanner.close();
//         }
// }
// -----------------------------------------------------------------------------------------
/**
 * program
 */
// public class program {

//         public static void main(String[] args) {
//                 int a = 123;

//                 switch (a) {
//                         case 1: System.out.println("a");
//                         break;
//                         case 2: System.out.println("b");
//                         break;
//                         case 3: // Можно и так описать несколько case и в конце, что будет сделано.
//                         case 4:
//                         case 5: 
//                         System.out.println(a); 
//                         break;

//                 }
//         }
// }
// ===============================================================================================
/**
 * Циклы - — это многократное выполнение одинаковой последовательности действий.
 * В java доступны следующие циклы:
 * ● цикл while;
 * ● цикл do while;
 * ● цикл for; и его модификация for in
 */
// Цикл while -----------------------------------------------------------------------------------
// public class program {
//         public static void main(String[] args) {
//                 int value = 321;
//                 int count = 0;

//                 while (value != 0) {
//                         value /= 10;
//                         count++;
//                 }
//                 System.out.println(count); // 3 - количество цифр в числе.
//         }
// }
// Цикл do while -----------------------------------------------------------------------------------
// public class program {
//         public static void main(String[] args) {
//                 int value = 321;
//                 int count = 0;
//                 do { // Сначало что-то делает.
//                         value /= 10;
//                         count++;
//                 } while (value != 0); // Потом проверяет.
//                 System.out.println(count); // 3
//         }
// }
/**
 * У циклов, есть операторы: continue, break - ЛУЧШЕ их НЕ ИСПОЛЬЗОВАТЬ!
 * 
 * Операторы для управления циклами — continue и break.
 * Выполнение следующей итерации цикла — continue.
 * Прерывание текущей итерации цикла — break.
 * ближайшего к оператору.
 */
/**
 * program
 */
// public class program {

//         public static void main(String[] args) {
//                 for (int i = 0; i < 10; i++){
//                 //         if(i % 2 == 0){ // Если число четное, то 
//                 //         continue; // пропустит.
                        
//                 //        }
//                        if(i % 2 != 0){ // Если число не четное, то
//                         break; // Прекратит выполнение кода после первого входа.
//                        }
//                        System.out.println(i); // Покажет все не четные элементы.
//                 } 
//         }
// }
// Оператор цикла for ----------------------------------------------------------------------
// public class program {
//         public static void main(String[] args) {
//                 int s = 0;
//                 for (int i = 1; i <= 10; i++) {
//                         s += i;
//                 }
//                 System.out.println(s); // 55
//         }
// }
// Вложенные циклы ----------------------------------------------------------------------------
// public class program {
//         public static void main(String[] args) {
//                 for (int i = 0; i < 5; i++) {
//                         for (int j = 0; j < 5; j++) {
//                                 System.out.print("* ");
//                         }
//                         System.out.println();
//                         // Вывод:
//                         // * * * * *
//                         // * * * * *
//                         // * * * * *
//                         // * * * * *
//                         // * * * * *
//                 }
//         }
// }
// цикл for : (или for in) ---------------------------------------------------------------------------
// Работает только для коллекций.
// public class program {
//         public static void main(String[] args) {
//                 // int arr[] = new int[10];
//                 int[] arr = new int[]{1,2,3,4,5,77};
//                 // for (int i = 0; i < arr.length; i++) {
//                 //         arr[i] = 10; // Подставит в каждый элемент 10.                             
                
//                 // }
//                 for (int item : arr) { // foreach
//                         // System.out.printf("%d ", item); // вывод в строку.
//                         // item = 13; // Так делать нельзя, так как я работаю с локальной переменной.
//                         System.out.println(item); // Вывод в столбец.
//                 }
//                 // for (int item : arr) {
//                 //         System.out.println(item); // Я не увижу изменений, т.к. изменения были в локальной части кода.
//                 // }
  
//                 System.out.println();               
//         }
// }
// ==============================================================================================
/**
 * Работа с файлами.
 * Создание и запись\ дозапись
 */
// import java.io.FileWriter; // импотирую библиотеки, для записи в фаил.
// import java.io.IOException; // библиотека ошибок.
// public class program {
//         public static void main(String[] args) {
//                 try (FileWriter fw = new FileWriter("file.txt", false)) {
//                         fw.write("line 1");
//                         fw.append('\n'); // переход на новую строку \n
//                         fw.append('2');
//                         fw.append('\n');
//                         fw.write("line 3");
//                         fw.flush();
//                 } 
//                 catch (IOException ex) {
//                         System.out.println(ex.getMessage()); // Вывод ошибки, если она есть.
//                 }
//         } 
// }
// Чтение, Вариант посимвольно -------------------------------------------------------------
// import java.io.*;
// public class program {
//         public static void main(String[] args) throws Exception { // Что не писать так же длинно catch (IOException ex), 
//        // можно сразу указать, что я ожидаю, что метод main может закончиться такой ошибкой (throws Exception).
//                 FileReader fr = new FileReader("file.txt");
//                 int c;
//                 while ((c = fr.read()) != -1) {
//                         char ch = (char) c;
//                         if (ch == '\n') {
//                                 System.out.print(ch);
//                         } else {
//                                 System.out.print(ch);
//                         }
//                 }
//                 fr.close();
//         } 
// }
// Вариант построчного чтения из файла ---------------------------------------------------------
// import java.io.*;
// public class program {
//         public static void main(String[] args) throws Exception {
//                 BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//                 String str;
//                 while ((str = br.readLine()) != null) {
//                         System.out.printf("== %s ==\n", str);
//                 }
//                 br.close();
//         }
// }
//===============================================================================================
/**
 * Задачи для самоконтроля
 * /////////////////////////////////////////////////////////////////////////////////////////////
 * 1. Задана натуральная степень k. Сформировать случайным
 * образом список коэффициентов (значения от 0 до 100)
 * многочлена многочлен степени k.
 * Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
 * 2. Даны два файла, в каждом из которых находится запись
 * многочлена. Сформировать файл содержащий сумму многочленов.
 */