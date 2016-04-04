package homeWork7Arrays.figuresHierarphy;

/**
 * Created by Александр on 17.03.2016.
 */
public class Square extends Figure {

    private double a;
    private String name;

    public String getName() {
        return name;
    }

    public Square(int a, String name) {
        this.a = a;
        this.name = name;
    }

    @Override
    public double perimetrCalculation() {
        return 4 * a;
    }

    @Override
    public double areaCalculation() {
        return Math.pow(a, 2);
    }
}
