package homeWork7.figuresHierarphy;

/**
 * Created by Александр on 17.03.2016.
 */
public class FiguresMain {
    public static void main(String[] args) {
        Square square = new Square(5, "Square");
        Rectangle rectangle = new Rectangle(5, 3, "Rectangle");

        System.out.println("The perimetr of " + square.getName() + " is " + square.perimetrCalculation());
        System.out.println("The area of " + square.getName() + " is " + square.areaCalculation());

        System.out.println("The perimetr of " + rectangle.getName() + " is " + rectangle.perimetrCalculation());
        System.out.println("The area of " + rectangle.getName() + " is " + rectangle.areaCalculation());
    }
}
