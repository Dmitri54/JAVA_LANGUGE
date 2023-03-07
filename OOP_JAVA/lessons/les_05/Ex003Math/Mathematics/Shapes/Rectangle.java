package OOP_JAVA.lessons.les_05.Ex003Math.Mathematics.Shapes;

public class Rectangle extends Shape {

    private double width; // ширина
    private double height; // высота

    public static Rectangle create(double width, double height, String name) {
        // ???...
        var instance = new Rectangle();
        instance.name = name;

        instance.width = width;
        instance.height = height;
        return instance;
    }

    private Rectangle() { // Скрытый конструктор прямоугольника
    }

    @Override
    public double getArea() { // Перегрузка метода. Вычисления площади, для прямоугольника
        return this.width * this.height;
    }

    @Override
    public String toString() { // Печать прямоугольника
        // ???...
        return String.format("Name: %s  width: %d  height: %d", name, width, height);
    }
}
