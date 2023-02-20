package OOP_JAVA.lessons.les_02.Ex004;

public abstract class BaseHero {

    int hp;

    public BaseHero(String name, int hp) {
        System.out.println("Вызван BaseHero(String name, int hp)");
        this.hp = hp;
    }

    public BaseHero() {
        this("", 0);
        System.out.println("Вызван BaseHero()");
    }
}
