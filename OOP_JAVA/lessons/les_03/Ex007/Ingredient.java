package OOP_JAVA.lessons.les_03.Ex007;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }

    @Override
    public boolean equals(Object obj) { 
// Описываю, что значит объекты равны, чтобы больше не добавлять такой же. 
        Ingredient t = (Ingredient) obj;
        return t.brand == this.brand;
    }
}
