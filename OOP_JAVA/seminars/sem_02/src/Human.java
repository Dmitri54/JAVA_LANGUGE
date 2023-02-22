package OOP_JAVA.seminars.sem_02.src;

// public class Human { // Пример инкапсуляции.

//     float hp, maxHp; // Поля класса
//     int damage, att, def;

//     public int getDef(){ // метод класса.
//         return def;
//     }
    
// }

public abstract class Human implements GameInterface { // Пример абстрактного класса.
// Создавать abstract class нельзя, т.к. у него нет полей, которые нужны мне во врнутренней логике программы.
    private float hp; // Поля класса 
// После сделал приватным, чтобы защитить от изменений!
    int damage, att, def, maxHp;

    // public static int humanCnt;
    private static int humanCnt = 10; // Я могу и задать сразу ему параметр (счетчик). 
    // private static int humanCnt; 
// Сделал его private, чтобы нельзя было его обнулять, после пишу метод геттре.
    public static int getHumanCnt(){return humanCnt;}

    public Human(float hp, int maxHp, int damage, int att, int def) {
        this.hp = hp; // this. - это параметры class Human.
        this.maxHp = maxHp;
        this.damage = damage;
        this.att = att;
        this.def = def;
        humanCnt++; // Я не могу его менять, но могу написать геттер.
    }

    @Override
    public void step(int a){}

    @Override
    public String getInfo() {return "Я человек! ";}

    public int getDef(){ // метод класса.
        return def;
    }

    public void setHp(float hp){if (hp >= 0) this.hp = hp;} 
// Если hp >= 0, то это hp = hp. Я сам себя защитил от отрицательных чисел.

    public float getHp(){return hp;}
// Вернет значение. Чтобы прочесть private параметр.

}
