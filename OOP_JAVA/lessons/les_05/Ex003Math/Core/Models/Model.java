package OOP_JAVA.lessons.les_05.Ex003Math.Core.Models;

import OOP_JAVA.lessons.les_05.Ex003Math.Mathematics.CalculateArea.Calculate;
import OOP_JAVA.lessons.les_05.Ex003Math.Mathematics.Shapes.Canvas;
import OOP_JAVA.lessons.les_05.Ex003Math.Mathematics.Shapes.Shape;

public class Model {
    Shape panel;
    Calculate calc;

    public Model(Calculate c, String canvasName) {
        panel = new Canvas(canvasName);//"Без имени (2).jpg");
        calc = c;
    }

    public void append(Shape shape) { // Логика добавления.
        panel.shapes.add(shape);
    }

    public double area() { // Вычисление площади.
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }

}