package homeWork7.figuresHierarphy;

/**
 * Created by Александр on 18.03.2016.
 */
public class Circle extends Figure {

    private double diametr;
    private String name;

    public String getName() {
        return name;
    }

    public Circle(double diametr, String name) {
        this.diametr = diametr;
        this.name = name;
    }

    private double radiusCalculation() {
        return diametr / 2;
    }

    @Override
    public double perimetrCalculation() {
        return 2 * Math.PI * (diametr / 2);
    }

    @Override
    public double areaCalculation() {
        return Math.PI * Math.pow(radiusCalculation(), 2);
    }
}
