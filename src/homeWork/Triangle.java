package homeWork;

/**
 * Created by Александр on 25.02.2016.
 */
public class Triangle {

    int sideA = 5;
    int sideB = 6;
    int sideC = 7;

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
