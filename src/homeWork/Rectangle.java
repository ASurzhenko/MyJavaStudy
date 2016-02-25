package homeWork;

/**
 * Created by Александр on 25.02.2016.
 */
public class Rectangle {

    int angle = 90;
    double length;
    double width;
    double perimetr;
    double area;

    public void sidesCalculatio() {

        double a = 1;
        double b = perimetr / 2;
        double c = area;
        double d = (b * b) - (4 * a * c);

        length = (b + Math.sqrt(d)) / 2;
        width = (b - Math.sqrt(d)) / 2;

        System.out.println("Length is " + length);
        System.out.println("Width is " + width);
    }
}
