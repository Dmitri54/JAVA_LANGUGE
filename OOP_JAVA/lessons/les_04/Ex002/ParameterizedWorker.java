package OOP_JAVA.lessons.les_04.Ex002;

public class ParameterizedWorker<E> { // Тут я описал параметрического Worker, в котором указал, 
// что в качестве Обобщения (<E>) будет использоваться какой-то на перед не известный тип.
    private E id; // Далее указываю приватное поле типа E, какое я незнаю, но то что оно будет это тоочно. 

    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public ParameterizedWorker(E id, String firstName,
            String lastName,
            int age,
            int salary) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;

    }

    public String getId() {
        return String.format("%s", id);
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
}