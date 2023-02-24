package OOP_JAVA.lessons.les_03.Ex007;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage
        implements Iterable<Ingredient> {
    public List<Ingredient> components;
    int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component) {

        if (!(components.indexOf(component) != -1)) 
// Если данный компонент, который я добавляю уже имеется, то делать ничего не нужно.
            components.add(component);
    }

}
