package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class RectangleExample {
    public static void main(String[] args) {

        Rectangle firstRectangle = new Rectangle();
        firstRectangle.setHeigth(2);
        firstRectangle.setWidth(3);
        firstRectangle.setColor("Blue");

        int w = firstRectangle.getWidth();
        int a = firstRectangle.calculateArea();

        //   System.out.println(firstRectangle.heigth);
        //   System.out.println(firstRectangle.color);

        Rectangle secondRectangle = new Rectangle();
        secondRectangle.setHeigth(5);
        secondRectangle.setWidth(10);
        //   secondRectangle.color = "Grey";
        //    System.out.println("rectangle's color is " + secondRectangle.color);

        secondRectangle.calculateArea();

        int firstRectangleWidth = 3;
        int firstRectangleHeigth = 4;
        int secondRectangleWidth = 5;
        int secondRectangleHeidth = 10;

        int area = calculateArea(firstRectangleHeigth, secondRectangleWidth);
        area = calculateArea(firstRectangle);
        //    System.out.println(area);

        Rectangle thirdRectangle = null;

        //  thirdRectangle.calculateArea();
        firstRectangle.setWidth(4);

        //  anotherMethod();

        System.out.println("the first rectangle is " + firstRectangle.toString());
        System.out.println(firstRectangle);

        Rectangle anotherRectangle = new Rectangle(firstRectangle.getWidth(), firstRectangle.getHeigth());

        System.out.println("the another rectangle is " + anotherRectangle.toString());

        System.out.println(firstRectangle == anotherRectangle);
        System.out.println(firstRectangle.equals(anotherRectangle));



    }

    public static void anotherMethod() {

        int i = 10;
        System.out.println("some string");

        anotherAnotherMethod();
    }

    public static void anotherAnotherMethod() {

       /* Rectangle rectangle = null;
        rectangle.calculateArea();*/
    }

    public static int calculateArea(int height, int width) {
        return height * width;
    }

    public static int calculateArea(Rectangle rectangle) {
        return rectangle.getHeigth() * rectangle.getWidth();
    }
}
