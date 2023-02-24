package OOP_JAVA.lessons.les_03.Ex002;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import OOP_JAVA.lessons.les_03.Ex002.ExBeverage.*;

public class Program {
    public static void main(String[] args) {

        //#region Intro Iterator
        // List<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(12);
        // nums.add(123);
        // nums.add(1234);
        // nums.add(12345);

        // Iterator<Integer> iter = nums.iterator();
        // while (iter.hasNext()) {
        //     System.out.println(iter.next());
        // }
        //#endregion

        //#region Worker Iterator
       
//         Worker worker = new Worker(
//             "Имя", "Фамилия", 23, 4567);

//         Iterator<String> components = worker; 
// // Привел переменную worker к типу String моего Итератора, который был имплементирован в Worker.java

//         while (components.hasNext()) {
//             System.out.println(worker.next());
//         }
       
        //#endregion
       
        //#region Beverage Iterator
/**
 * Пример: 
 * Если я хочу сделать кофе, то мне нужна вода, зёрна, молоко.
 */

        Beverage latte = new Coffee(); // Создал экземпляр класса Beverage (напиток).
        latte.addComponent(new Water("Вода")); // Компоненты 
        latte.addComponent(new Вeans("Зёрна"));
        latte.addComponent(new Milk("Молоко"));
        
        Iterator<Ingredient> iterator = latte; // Привожу latte к типу Iterator зависящий от Ingredient
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
// Если сейчас я могу используя Iterator получить методы hasNext() и next(), а если это же сделать, 
// но через цикл foreach, то как это сделать?
// Для этого нужно реализовать иной Интерфейс.
// Пример: Ex004

        // for (String string : latte) {
            
        // }

        //#endregion
    }
}
