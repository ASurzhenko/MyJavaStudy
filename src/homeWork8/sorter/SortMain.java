package homeWork8.sorter;

import homeWork7Collections.arrays.ImprovedArray;

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

        insertSort.sort(array2, new IntegerComparator());

        System.out.println("Object Array: " + Arrays.toString(array2));

        ImprovedArray improvedArray = new ImprovedArray();

        improvedArray.add("6");
        improvedArray.add("4");
        improvedArray.add("7");
        improvedArray.add("apple");
        improvedArray.add("dfgdfgdfgdfg");
        improvedArray.add("apple");
        /*improvedArray.add("dfgd");
        improvedArray.add("apple");
        improvedArray.add("1");
        improvedArray.add("a");*/

        System.out.println(improvedArray.toString());

        selectSort.sort(improvedArray.getArray(), new ImprovedArrayComparator());

        System.out.println("Improved Array: " + improvedArray.toString());

    }
}
