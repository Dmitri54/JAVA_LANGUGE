package OOP_JAVA.lessons.les_02.Ex006.Format;

import java.io.FileWriter;
import java.io.IOException;

import OOP_JAVA.lessons.les_02.Ex006.Document.TextDocument;

public class Doc extends TextFormat { // Создал класс Doc.
    
    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".doc", false)) {
            writer.write("<?Doc Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
