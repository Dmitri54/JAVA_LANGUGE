// Работа с файловой системой. Каталоги.

package lessons.java_projects_02;

import java.io.File;

/**
 * catalogSystemDemo
 */
public class catalogSystemDemo {

    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath ());
        if (dir.mkdir()) {
            System.out.println("+"); // Если не создана, создаст. Пришлет +.
        } 
        else {
            System.out.println("-"); // Если не может создасть, пришлет -.
        }
        for (String fname : dir.list()) {
            System.out.println(fname); // Пришлет имя файла
        } 
    }     
}