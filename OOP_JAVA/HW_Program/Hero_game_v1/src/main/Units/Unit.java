package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Unit implements GameInterface {

    protected String name;
    protected int hp; // Здоровье
    int levl; // Уровень
    protected int power; // Энергия
    protected  boolean step; // Ходьба
    int speed, maxHp, def, damegeMin, damegeMax, x, y;

    public Unit(String name ){
        this.name = name;
        this.hp = 100;
        this.levl = 1;
        this.power = 100;
        this.step = false;
    }

    public Unit(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.levl = levl;
        this.power = power;
        this.step = step;
        this.speed = speed;
        this.maxHp = maxHp;
        this.def = def;
        this.damegeMin = damegeMin;
        this.damegeMax = damegeMax;
        this.x = x;
        this.y = y;
    }

    public static String setName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    public static ClassesUnits setClass(){
        return ClassesUnits.values()[new Random().nextInt(ClassesUnits.values().length -1)];
    }

    public static void createArreyUnit1(ArrayList <Unit> arrayList, ClassesUnits classesUnits){
        switch (classesUnits){
            case Sniper -> arrayList.add(new Sniper(setName()));
            case Mag -> arrayList.add(new Mag(setName()));
            case Monk -> arrayList.add(new Mag(setName()));
            case Fermer -> arrayList.add(new Fermer(setName()));
            case Robber -> arrayList.add(new Robber(setName()));
            case Spearman -> arrayList.add(new Sniper(setName()));
            case Crossbowman -> arrayList.add(new Robber(setName()));
        } 
    }

    public static void createArreyUnit2(ArrayList <Unit> arrayList, ClassesUnits classesUnits){
        switch (classesUnits){
            case Sniper -> arrayList.add(new Spearman(setName()));
            case Mag -> arrayList.add(new Monk(setName()));
            case Monk -> arrayList.add(new Monk(setName()));
            case Fermer -> arrayList.add(new Fermer(setName()));
            case Robber -> arrayList.add(new Robber(setName()));
            case Spearman -> arrayList.add(new Spearman(setName()));
            case Crossbowman -> arrayList.add(new Crossbowman(setName()));
        }
    }

    /**
     * Данные персонажа.
     */

     @Override
     public String toString() {
         return String.format("%s %d %d", name, hp, speed);
     }
 
     @Override
     public void step() {
 
     }
 
     @Override
     public String getInfo() {
         return "Я человек!";
     }
 
 
     public int getSpeed() {
         return speed;
     }
 
     public int getHp() {
         return hp;
     }
    
}
