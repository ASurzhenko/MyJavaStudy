package homeWork;

/**
 * Created by Александр on 25.02.2016.
 */
public class Rectangle {

    int area;
    int perimeter;

    int array[] = new int[area];

    public void init() {

        for (int i = 0; i < area; i++) {
            array[i] = i + 1;
        }
    }

    public void sidesCalculation() {

        for (int i = 0; i < area; i++) {
            for (int j = 0; j < area; j++) {
                if ((array[i] + array[j] == perimeter / 2) && (array[i] * array[j] == area)) {
                    System.out.println("The sides of the rectangle are " + array[i] + " and " + array[j]);
                    i = area;
                    break;
                }
            }
        }
    }
}
