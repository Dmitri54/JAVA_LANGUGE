package OOP_JAVA.lessons.les_06;

public class Ex005_1DIP {
    public static void main(String[] args) {
        Book book = new Book(); // Есть книга и я  
        book.viewAuthor(); // хочу посмотреть, кто там явзяесться автором.

    }
}

interface View { // Описал условный интерфейс Viev, содержит в себе метод print()
    void print(String text); 
}

// Есть какой-то ConsoleView, кторой 
class ConsoleView implements View {
    public void print(String text) {
        String result = String.format("ConsoleView %s", text); // Что-то будет показывать
        System.out.println(result);
    }
}

class WinFormView implements View {
    public void print(String text) {
        String result = String.format("WinFormView %s", text);
        System.out.println(result);
    }
}

class Book { // Класс Книги, который содержит в себе экземпляр view
    View view;

    int indexPage;

    public Book() {
        this.view = new ConsoleView(); // Инициализация view происходит на уровне конструктора
        indexPage = 1;
    } 
// Если завтра перестанет существовать ConsoleView, то предется все переписывать!!!!!!!!!!!!!!!!!!!!!!!
// Как сделать так, чтобы этого не происходило?
// Смотри Ex005_2DIP

    public void viewTitle() {
        view.print("Заголовок книги");
    }

    public void viewAuthor() {
        view.print("Авторы книги");
    }

    public void turnPage(int page) {
        if (page >= 1 && page <= 300)
            this.indexPage = page;
    }

    public void viewCurrentPage() {
        view.print(String.format("Страница: %s", indexPage));
    }
}

/**
 * Dependency inversion principle
 * Принцип инверсии зависимостей
 * - модули высокого уровня не должны зависеть от модулей нижнего уровня.
 * И те, и другие должны зависеть от абстракций.
 * - абстракции не должны зависеть от деталей.
 * Детали должны зависеть от абстракций.
 */
