package homeWork7.figuresHierarphy;

import homeWork7.hierarchyColors.BlueColor;
import homeWork7.hierarchyColors.GreenColor;

/**
 * Created by Александр on 17.03.2016.
 */
public class FiguresMain {
    public static void main(String[] args) {

        Square square = new Square(5, "Square", "Blue");
        Rectangle rectangle = new Rectangle(5, 3, "Rectangle");

        BlueColor squareColor = new BlueColor("Blue", 2);
        GreenColor rectangleColor = new GreenColor("Green", 3);

        System.out.println("The perimetr of " + square.getName() + " is " + square.perimetrCalculation());
        System.out.println("The area of " + square.getName() + " is " + square.areaCalculation());
        System.out.println("Consumption = " + square.colorConsumption(squareColor.getConsumption()));

       /* System.out.println("The perimetr of " + rectangle.getName() + " is " + rectangle.perimetrCalculation());
        System.out.println("The area of " + rectangle.getName() + " is " + rectangle.areaCalculation());
        System.out.println("Consumption = " + rectangle.colorConsumption(rectangleColor.getConsumption));*/

    }
}
