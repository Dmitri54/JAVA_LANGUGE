

package HomeWork.independent_work;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// public class Program {
//     public static void main(String[] args) throws FileNotFoundException { // Чтение из файла.

//         String separator = File.separator; // Обращаюсь к системной константе separator, он вернет, то что 
// // сейчас в системе.

//         String path = separator + "Users" +separator+ "User" +separator+ "Desktop" +separator+ "Java_Language" +separator+ "HomeWork" +separator+ "independent_work" +separator+ "test.txt";
//         // String path = "C:/Users/User/Desktop/Java_Language/HomeWork/independent_work/test.txt";
// // C:\Users\User\Desktop\Java_Language\HomeWork\independent_work\test1.txt
// // Путь до файла.
// // Чтобы не менять разделить в страке путь, можно делигировать это java, для этого создал перем. separator.
//         File file = new File(path); // Мой фаил.

//         Scanner scanner = new Scanner(file); 
//         // Чтобы считывать фаил, пишу цикл.
//         while (scanner.hasNextLine()) { // Будет считывать пока есть данные.
//             System.out.println(scanner.nextLine()); // Покажет в консоле содержимое файла.
//         }
//         scanner.close(); // Чтобы закрыть поток к файлу.

//         // Чтобы не подчеркивало красным добавил исключение в сигнатуру метода (throws FileNotFoundException).
//         // Scanner scanner = new Scanner(System.in); // Считывает данные с консоли.
//         // String input = scanner.nextLine(); // Для хранения считанных данных.
// // Можно считывать данные с файла при помощи класса Scanner.


//     }
// }
// ------------------------------------------------------------------------------------------------
/**
 * Program
 */
public class Program {

    public static void main(String[] args) throws FileNotFoundException {
        
        String separator = File.separator;
        String path = separator + "Users" +separator+ "User" +separator+ "Desktop" +separator+ "Java_Language" +separator+ "HomeWork" +separator+ "independent_work" +separator+ "test1.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine(); // Сохранил в переменную строку с данными из файла.
        String[] numbersString = line.split(" ");

        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        // String[] words = line.split(" "); // Делю строку по пробелу. Если пробел.
        // String[] words = line.split("\\."); // Если разделить (.).

        System.out.println(Arrays.toString(numbers)); // Выведит массив в консоль.

        scanner.close();
    }
}


