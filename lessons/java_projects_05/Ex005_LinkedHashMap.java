package lessons.java_projects_05;

import java.util.*;

public class Ex005_LinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(13, "тринадцать");
        map.put(1, "один");
        System.out.println(map); // {1=один, 11=один один, 13=тринадцать}
    }
}
