package OOP_JAVA.lessons.les_05.Ex003Math.Mathematics.CalculateArea;

import OOP_JAVA.lessons.les_05.Ex003Math.Mathematics.Shapes.Shape;

public class CalculateArea implements Calculate {

    private static CalculateArea instance;
    // static {
    // instance = new CalculateArea();
    // }

    public static CalculateArea getInstance() {
        if (instance == null)
            instance = new CalculateArea();
        return instance;
    }

    private CalculateArea() {
    }

    /**
     * RefInt
     */
    private class RefInt { // Тут описан класс внутри класса.
        public double value;

        public RefInt(double ident) {
            value = ident;
        }
    }

    private void calculate(Shape shape, RefInt ref) { // Счититает площадь всех фигур.
        ref.value += shape.getArea(); 

        for (Shape item : shape.shapes) {
            calculate(item, ref);
        }

    }

    public double visit(Shape shape) { // Проходит по всем фигурам // Передаю фигуру
        RefInt area = new RefInt(0); 

        calculate(shape, area); // Вызываю метод подсчета площади

        return area.value;
    }

}
