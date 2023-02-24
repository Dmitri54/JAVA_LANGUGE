package OOP_JAVA.lessons.les_03.Ex004.ExBeverage;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage 
            implements Iterable<Ingredient> {
// т.е. Beverage будет имплементоровать в себя Iterable обобщенным Ingredient.
    public List<Ingredient> components;
    int index;
    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){ 
// Тут можно прописать, что делать если component повторяется.
        components.add(component);
    }

}
