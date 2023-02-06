/**
 * ДЗ 4 семинара.
 */

package HomeWork.home_work_04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;




public class Program {
    public static void main(String[] args) {
// 1. Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader

        FileWriter fileWriter = null;
        FileReader fileReader = null;

        // String separator = File.separator;
        // String path = separator + "Users" +separator+ "User" +separator+ "Desktop" +separator+ "Java_Language" +separator+ "HomeWork" +separator+ "home_work_04" +separator+ "hw_04_db"; 
        // так убирает у файла (.sql) и создает какой-то свой. Очень интересно! Это как получается так?

        String path = "C:/Users/User/Desktop/Java_Language/HomeWork/home_work_04/hw_04_db.sql";
        File file = new File(path);
        try {
            fileWriter = new FileWriter(file);
            fileWriter.append("First second third");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String text = "";
        try {
            fileReader = new FileReader(file);
            while (fileReader.ready()){
                text += (char) fileReader.read();
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(text); // First second third

// 2. Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"

        String fileText = "";
        String path1 = "C:/Users/User/Desktop/Java_Language/HomeWork/home_work_04/hw_04_FIO.sql"; 
        File fileFIO = new File(path1);
        try {
            fileReader = new FileReader(fileFIO);
            while (fileReader.ready()){
                fileText += (char) fileReader.read();
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println(fileText);
        }
        // System.out.println(fileText);
        // String[] parts = fileText.split("\n");
        // System.out.println(Arrays.toString(parts));
        List<String> stringList = List.of(fileText.split("\n"));
        System.out.println(stringList); 
// Как-то криво выводит, не победил пока!!!

// 3. Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках. 

        String[] tempString = new String[5];

        LinkedList<String> secname = new LinkedList<>();
        LinkedList<String> name = new LinkedList<>();
        LinkedList<String> surname = new LinkedList<>();
        LinkedList<Integer> age = new LinkedList<>();
        LinkedList<String> gender = new LinkedList<>();

        for (int i = 0; i < stringList.size(); i++) {
            tempString = stringList.get(i).split(" ");
            secname.add(tempString[0]);
            name.add(tempString[1]);
            surname.add(tempString[2]);
            int ageInt = Integer.parseInt(tempString[3]);
            age.add(ageInt);
            gender.add(tempString[4]);
        }

        System.out.println(secname);
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(gender);

// 4. Отсортировать по возрасту используя дополнительный список индексов.

        List index = new ArrayList();

        int count = 0;
        for (int j = 0; j < age.size(); j++) {
            int minAge = 100;
            for (int i = 0; i < age.size(); i++) {
                    if (minAge > age.get(i)) {
                        minAge = age.get(i);    
                        count = i;
                    }
            } 
            index.add(count);  
            int r = minAge + 100;
            age.set(count, r); 
            System.out.println(r - 100);        
        }
         System.out.println(index);

    }
}
