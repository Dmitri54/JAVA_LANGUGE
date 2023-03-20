package OOP_JAVA.lessons.les_06;

import java.util.ArrayList;
import java.util.List;

// Single responsibility principle	
// Принцип единственной ответственности
// У класса есть предназначение

public class Ex001_2SRP {
    public static void main(String[] args) {

        PlannerSRP planner = new PlannerSRP();
        planner.addEntry("1");
        planner.removeEntry(0);
        // planner.saveAllText("path");
        // planner.loadFromDB("10.0.0.0","admin","1234");
        DataManager dm = new DataManager();
        dm.saveAllText(planner, "c:\\безысходность\\srp.txt");

    }
}

class PlannerSRP { // Так же есть некий Планировщик(Дневник) и функционал который касается только его.
    List<String> entries = new ArrayList<>();

    public void addEntry(String text) { // Добавить
        entries.add(text);
    }
    public void removeEntry(int index) { // Удалить
        entries.remove(index);
    }
    @Override
    public String toString() {
        return String.join("\n", entries);
    }    
}


class DataManager { // Далее выделил класс Менеджер, который будет работать с файлами, базой данных.
    private boolean check(String filenameOfConnect){
        return true;
    }

    public void saveAllText(PlannerSRP planner,String path) {
        /// ошибки связанные с...
        if(check(path));///
    }
    
    public void loadFromFile(PlannerSRP planner,String path) {
        /// ошибки связанные с...
        if(check(path));///
    }

    public void loadFromDB(String url, String username, String password) {
        /// ошибки связанные с...
        if(check(url));///
    }    
}

/**
 * Это один из вариантов, который позволяет разделить ответственность.
 * Можно сделать и по другому разбиение фукционала между сущностями.
 */