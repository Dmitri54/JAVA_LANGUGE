package OOP_JAVA.seminars.sem_01.src.main.Unit;

public class Farmer extends Character{

    private int feed;
    private int cartridges;


    public Farmer (String name, int hp, int attack){
        super(name, hp, attack);
    }

    public int getCartridges(){
        return 10;
    }

    public int getFeed(){
        return 0;
    }
    

}

