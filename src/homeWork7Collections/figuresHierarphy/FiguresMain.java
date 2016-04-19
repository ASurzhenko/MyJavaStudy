package homeWork7Collections.figuresHierarphy;

import homeWork7Collections.hierarchyColors.BlueColor;
import homeWork7Collections.hierarchyColors.Color;
import homeWork7Collections.hierarchyColors.GreenColor;
import homeWork7Collections.hierarchyColors.RedColor;

/**
 * Created by Александр on 17.03.2016.
 */
public class FiguresMain {
    public static void main(String[] args) {

        Square square = new Square(5, "Square");
        Rectangle rectangle = new Rectangle(5, 3, "Rectangle");
        Circle circle = new Circle(2, "Circle");

        Color squareColor = new BlueColor("Blue", 2);
        Color rectangleColor = new GreenColor("Green", 3);
        Color circleColor = new RedColor("Red", 5);

        System.out.println("The perimetr of " + square.getName() + " is " + square.perimetrCalculation());
        System.out.println("The area of " + square.getName() + " is " + square.areaCalculation());
        System.out.println("Consumption of " + squareColor.getColor() + " paint for " + square.getName() +
                " is " + squareColor.getConsumption() * square.areaCalculation());

        System.out.println("The perimetr of " + rectangle.getName() + " is " + rectangle.perimetrCalculation());
        System.out.println("The area of " + rectangle.getName() + " is " + rectangle.areaCalculation());
        System.out.println("Consumption of " + rectangleColor.getColor() + " paint for " + rectangle.getName() +
                " is " + rectangleColor.getConsumption() * rectangle.areaCalculation());

        System.out.println("The perimetr of " + circle.getName() + " is " + circle.perimetrCalculation());
        System.out.println("The area of " + circle.getName() + " is " + circle.areaCalculation());
        System.out.println("Consumption of " + circleColor.getColor() + " paint for " + circle.getName() +
                " is " + circleColor.getConsumption() * circle.areaCalculation());

    }
}
