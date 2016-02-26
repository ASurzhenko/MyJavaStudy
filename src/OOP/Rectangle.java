package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class Rectangle {
    static int sides = 4;

    int width;
    int heigth;
    String color;

    public int calculateArea() {
        return heigth * width;
    }

    public void changeSidesCount() {
        sides = sides + 1;
    }
}


