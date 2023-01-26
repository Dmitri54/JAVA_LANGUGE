package lessons.java_projects_02_1;

import java.io.IOException;
import java.util.logging.*;

public class Ex005_Logger {
    public static void main(String[] args) throws IOException {
    
        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
        // ConsoleHandler ch = new ConsoleHandler(); // Выыод информации в консоль.
        // FileHandler fh = new FileHandler("log.txt"); // Запись информации в фаил txt
        FileHandler fh = new FileHandler("log.xml"); // Запись информации в фаил xml.
        // logger.addHandler(ch);
        logger.addHandler(fh);
        
        // SimpleFormatter sFormat = new SimpleFormatter(); // Классический текстовый формат txt.
        XMLFormatter xml = new XMLFormatter();
        // fh.setFormatter(sFormat);
        // ch.setFormatter(xml);
        fh.setFormatter(xml);
        
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}

// SimpleFormatter - Классический текстовый формат.
// Заменю его на xml, для примера.