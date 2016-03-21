package homeWork8.sorter;

import java.util.Comparator;

/**
 * Created by Александр on 22.03.2016.
 */
public class ImprovedArrayComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return o1.hashCode() - o2.hashCode();
    }
}
