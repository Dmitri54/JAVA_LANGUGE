package OOP_JAVA.lessons.les_01.Ex003;

/** 
 * Это точка 2D (так нужно писать docs)
*/
public class Point2D {
    private int x, y; // Это координата х и у  (так НЕ нужно писать docs)

    /**
     * Это конструктор ... (так нужно писать docs)
     * @param valueX это координата Х
     * @param valueY это координата Y
     */
    public Point2D(int valueX, int valueY) { // Конструктор, создание точки. (так НЕ нужно писать docs)
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) { // Конструктор, если есть одно значение. (так НЕ нужно писать docs)
        this(value, value); // Так будет использован конструктор, который написан ранее.
        // this.x = value;
        // this.y = value;
// this - позволяет не создавать новую переменную, а обращаться к существующей в классе.
    }

    public Point2D() { // Конструктор, если value = 0.
        this(0);
    }
    // public Point2D() {
    //     x = 0;
    //     y = 0;
    // }

    public int getX(){ // Конструктор, возвращает значение координаты X.
        return x;
    }

    public int getY(){ // Конструктор, возвращает значение координаты Y.
        return y;
    }
    
    public void setX(int value){ // Конструктор, изменит значение координаты.
        this.x = value; // this - работаю с полями внутри класса. 
    }

    public void setY(int value){
        this.y = value;
    }

    
    private String getInfo(){ // Так вывод координат будет нормальным
        return String.format("x: %d; y: %d", x, y);
    }
    // private - Не даст обратиться к методу из другого файла.

    @Override // Переопределение или перегрузка.
    public String toString() { // Переопределил метод toString()
        return getInfo();
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    // Объединил toString() и getInfo(). 
    // public String toString() { // Переопределил метод toString()
    //     return return String.format("x: %d; y: %d", x, y);
    // }

    // ctor
    // get; set;
    // docs (документация, комментарии)
    //
}
