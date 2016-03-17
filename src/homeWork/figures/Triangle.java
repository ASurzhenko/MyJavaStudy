package homeWork.figures;

/**
 * Created by Александр on 25.02.2016.
 */
public class Triangle {

    private int sideA = 5;
    private int sideB = 6;
    private int sideC = 7;

    public double areaCalculation() {

        double p = (sideA + sideB + sideC) / 2;
        double s = p * (p - sideA) * (p - sideB) * (p - sideC);
        double area = Math.sqrt(s);

        return area;
    }

    public double perimetrCalculation() {

        double perimetr = sideA + sideB + sideC;

        return perimetr;
    }
}
