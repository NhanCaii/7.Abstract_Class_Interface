import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}