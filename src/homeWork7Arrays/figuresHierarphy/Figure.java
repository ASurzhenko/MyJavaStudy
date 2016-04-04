package homeWork7Arrays.figuresHierarphy;

/**
 * Created by Александр on 17.03.2016.
 */
public abstract class Figure {

    private String color;

    public String getColor() {
        return color;
    }

    /*public double colorConsumption() {
        return areaCalculation() * ;
    }*/

    public abstract double perimetrCalculation();

    public abstract double areaCalculation();
}
