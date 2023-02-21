package OOP_JAVA.seminars.sem_02.src;

// XBowMan - арбалетчик
public class XBowMan extends Archer { 
     
// Сделать два консруктора, один гибкий - передовать ему все параметры, это не удобно - параметров много.
// Во втором всего один параметр name, а остальные я заранее посчитал и записал их.
// Поэтому, когда я создаю XBowMan, то только, для того, чтобы инициализировать конструктор по умолчанию.
// Archer я сделал, чтобы обобщить всех лучников, а потом иметь возможность их добавлять.     

    public XBowMan (float hp, int maxHp, int damage, int att, int def, int shots, int maxShots, float dist, String name){
        super(hp, maxHp, damage, att, def, shots, maxShots, dist);
        super.name = name;
    }
    
// Конструктор по умолчанию с одним или без параметров.
    public XBowMan(String name){
        // super.name = name; - ошибка!!!
// Сначала нужно инициализировать поля super class, это super();, а потом иннициализирую поля этого класса.

        super(150, 150, 12, 5, 3, 22, 22, 3);
        super.name = name;
    }

    @Override
    public String getInfo(){
        return "Я Арбалетчик!";
    }
    

}