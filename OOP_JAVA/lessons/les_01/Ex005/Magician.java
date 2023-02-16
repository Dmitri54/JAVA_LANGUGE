package OOP_JAVA.lessons.les_01.Ex005;
/**
 * Пример:
 * Допустим, нужно описать игру в рамках которой будет два класса описывающих игровых персонажей.
 */ 

import java.util.Random;

public class Magician { // Первый персонаж, условно маг.
    private static int number;
    private static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int mana;
    private int maxMana;

    static {
        Magician.number = 0;
        Magician.r = new Random();
    }

    public Magician(String name, int hp, int mana) { // Конструктор.
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mana = mana;
        this.maxMana = mana;
    }

    public Magician() { // Конструктор.
        this(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200),
                Magician.r.nextInt(50, 150));
    }

    public int Attack() { // Конструктор (механизм атаки).
        int damage = Magician.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() { // Конструктор (метод) получения информации.
        return String.format("Name: %s  Hp: %d Enegry:  %d Type: %s",
                this.name, this.hp, this.mana, this.getClass().getSimpleName());
    }
    
    public void healed(int Hp) { // Метод лечения персонажа.
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) { // Метод получения урона.
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
}
