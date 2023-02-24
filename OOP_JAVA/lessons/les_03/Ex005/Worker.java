package OOP_JAVA.lessons.les_03.Ex005;

public class Worker implements Comparable<Worker> { 
// тут имплементация Интерфейса Comparable параметризированный <Worker>
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

//     @Override
//     public int compareTo(Worker o) { 
// // Метод, который содержит в себе что значит один worker больше другого.
//         if (this.age > o.age) 
// // Если возраст текущего больше чем возраст следующего, то возвращаю 1.
//             return 1;
//         else if (this.age < o.age) // Если меньше, -1.
//             return -1;
//         else
//             return 0; // Если равны, 0.
//     } // Можно написать короче и проще.

    // @Override
    // public int compareTo(Worker o) { 
    //     return Integer.compare(this.age, o.age); 
    // }
// Если нужно описать сравнение по другому кретерию:
    @Override
    public int compareTo(Worker o) { 
        return Integer.compare(this.salary, o.salary); 
    }
// Для того чтобы можно было менять критерии сортировки, нужно описать отдельный класс AgeComporator.java
    
}
