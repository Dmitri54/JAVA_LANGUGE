package OOP_JAVA.seminars.sem_01.src.main.Unit;

public class Sniper extends Character{
    int accuracy = 5;
    int cartridges = 5;
    int disguise = 20; 

    public Sniper (String name, int hp, int attack){
        super(name, hp, attack);
    }
    @Override
    public int getAttack(){
        return 15;
    }
   

}
