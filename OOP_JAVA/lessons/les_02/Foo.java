package OOP_JAVA.lessons.les_02;

// class Doo extends Foo {

//     public void M(){
//         Foo.getCount(); // Если стоит public у count, то так можно обратиться к функции, но не к count. 
//         Foo.count = 123; // Можно так обратиться к count, т.к. стоит protected.
//     }
// }

public class Foo {
    public Integer value;

    protected static Integer count; 

    // public static getCount(){
    //     return count;
    // }

    static { // Это статический метод, так принято писать, инициализация статического поля.
        count = 0;
    }

    public Foo(){
        count++;
    }

    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString(){ // Перегружаю toString()
        return value.toString();
    }
}
