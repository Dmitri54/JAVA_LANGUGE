// Работа с файловой системой. Файлы. Ошибки.

package lessons.java_projects_02;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class tryDemo {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir"); // Путь к папке с файлом.
            String pathFile = pathProject.concat("/file.txt"); // Пусть до файла.
            // Это путь до папки + (.concat() - объединяет строки) название файла.
            File file = new File(pathFile);
            
            if (file.createNewFile()) {
                System.out.println("file.created"); // Проверка, на был ли создан фаил.
            }
            else {
                System.out.println("file.existed");  // file.existed // Фаил существует.
            }
        } 
        catch (Exception e) {
            System.out.println("catch"); // Если будет ошибка, он её покажет. Пример: не верно указан путь к файлу или файла не будет.
        }
        finally{ 
        System.out.println("finally"); } // finally // Всегда выводит, чтобы видеть, что блок tru-catch 
        // закончил работу. Короче, для наглядности.
        
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt"); // Путь до файла.
        
        String line = "empty";
        try {
            File file = new File(pathFile); // Создание пустово файла.
            if (file.createNewFile()) { 
                System.out.println("file.created"); }
            else {
                BufferedReader bufReader = new BufferedReader(new FileReader(file)); // Чтение файла.
                System.out.println("file.existed"); // file.existed // фаил существует.
                line = bufReader.readLine(); // Чтение первой строки.
                bufReader.close(); } // Закрытие работы с файлом.
        } 
        catch (Exception e) {
        //e.printStackTrace();
        } 
        finally {
        System.out.println(line); // line 123
        }

    }
    
}
