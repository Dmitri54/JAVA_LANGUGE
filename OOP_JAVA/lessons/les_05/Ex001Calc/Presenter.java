package OOP_JAVA.lessons.les_05.Ex001Calc;

public class Presenter {
    View view;
    Model model; // Типо абстракция, я могу и незнать, что за модель и представление там будет.

    public Presenter(Model m, View v) { // Конструктор
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: "); // Ввод данных
        int b = view.getValue("b: ");
        model.setX(a); // Передаю в класс Model данные, которые пришли из View, чтобы сохранить
        model.setY(b);
        int result = model.result(); // Вызываю метод .result() у класс Model он есть.
        view.print(result, "Sum: "); // Передаю данные из Model во View.
    }
}
