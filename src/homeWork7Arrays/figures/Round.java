package homeWork7Arrays.figures;

/**
 * Created by Александр on 25.02.2016.
 */
public class Round {

    private int diametr = 46;

    public double radiusCalculation() {

        double radius = diametr / 2;

        return radius;
    }

    public double perimetrCalculation() {

        double perimetr = 2 * Math.PI * radiusCalculation();

        return perimetr;

    }
}
