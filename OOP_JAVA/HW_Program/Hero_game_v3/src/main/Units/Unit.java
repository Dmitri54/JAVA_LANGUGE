package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Unit implements GameInterface {
    protected String name;
    protected float hp;
    protected int maxHp;
    protected int attack;
    protected int damageMin;
    protected int damageMax;
    protected int defense;
    protected int speed;

    protected Vector2D pos;
    public String state; // Текущее состояние

    protected Unit(String name, float hp, int maxHp, int attack, int damageMin,
                 int damageMax, int defense, int speed, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defense = defense;
        this.speed = speed;
        pos = new Vector2D(x, y);
        state = "Stand";
    }

    public static String getName() { // Дать случайное имя
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) + 
                " D:" + defense + 
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax)/ 2)) + " " +
                state;
    }

    public int getSpeed() { return this.speed; }

    public float getHp () { return this.hp; }

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) { }
    
    protected int findNearest(ArrayList<Unit> team){
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > pos.getDistance(team.get(i).pos) & !team.get(i).state.equals("Die")) {
                index = i;
                min = pos.getDistance(team.get(i).pos);
            }
        }
        return index;
    }
    protected void getDamage(float damage){ // Получить повреждения
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if (hp > maxHp) hp = maxHp;
    }
    

    @Override
    public String getInfo() {
        return "Я человек!" + "HP: " + this.hp;
    }

    public int[] getPos() {
        return new int[]{pos.x, pos.y};
    }

    public String getState() {
        return state;
    }
}
