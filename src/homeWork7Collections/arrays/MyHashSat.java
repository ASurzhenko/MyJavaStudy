package homeWork7Collections.arrays;

import java.util.Arrays;

/**
 * Created by Александр on 20.04.2016.
 */
public class MyHashSat {

    private Object[] elements = new Object[10];
    private int loadFactor;

    public void addElement(Object obj) {
        int index = obj.hashCode() % elements.length;

        elements[index] = obj;

    }

    @Override
    public String toString() {
        return "MyHashSat{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
