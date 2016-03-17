package homeWork.figures;

/**
 * Created by Александр on 25.02.2016.
 */
public class RectangleTask {
    public static void main(String[] args) {

        /*Rectangle rectangle = new Rectangle(8, 7);
        double perimetr = 30;
        double area = 56;

        rectangle.sidesCalculation(perimetr, area);*/

        RectangleArea area = new RectangleArea(7, 8);
        area.areaCalculation();

        RectanglePerimetr perimetr = new RectanglePerimetr(7, 8);
        perimetr.perimetrCalculation();
    }
}
