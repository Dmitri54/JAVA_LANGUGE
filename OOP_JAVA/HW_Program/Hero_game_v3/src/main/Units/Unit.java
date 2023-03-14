package OOP_JAVA.HW_Program.Hero_game_v3.src.main.Units;

import java.util.ArrayList;

public abstract class Unit implements GameInterface {
    protected String name, clas;
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
        this.clas = clas;
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
    

    public String getInfo(){return "Я человек!";}

    public String getPrint(){
        return String.format("%10s HP:%3d State: %5s %7s", clas, hp, state, "");
    }
}
