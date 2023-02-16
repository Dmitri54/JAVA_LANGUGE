package OOP_JAVA.lessons.les_01.Ex003;

public class Program {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);

        // a.setX(12);
        // System.out.println(a.getInfo()); // Поставил private
        // Point2D a = new Point2D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());

        Point2D b = new Point2D(0);
        System.out.println(b);
        // Point2D b = new Point2D(0, 10);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
