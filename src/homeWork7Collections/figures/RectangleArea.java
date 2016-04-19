package homeWork7Collections.figures;

/**
 * Created by Александр on 29.02.2016.
 */
public class RectangleArea {

    private double width;
    private double length;

    public RectangleArea(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void areaCalculation() {

        double area = length * width;
        System.out.println("Area is " + area);
    }
}
