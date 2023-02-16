package OOP_JAVA.lessons.les_01.Ex004;

import java.util.ArrayList;

public class Robot3 {

    enum State { 
        On, Off // Состояние, либо включен/выключен. 
    }

    private static int defaultIndex; // Статическое поле класса.
    private static ArrayList<String> names;
// Они мне нужны, чтобы убрать возможность создавать роботов с одинаковыми именами.
// Описал переменную defaultIndex, для нумерации и коллекцию names.
// 

    static { // Статический инициализатор.
        defaultIndex = 1; // Тут говорю, что начальный индекс = 1
        names = new ArrayList<String>(); // Иницаилизирую коллекцию names как пустую.
    }

    /** Уровень робота */
    private int level;

    /** Имя робота */
    private String name;

    private State state; // Новое поле состояние (state).

    /**
     * Создание робота
     * 
     * @param name  Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    private Robot3(String name, int level) { // Конструктор с двуми параметрами.
// После "правильные конструкторы" заменил слово public на private, для того чтобы не было возможности
// явно указания уровня (level). Поэтому скрул его. 
// Для конечного пользователя оставил открытым конструктор с одним и без параметров, остальное система
// сделает сама.

        System.out.println(Character.isDigit(name.charAt(0)));
        if ((name.isEmpty() // Если у меня имя будет пустым или
                || Character.isDigit(name.charAt(0))) // символ будет являться цифрой, или
                || Robot3.names.indexOf(name) != -1) // такое имя было задано ранеее, то в таком случае

        {
            this.name =
             String.format("DefaultName_%d", defaultIndex++); // даю дефолтное имя.
        } else {
            this.name = name; // Если имя новое использую его.
        }

        Robot3.names.add(this.name); // Добавляю новое имя в коллекцию
        this.level = level; // Произвел инициализацию уровня.
        this.state = State.Off; // Произвел инициализацию состояния.

    }
// ----------------------------------------------------------------------------------------------
// Можно добавить ещё. Если мне нужен конструктор с одним параметром или без них.
// ----------------------------------------------------------------------------------------------
    // #region другие конструкторы

    // public Robot3(String name) // Конструктор с одним параметром.
    // {
    // if ((name.isEmpty()
    // || Character.isDigit(name.charAt(0)))
    // || Robot3.names.indexOf(name) == -1)

    // { this.name = String.format("DefaultName_%d", defaultIndex++); }
    // else { this.name = name; }

    // Robot3.names.add(this.name);
    // this.level = 1;
    // this.state = State.Off;
    // }
// ----------------------------------------------------------------------------------------------------
    // public Robot3() // Конструктор без параметров.
    // {
    // this.name = String.format("DefaultName_%d", defaultIndex++);
    // Robot3.names.add(this.name);
    // this.level = 1;
    // this.state = State.Off;
    // }

    // #endregion
// ------------------------------------------------------------------------------------------------------
// Минус кода выше, повторение одного и того же.
// Don't repeat yourself!
// ------------------------------------------------------------------------------------------------------

    // #region правильные конструкторы

    public Robot3(String name) { // Конструктор с одним параметром 
        this(name, 1); // вызывает конструктор с двуми параметрами.
    }

    public Robot3() { // Конструктор без параметров
        this("");//вызывает конструктор с одним параметром, передовая в качестве аргумена пустую строку.
    }

    // #endregion

    // Методы вкл\выкл подсистем

    public void power() { // Даю пользователю одну кнопку.
        if (this.state == State.Off) { // Если система выключена,
            this.powerOn(); // то нужно поменять состояние 
            this.state = State.On; // и поставить статус, что она включена.
        } else { // если робот включен,
            this.powerOff(); // то нужно его выключить 
            this.state = State.Off; // и поставить состояние на выключен.
        }
        System.out.println();
    }

    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    /** Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /** Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }

    /** Приветствие */
    private void sayHi() {
        System.out.println("Hello world...");
    }

    /** Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /** Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /** Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /** Работа */
    public void work() {
        if (this.state == State.On) { // Если статус включен, то работа будет производиться, если нет, то нет.
            System.out.println("Working...");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d\n", this.name, this.level);
    }
}
