package homeWork8.sorter;

import homeWork7.arrays.ImprovedArray;

import java.util.Arrays;

/**
 * Created by Александр on 21.03.2016.
 */
public class SortMain {
    public static void main(String[] args) {

        int[] array1 = {8, 3, 1, 9, 34, 77, 11};

        SelectSort selectSort = new SelectSort();

        InsertSort insertSort = new InsertSort();

        selectSort.sort(array1);

        System.out.println("Int array: " + Arrays.toString(array1));

        Object[] array2 = {8, 3, 1, 9, 34, 77, 11};

        insertSort.sort(array2, new SortComparator());

        System.out.println("Object Array: " + Arrays.toString(array2));

        ImprovedArray improvedArray = new ImprovedArray();

        improvedArray.add("hello");
        improvedArray.add("you");
        improvedArray.add("apple");

        selectSort.sort(improvedArray.getArray(), new ImprovedArrayComparator());

        System.out.println("Improved Array: " + improvedArray.toString());

    }
}
