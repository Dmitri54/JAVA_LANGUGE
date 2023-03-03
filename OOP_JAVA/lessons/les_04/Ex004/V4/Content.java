package OOP_JAVA.lessons.les_04.Ex004.V4;

public abstract class Content {
    public String name;

    public Content(String name) {
        this.name = name;
    }
    public Content() {
        this("-");
    }

    @Override
    public String toString() {
        return name;
    }
}
