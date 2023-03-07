package OOP_JAVA.lessons.les_05.Ex003Math.Client;

import java.util.Scanner;

import OOP_JAVA.lessons.les_05.Ex003Math.Core.Views.View;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public String get() { // добавление
        return in.next();
    };

    @Override
    public void set(String value) { // печать
        System.out.println(value);

    }
}
