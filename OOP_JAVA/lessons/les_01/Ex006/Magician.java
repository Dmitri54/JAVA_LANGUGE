package OOP_JAVA.lessons.les_01.Ex006;

public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200)); // Вызываю конструкторы базового класса
        this.maxMana = Magician.r.nextInt(50, 150); // далее, делаю до инициализацию параметров
        this.mana = maxMana;
    }

    public int Attack() { 
        int damage = BaseHero.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8); // Для персонажа определена логика атаки
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() { // метод получения информации.
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    } // super.getInfo() - выдаст Имя, Здоровье, Тип, а this.mana - количество mana
}
