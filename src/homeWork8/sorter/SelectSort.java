package homeWork8.sorter;

import java.util.Comparator;

/**
 * Created by Александр on 21.03.2016.
 */
public class SelectSort {
    public void sort(int[] unsort) {
        int index;
        for (int i = 0; i < unsort.length; i++) {
            index = i;
            for (int j = i + 1; j < unsort.length; j++) {
                if (unsort[j] < unsort[index]) {
                    index = j;
                }
            }

            if (i != index) {
                int temp = unsort[i];
                unsort[i] = unsort[index];
                unsort[index] = temp;
            }
        }
    }

    public void sort(Object[] unsort, Comparator comparator) {
        int index;
        for (int i = 0; i < unsort.length; i++) {
            index = i;
            for (int j = i + 1; j < unsort.length; j++) {
                if (comparator.compare(unsort[j], unsort[index]) < 0) {
                    index = j;
                }
            }

            if (i != index) {
                Object temp = unsort[i];
                unsort[i] = unsort[index];
                unsort[index] = temp;
            }
        }
    }
}
