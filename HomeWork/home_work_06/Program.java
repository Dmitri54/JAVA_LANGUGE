/**
 * Д/з 6. 
 * Разработать программу, имитирующую поведение коллекции HashSet. 
 * В программе содать:
 * метод add добавляющий элемент, 
 * метод toString возвращающий строку с элементами множества, 
 * метод позволяющий читать элементы по индексу. 
 * Формат данных Integer.
 */

package HomeWork.home_work_06;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        MySet mySet = new MySet();

        mySet.add(1);
        mySet.add(37);
        mySet.add(5);

        System.out.println(mySet.toString());

        for (int i = 0; i < mySet.size(); i++) {
            System.out.println(mySet.get(i));            
        }

    }


}

class MySet {
    private HashMap<Integer,Object> map = new HashMap<>();
    private static final Object OBJ = new Object();

    @Override
    public String toString(){ // 
        return map.keySet().toString();
    }

    public boolean add(Integer i){ // Добавление элемента.
        return map.put(i, OBJ) != null ? true : false;
    }

    public Integer size(){
        return map.keySet().size();
    }

    public Integer get(Integer i){
        return (Integer) map.keySet().toArray()[i];
    }
}