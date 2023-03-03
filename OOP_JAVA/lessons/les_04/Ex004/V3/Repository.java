package OOP_JAVA.lessons.les_04.Ex004.V3;

import java.util.ArrayList;
import java.util.List;


public class Repository<T extends Content> { 
// T может быть только тем типом, который ниже по иерархии Content
// Чтобы закрыть возможность создавать репозитории других типов.
    List<T> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }

    // В качестве тренировки реализуйте возможность работы с foreach

}
