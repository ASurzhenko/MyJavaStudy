package homeWork8.sorter;

import java.util.Comparator;

/**
 * Created by Александр on 21.03.2016.
 */
public class IntegerComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int number1 = (int) o1;
        int number2 = (int) o2;
        return number1 - number2;
    }
}
