package OOP_JAVA.lessons.les_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Liskov substitution principle
// Принцип подстановки Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель
public class Ex003_1LSP {
    public static void main(String[] args) throws Exception {
        List<Animal> list = 
        new ArrayList<>(Arrays.asList(new Cat(), new Fish() ));
        for (var animal : list) {
            System.out.println(animal.getType());
            System.out.println(animal.getLegsCount()); // Будет Ошибка, т.к. у Рыб лап нет.
        }
    }
}

abstract class Animal { // Есть абстрактный класс Животное
    public String getType() { // Функционал. // Покажет тип животного
        return "Зверушка";
    }

    public int getLegsCount() throws Exception { // Количество лап
        return 0;
    }
}
// Простраиваю иерархию
class Cat extends Animal { // класс Котики наследует Animal

    @Override
    public String getType() {
        return "кошечка";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}

class Fish extends Animal // класс Рыба. 
{
     @Override
     public String getType() {
        return "Рыбка";
     }
     public int getLegsCount() throws Exception { // У Рыб лап нет, что делать?????????????????????
        throw new Exception("я же рыбка...");
     }
}

/**
 * Liskov substitution principle
 * 
 * Требует возможности использования любых порожденных классов на месте родительских.
 * При этом они должны обладать тем же поведением, что и родительские классы,
 * без внесения изменений.
 * Этот принцип гарантирует, что порожденный класс не изменяет определение типа
 * родительского и его поведение.
 * ==================================================================================================
 * У Рыб лап нет. Что делать???????????????????????????????????????????????????????????????????
 * Явно разделять.
 * Смотри Ex003_2LSP
 * 
 * 
 */