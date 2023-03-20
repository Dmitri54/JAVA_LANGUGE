/**
 * Урок 6. SOLID
 * ===================================================================================================
 * 1. Single responsibility principle
 * Принцип единственной ответственности
 * 2. Open-closed principle
 * Принцип открытости/закрытости
 * 3. Liskov substitution principle
 * Принцип подстановки Лисков
 * 4. Interface segregation principle
 * Принцип разделения интерфейса
 * 5. Dependency inversion principle
 * Принцип инверсии зависимостей
 * =========================================================================================================
 * 
 * Single responsibility principle
 * 
 * Принцип гласит, что может быть только одна причина, приводящая к изменению класса.
 * Другими словами, каждый класс должен иметь только одну ответственность, которая должна быть 
 * инкапсулирована в этом классе.
 * 
 * - тестируемость;
 * - читаемость;
 * - короткое и понятное описание класса;
 * - простота сопровождения.
 * ==================================================================================================
 */

package OOP_JAVA.lessons.les_06;

import java.util.ArrayList;
import java.util.List;

// Single responsibility principle	
// Принцип единственной ответственности
// У класса есть предназначение

public class Ex001_1SRP {
    public static void main(String[] args) {
        Planner revengePlanner = new Planner();
        revengePlanner.addEntry("1");
        revengePlanner.removeEntry(0);
        revengePlanner.saveAllText("path");
        revengePlanner.loadFromDB("10.0.0.0","admin","1234");
    }
}

class Planner { // Создал класс Дневник

    List<String> entries = new ArrayList<>(); // Чтобы можно было сохранять записи

    public void addEntry(String text) { // Тут добавил функционал // Добавить
        entries.add(text);
    }
    public void removeEntry(int index) { // Удалить
        entries.remove(index);
    }
    @Override
    public String toString() {
        return String.join("\n", entries);
    }

    public void saveAllText(String path) {
        /// ошибки связанные с...
    }
    
    public void loadFromFile(String path) {
        /// ошибки связанные с...
    }

    public void loadFromDB(String url, String username, String password) {
        /// ошибки связанные с...
    }
}
/**
 * В данном примере представленно много методов в одном классе, это усложняет работу 
 * по тестированию такого кода. Нужно избегать этого, разделяя код по сущностям.
 * Смотри Ex001_2SRP
 */