package homeWork7Collections.figures;

/**
 * Created by Александр on 29.02.2016.
 */
public class RectanglePerimetr {

    private double width;
    private double length;

    public RectanglePerimetr(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void perimetrCalculation() {

        double perimetr = 2 * (length + width);
        System.out.println("Perimetr is " + perimetr);

    }
}
