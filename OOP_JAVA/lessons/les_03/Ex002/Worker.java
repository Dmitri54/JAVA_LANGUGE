package OOP_JAVA.lessons.les_03.Ex002;

import java.util.Iterator;

public class Worker implements Iterator<String> { 
// Нужно имплементировать Интерфейс Итератор с типом String (в данном примере).
// Если напишу Object, то код будет чуть короче.

    public String firstName;
    public String lastName;
    public int age;
    public int salary;
/**
 * 4 Поля
 * @param firstName
 * @param lastName
 * @param age
 * @param salary
 */
    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.index = 0;
    }
    /**
     * Конструктор.
     * @return
     */

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    int index; // Создал индекс.

    @Override
    public boolean hasNext() {
        return index++ < 4; // Увеличиваю индекс пока число он меньше 4.
    }
/**
 * Переопределил метод next() и описал какую-то логику.
 */
    @Override
    public String next() {
        switch (index) {
            case 1:
                // return firstName; // Можно так,
// Если напишу Object в public class Worker implements Iterator<Object>
                return String.format("firstName: %s", firstName);
            case 2:
                //return lastName;
                return String.format("lastName: %s", lastName);
            case 3:
                //return age;
                return String.format("age: %d", age);
            default:
                //return salary;
                return String.format("salary: %d", salary);

        }
    }
}
