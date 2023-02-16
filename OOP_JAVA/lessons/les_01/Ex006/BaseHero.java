package OOP_JAVA.lessons.les_01.Ex006;

import java.util.Random;

public class BaseHero { // Конструктор, создание персонажа
    protected static int number; // Подсчет персонажа
    protected static Random r; // Для любого из персонажей может потребоваться генератор псевдо случайных чисел

    protected String name; 
    protected int hp;
    protected int maxHp;

    static { // Инициализарор статических полей
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }
 
    public BaseHero(String name, int hp) {  // Конструктор, отвечает за инициализацию имени и максимального HP.
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() { // Конструктор по умолчанию.
        this(String.format("Hero_Priest #%d", ++BaseHero.number),
        BaseHero.r.nextInt(100, 200));
    }

    public String getInfo() { // Конструктор, получения информации.
        return String.format("Name: %s  Hp: %d  Type: %s", // Имя, Здоровье, Тип.
                this.name, this.hp, this.getClass().getSimpleName());
    }
    
    public void healed(int Hp) { // Метод лечения.
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) { // Метод получения урона.
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
}
