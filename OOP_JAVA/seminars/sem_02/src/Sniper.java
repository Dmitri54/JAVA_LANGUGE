package OOP_JAVA.seminars.sem_02.src;

// Снайпер.
public class Sniper extends Archer { 

// Конструктор по умолчанию с одним или без параметров.
    public Sniper(String name){
        super(100, 100, 18, 6, 2, 22, 22, 3);
        super.name = name;
    };
    
}
