package homeWork7Arrays.figuresHierarphy;

/**
 * Created by Александр on 17.03.2016.
 */
public class Rectangle extends Figure {
    private double a;
    private double b;
    private String name;

    public String getName() {
        return name;
    }

    public Rectangle(double a, double b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    @Override
    public double perimetrCalculation() {
        return 2 * (a + b);
    }

    @Override
    public double areaCalculation() {
        return a * b;
    }
}
