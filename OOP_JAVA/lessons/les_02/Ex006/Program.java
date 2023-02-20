package OOP_JAVA.lessons.les_02.Ex006;

import OOP_JAVA.lessons.les_02.Ex006.Applications.Notepad;
import OOP_JAVA.lessons.les_02.Ex006.Format.*;

public class Program {
    public static void main(String[] args) {
        
        Notepad notes = new Notepad(); // Мне нужно создать новую запясную книжку. Создаю.
        notes.newFile(); // Создать новый фаил
        notes.currentDocument().addAllText("text111"); // Добавить текст
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        
        // Сохранит (указываю куда сохранить и формат в котором нужно сохранить)!
        notes.SaveAs("C:/Users/User/Desktop/Java_Language/OOP_JAVA/lessons/les_02/Ex006/file1", new Txt());
        notes.SaveAs("C:/Users/User/Desktop/Java_Language/OOP_JAVA/lessons/les_02/Ex006/file2", new Md());
        notes.SaveAs("C:/Users/User/Desktop/Java_Language/OOP_JAVA/lessons/les_02/Ex006/file3", new Doc());



    }
}
