package homeWork7.figuresHierarphy;

/**
 * Created by Александр on 17.03.2016.
 */
public class Square extends Figure {

    private double a;
    private String name;
    private String color;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Square(int a, String name, String color) {
        this.a = a;
        this.name = name;
        this.color = color;
    }

    @Override
    public double perimetrCalculation() {
        return 4 * a;
    }

    @Override
    public double areaCalculation() {
        return Math.pow(a, 2);
    }

    @Override
    public double colorConsumption(double consumption) {
        return areaCalculation() * consumption;
    }
}
