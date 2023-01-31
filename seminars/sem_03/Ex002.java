// Коллекций. List

package seminars.sem_03;
import java.util.ArrayList;

public class Ex002 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList list = new ArrayList(); // Компилятор подчеркивает, т.к. я делаю не явное
        // преобразование к Object. ЧТобы этого не было нужно явно указать каким типом будет ArrayList.
        // Пишу ArrayList<Integer> list = new ArrayList<Integer>(); - <Integer> так указывается обобщение.
        list.add(2809);
        // list.add("1234"); // Даст добавить, если я пишу ArrayList list = new ArrayList(); 
        // т.е., не явно указываю тип данных. 
        // Прокт не будет работать, если указано ArrayList<Integer> list = new ArrayList<Integer>();
        // т.к. я метод будет ждать Integer, а не String.
 
        for (Object o : list) {
            System.out.println(o); // 2809
        }
    }
}
