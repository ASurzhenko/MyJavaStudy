package homeWork;

/**
 * Created by Александр on 25.02.2016.
 */
public class Rectangle {

    private static int angle = 90;
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void sidesCalculation(double perimetr, double area) {

        double a = 1;
        double b = perimetr / 2;
        double c = area;
        double d = (b * b) - (4 * a * c);

        length = (b + Math.sqrt(d)) / 2;
        width = (b - Math.sqrt(d)) / 2;

        System.out.println("Length is " + length);
        System.out.println("Width is " + width);
    }

    public double areaCalculation() {

        double area = length * width;

        return area;
    }

    public double perimetrCalculation() {

        double perimetr = 2 * (length + width);

        return perimetr;
    }
}
