package homeWork8.sorter;

import java.util.Comparator;

/**
 * Created by Александр on 21.03.2016.
 */
public class InsertSort {
    public void sort(int[] unsort) {
        int temp;
        for (int i = 1; i < unsort.length; i++) {
            temp = unsort[i];
            for (int j = i - 1; j >= 0; j--) {
                if (unsort[j] < temp) {
                    break;
                }

                unsort[j + 1] = unsort[j];
                unsort[j] = temp;
            }
        }
    }

    public void sort(Object[] unsort, Comparator comparator) {
        Object temp;

        for (int i = 1; i < unsort.length; i++) {
            temp = unsort[i];
            for (int j = i - 1; j >= 0; j--) {
                if (comparator.compare(unsort[j], temp) < 0) {
                    break;
                }

                unsort[j + 1] = unsort[j];
                unsort[j] = temp;
            }
        }
    }
}

