package OOP_JAVA.seminars.sem_02.src;

// public class Archer extends Human { // Пример наследования.
//     int shots, maxShots; // Поля. Пишу, только то что относиться к Archer.
//     float dist;

//     public float getDist(){return dist;}
// }

/**
 * Этот класс тоже может быть abstract
 * Пример: у меня может быть не только лучник, но и арбалетчик. 
 * Отличия арбалетчик от снайпера, только сколько у него повреждений, количество снарядов, растояние выстрела,
 * т.е. инициализация у них разная вот этих параметров, а сами параметры одинаковые.
 * 
 * Это повод усложнить дерево моих объектов, но за то упростить инициализацию. 
 * 
 */

public abstract class Archer extends Human { // Пример абстрактного класса лучник.
    int shots, maxShots; 
    float dist;
    String name;

    public Archer(float hp, int maxHp, int damage, int att, int def, int shots, int maxShots, float dist) {
        super(hp, maxHp, damage, att, def);
        this.shots = shots;
        this.maxShots = maxShots;
        this.dist = dist;
    }


    public float getDist(){return dist;}
}