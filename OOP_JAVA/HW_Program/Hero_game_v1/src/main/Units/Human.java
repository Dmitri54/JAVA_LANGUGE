package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

import java.util.ArrayList;

public abstract class Human implements GameInterfase {
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
        coords = new Vector2D(posX, posY);
        state = "Stand";
    }

    public int getSpeed() { return this.speed; }
    public float getHp () { return this.hp; }
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) { }
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
    protected void getDamage(float damage){ // Получить повреждения
        hp -= damage;
        if (hp > maxHp) hp = maxHp;
        if (hp < 0) state = "Die";
    }
    @Override
    public StringBuilder getInfo() {
        return new StringBuilder();
    }
}
