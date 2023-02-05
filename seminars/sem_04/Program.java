// Урок 4. Хранение и обработка данных ч1: приоритетные коллекции.
// =========================================================================================
/** 
 * Файловая система на практике.
 * Пример.
 */

package seminars.sem_04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class Program {
//     public static void main(String[] args) {
                
//         // File - класс, для того чтобы писать с файла. 
//         // Но есть лучше две обертки:
//         // FileWriter - Чтобы записывать в файл.
//         // При инициализации переменной этого типа нужно добавить в сигнатуру класса (throws IOException)
//         // указание, что метод может кидаться исключениями или  обернуть в (try catch). 
//         // /Users/User/Desktop/Java_Language/seminars/sem_04/db.sql
//         FileWriter fileWriter = null; // Инициализация. Вынес, чтобы пользоваться во всём методе.
//         FileReader fileReader = null; // Чтобы читать файл. 
//         // try{
//         //     fileWriter = new FileWriter("db.sql"); // FileWriter fileWriter - объявлен внутри try catch
//         //     // поэтому снаружи, к нему обратиться нельзя, поэтому вынес его от сюда.
//         //     fileWriter.append("Hello world!");
//         //     fileWriter.flush();
//         // } catch (IOException e) {
//         //     System.out.println(e.getMessage()); // Сообщение об исключении.
//         // }
        
//         // .append() - Добавит элемент в фаил. Умеет кидаться исключениями. Пишу внутри try catch.
//         // .flush() - Дает знать ОС о том, что работа с файлом прекращена. 
//         // Это как нить, которую нужно оборвать, полсе завершения работы.

//         String text = "";
//         try {
//             fileReader = new FileReader("db.sql");
            
//             while (fileReader.ready()){ // В цикле считывать по буквенно.
//                 text += (char)fileReader.read();
//             }
//         } catch (IOException e) {
//             System.out.println(e.getMessage());
//         }
//         System.out.println(text); // Hello world!
//         // .ready() - готовность. Возвращает true если не все буквы из файла ещё считаны и false, если я
//         // считал все буквы с файла.
//         // .read() - возвращает число, которое является индексом буквы из таблицы букв (возвращает char).
//         // и чтобы это число преобразовать к строке нужно, пишу (char).
     
//     }
// }
// ================================================================================================
/**
 * Задание 1.
 * Текст в формате ФИО + возраст + пол (5-6 чел.)
 * Считать и разделить по строкам и словам.
 * Создать списки отдельно для фамилий, имён, отчеств, возраста и пола.
 * Заполнить данными для каждого человека из файла.
//  * Доп. задание: -------------------------------------------------------------------------------
 * Возраст - храниться в число (int).
 * Пол - boolean.
 * Вывод в формате:
 * Иванов И.И. 35 лет мужчина
 * Сортировать по возрасту.
 */
// ================================================================================================

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        
        // try {
        //     FileWriter fw = new FileWriter("sem_03_db.sql");
        //     fw.append("Петров А.А." + " 56 лет " + " Мужской");
        //     fw.append("Иванов Б.Б." + " 56 лет " + " Мужской");
        //     fw.append("Сидоров В.В." + " 56 лет " + " Мужской");
        //     fw.append(" В.В." + " 56 лет " + " Мужской");
        //     fw.append("Сидоров В.В." + " 56 лет " + " Мужской");
        //     fw.flush();
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

        // FileWriter fr = null;
        
        // ArrayList<String> listLine = new ArrayList<>();

        // try {
        //     FileReader fr = new FileReader("sem_03.txt");

        //     StringBuilder sb = new StringBuilder();
        //     while (fr.ready()) {
        //         char c = (char) fr.read();
        //         if (c == '\n') {
        //             listLine.add(sb.toString());
        //             sb = new StringBuilder();
        //         } else {
        //             sb.append(c);
        //         }
        //     }
        //     // if (sb.length() > 0 ) {
        //     //     listLine.add(sb.toString());
        //     // }
            
        //     System.out.println(listLine);

        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // } 
// --------------------------------------------------------------------------------------------------
        // try {
        //     FileReader fr = new FileReader("sem_03.txt");
        //     String text = "";
        //     while (fr.ready()){
        //         text += (char)fr.read();
        //     }
        //     String[] parts = text.split("\n");
        //     System.out.println(Arrays.toString(parts));

        //     ArrayList<String> lastName = new ArrayList<>();
        //     ArrayList<String> name = new ArrayList<>();
        //     ArrayList<String> fatname = new ArrayList<>();
        //     ArrayList<Integer> age = new ArrayList<>();
        //     ArrayList<Boolean> male = new ArrayList<>();
        //     for (int i = 0; i < parts.length; i++) {
        //         String[] tmp = parts[i].split(" ");
        //         lastName.add(tmp[0]);
        //         name.add(tmp[1]);
        //         fatname.add(tmp[2]);
        //         age.add(Integer.parseInt(tmp[3]));
        //         male.add(tmp[4].contains("у")?false:true);
        //     }
        
        //     System.out.println(male);

        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }
// --------------------------------------------------------------------------------------------------
// Нужно редактировать, код не доделан.

        FileReader reader = new FileReader("sem_03.txt");

        String fileText = "";
        while (reader.ready()) {
            fileText += (char) reader.read();
        }

        List<String> stringList = List.of(fileText.split("\n"));

        String[] tempString;

        LinkedList <String> surname = new LinkedList<>();
        LinkedList<String> name = new LinkedList<>();
        LinkedList<String> secName = new LinkedList<>();
        LinkedList<Integer> age = new LinkedList<>();
        LinkedList<Boolean> sex = new LinkedList<>();
        LinkedList<Integer> id = new LinkedList<>();

        for (int i = 0; i < stringList.size(); i++) {
            tempString = stringList.get(i).split(" ");
            surname.add(tempString[0]);
            name.add(tempString[1]);
            secName.add(tempString[2]);
            int ageInt = Integer.parseInt(tempString[3]);
            age.add(ageInt);
            sex.add(toBoolean(tempString[4]));
            id.add(i);
        }

        sortId(age, id);


        System.out.println(surname);
        System.out.println(name);
        System.out.println(secName);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(id);
        }

    public static boolean toBoolean(String sexFrom) {
        if (sexFrom.equals("муж")) return true;
        else return false;
    }

    public static void sortId(LinkedList<Integer> ages, LinkedList<Integer> ids) {
        int temp;
        int temp2;
        int count = 0;
        for (int i = 0; i < ages.size() - count; i++) {
            if (ages.get(i) > ages.get(i+1)) {
                temp = ages.get(i + 1);
                temp2 = ids.get(i + 1);
                ages.set(i + 1, temp);
                ids.set(i + 1, temp2);
                count++;
            }
        }

    }
}

