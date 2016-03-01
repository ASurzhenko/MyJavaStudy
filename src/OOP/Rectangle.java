package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class Rectangle {
    static final int SIDES_OF_RECTANGLE = 4;

    private int width;
    private int heigth;
    private String color;
    private String toString;

    public Rectangle() {

    }

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public int calculateArea() {
        return heigth * width;
    }

    public String toString(int c) {

        int i;
        String s;

        System.out.println(c);

        if (Math.random() > 0.5) {
            i = 1;
        } else {
            i = 2;
        }

        if (Math.random() > 0.5) {
            s = "1";
        }

        {
            int a;
        }



        System.out.println(i);
        // System.out.println(s);
        // System.out.println(a);

        toString = "Rectangle(a = ";
        toString += width;
        toString += ", b=";
        toString += heigth + ")";
        return toString;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean equals(Rectangle other) {
        return width == other.width && heigth == other.heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


