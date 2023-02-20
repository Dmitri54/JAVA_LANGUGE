package OOP_JAVA.lessons.les_02.Ex006.Interface;

import OOP_JAVA.lessons.les_02.Ex006.Document.TextDocument;

public interface Saveable { // Кнопка сохранения. 
    void SaveAs(TextDocument document, String path); // метод принемает некий документ и путь до него.
}
