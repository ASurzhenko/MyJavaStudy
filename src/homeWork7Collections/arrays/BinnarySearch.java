package homeWork7Collections.arrays;

/**
 * Created by Александр on 28.04.2016.
 */
public class BinnarySearch {

    public boolean search(int[] array, int value) {
        if (array.length == 0) {
            return false;
        }
        if (array.length == 1) {
            return array[0] == value;
        }
        int start = 0;
        int end = array.length - 1;
        return deepSearch(array, value, start, end);
    }

    public boolean deepSearch(int[] array, int value, int start, int end) {

        int middle = (start + end) / 2;
        if (array[middle] == value) {
            return true;
        }
        if (end < start) {
            return false;
        } else if (array[middle] < value) {
            start = middle + 1;
        } else if (array[middle] > value) {
            end = middle - 1;
        } else return true;
        return deepSearch(array, value, start, end);
    }
}
