package lessons.java_projects_06.part_2;

public class Worker { // Создал класс Worker.
// Характеристики класса, то что будет у класса Worker.    
    int id;
    int salary;
    String firstName;
    String lastName;

   
    @Override // Метод переведет информацию в String и выведет в терминал.
    public String toString() { 
        return String.format("%d %s %s %d", id, firstName, lastName, salary);
    }

    @Override // Метод сравнения экземпляров класса Worker.
    public boolean equals(Object o) { // Приходит Object.
        var t = (Worker) o; // Сохраняю (кастую) его в переменную. 
        return id == t.id && firstName == t.firstName; // Если id совпадают и firstName, то они равны. true
    }
    @Override // Так делать нельзя, но это пример.
    public int hashCode() {
        return id;
    }
}
