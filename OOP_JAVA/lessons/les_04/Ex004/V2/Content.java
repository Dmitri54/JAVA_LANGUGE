package OOP_JAVA.lessons.les_04.Ex004.V2;

public abstract class Content { // Без изменений (к V1).
    public String name;

    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
