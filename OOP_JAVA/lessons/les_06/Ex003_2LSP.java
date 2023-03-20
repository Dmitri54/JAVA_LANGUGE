package OOP_JAVA.lessons.les_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Liskov substitution principle
// Принцип подстановки Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель

public class Ex003_2LSP {
    public static void main(String[] args) {
        List<AbstractAnimal> list1 = new ArrayList<>(Arrays.asList(new Dog(), new Python()));

        for (var animal : list1) {
            System.out.println(animal.getType());
        }
// В итоге на этапе компиляции Java не даст создать список Питонов (Python) и вызвать для него функцию getLegsCount,
// т.к. она не описана в этом классе. 
        // List<Legs> list2 = new ArrayList<>(Arrays.asList(new Dog(), new Python())); // Будет ошибка!!!!!!!!
        // for (var animal : list2) {
        //     System.out.println(animal.getLegsCount());

        // }
    }
}

abstract class AbstractAnimal { // Базовый абстрактный класс Зверушка
// Тут я могу узнать только тип этого животного, т.к. любое животное имеет свое наименование
    public String getType() { 
        return "Зверушка";
    }
}

interface Legs { // Выделил отдельно интерфейс.
    int getLegsCount(); // Считае количество лапок.
}

// Создал класс Собака наследник Зверушка и имплементирует интерфейс Legs
class Dog extends AbstractAnimal implements Legs { 

    @Override // Переопределил getType, для получения типа.
    public String getType() {
        return "собачка";
    }

    @Override // Переопределил getLegsCount. Описал getLegsCount 
    public int getLegsCount() {
        return 4;
    }
}

// Создал класс Питон наследник Зверушка. Но без интерфейса Legs, значит описывать getLegsCount не нужно.
class Python extends AbstractAnimal {
    @Override
    public String getType() {
        return "питончик";
    }
}
