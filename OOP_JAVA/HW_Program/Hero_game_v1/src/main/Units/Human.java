package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

import java.util.ArrayList;

public abstract class Human implements GameInterfase {
    // protected ArrayList<Human> myTeam;
    protected String name;
    protected float hp;
    protected int maxHp;
    protected int attack;
    protected int damageMin;
    protected int damageMax;
    protected int defense;
    protected int speed;

    protected Vector2D coords;
    public String state; // Текущее состояние

    protected static int heroCnt; // Счетчик героев (переменная) - целочисленная (int), защищенная (protected) 
// видна только в пакете Human.java, static - адрес этой переменной будет формироваться в момент загрузки шаблона.
// И дальше при создании других экземпляров, будет передоваться ссылка на него, а не создаваться новый.

    protected Human(String name, float hp, int maxHp, int attack, int damageMin,
                 int damageMax, int defense, int speed, int posX, int posY) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defense = defense;
        this.speed = speed;
        coords = new Vector2D(posX, posY); // Ссылочный тип данных (сам создал).
        state = "Stand";
        heroCnt++; // При каждом создании нового наследника, будет увеличиваться счетчис.
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) + 
                " D:" + defense + 
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax)/ 2)) +
                state;
    }

    public int getSpeed() { return speed; }
    public float getHp () { return hp; }

// его нужно убрать когда будут методы step у наследников.
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) { }

// Метод - ищет ближайших по комманде.
    protected int findNearest(ArrayList<Human> team){ 
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDistance(team.get(i).coords) & !team.get(i).state.equals("Die")) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }

    protected void getDamage(float damage){ //Поведение. Получить повреждения
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if (hp > maxHp) hp = maxHp;
    }
    @Override
    public StringBuilder getInfo() { // Поведение.
        return new StringBuilder();
    }
}
