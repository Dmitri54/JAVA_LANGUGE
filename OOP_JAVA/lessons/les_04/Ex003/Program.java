package OOP_JAVA.lessons.les_04.Ex003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(1,2,3,4));
        

        // var el = Methods.getElementFromIntegerCollection(data, 1);
        // System.out.println(el);
        // el = Methods.<Integer>getElementFromUCollection(data, 2);
        // el = Methods.getElementFromUCollection(data, 2);
        // System.out.println(el);
        Integer t = Methods.getElementFromUCollection(data, 1);
        // Integer t = Methods.<Integer>getElementFromUCollection(data, 1); // Тоже самое.
        System.out.println(t);

    }
}
