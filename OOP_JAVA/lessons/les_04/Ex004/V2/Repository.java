package OOP_JAVA.lessons.les_04.Ex004.V2;

import java.util.ArrayList;
import java.util.List;


public class Repository<T> { // <T> - Это Обобщение
    List<T> ds; // Скажу, что у меня будет коллекция типа <T>

    private String name;

    public Repository(String name) { // Без изменений (к V1).
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T content) { // Заменил тип Content на T
        ds.add(content);
    }

    public int count() { // Без изменений (к V1).
        return ds.size();
    }

    public T get(Integer index) { // Заменил тип Content на T
        return ds.get(index);
    }

    // В качестве тренировки реализуйте возможность работы с foreach

}
