package homeWork;

/**
 * Created by Александр on 25.02.2016.
 */
public class RectangleTask {
    public static void main(String[] args) {

        Rectangle a = new Rectangle();

        a.area = 56;
        a.perimeter = 30;
        a.array = new int[a.area];

        a.init();
        a.sidesCalculation();
    }
}
