package OOP_JAVA.lessons.les_04.Ex004.V1;

import java.util.ArrayList;
import java.util.List;


public class Repository {
    List<Content> ds; // Заранее пишу, что будут использованы элементы Content

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name); // В рабочем коде, не нужно.
    }

    public void add(Content content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public Content get(Integer index) {
        return ds.get(index);
    }

    // В качестве тренировки реализуйте возможность работы с foreach

}
