package OOP_JAVA.lessons.les_05.Ex002Phonebook.Core.Models;

import java.time.LocalDate;

public class Contact  implements Comparable<Contact> {
    public LocalDate date;
    public String firstName;
    public String lastName;
    public String company;
    public String phone;
    //public Email email; 
// Тут свой тип, т.к. проверять, что вводит пользователь!!! Сюда можно свой метод или отдельныю сущность.
    //public String email;
    public String description;
// Это пример, поэтому все на типе String

    public Contact(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
// Это пример, поэтому использую три параметра.
    // добавить возможность создания объектов с большим
    // количеством параметров

    @Override
    public int compareTo(Contact o) {
        // ???...
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Contact t = (Contact)obj;
        return this.firstName == t.firstName 
                && this.lastName == t.lastName;
    }
// Тут по простому, если они равны значить контакты одинаковые
}
