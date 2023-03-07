package OOP_JAVA.lessons.les_05.Ex002Phonebook.UI;

import java.util.Scanner;

import OOP_JAVA.lessons.les_05.Ex002Phonebook.Config;
import OOP_JAVA.lessons.les_05.Ex002Phonebook.Core.MVP.Presenter;
import OOP_JAVA.lessons.les_05.Ex002Phonebook.Core.MVP.View;

public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");
// ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы

        View view = new NewConsoleView(); 
// Тут прописал новый можно и старый ConsoleView()
        Presenter presenter = new Presenter(view, Config.pathDb); // в себя принемает данные.
        presenter.LoadFromFile(); // Загрузка данных 

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - prev  2 - next");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev(); // При нажатии 1 будет следующая запись
                        break;
                    case "2":
                        presenter.next(); // при нажатии кнопки 2 будет предыдущая запись
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
