package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class RectangleExample {
    public static void main(String[] args) {

        Rectangle firstRectangle = new Rectangle();
        firstRectangle.heigth = 2;
        firstRectangle.width = 3;
        firstRectangle.color = "Blue";

        int w = firstRectangle.width;
        int a = firstRectangle.calculateArea();

        System.out.println(firstRectangle.heigth);
        System.out.println(firstRectangle.color);

        Rectangle secondRectangle = new Rectangle();
        secondRectangle.heigth = 5;
        secondRectangle.width = 10;
        System.out.println("rectangle's color is " + secondRectangle.color.charAt(0));

        secondRectangle.calculateArea();

        int firstRectangleWidth = 3;
        int firstRectangleHeigth = 4;
        int secondRectangleWidth = 5;
        int secondRectangleHeidth = 10;

        int area = calculateArea(firstRectangleHeigth, secondRectangleWidth);
        area = calculateArea(firstRectangle);
        System.out.println(area);

        Rectangle thirdRectangle = null;

        //  thirdRectangle.calculateArea();
        firstRectangle.width = 4;
    }

    public static int calculateArea(int height, int width) {
        return height * width;
    }

    public static int calculateArea(Rectangle rectangle) {
        return rectangle.heigth * rectangle.width;
    }
}
