package homeWork7Collections.arrays;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Александр on 20.04.2016.
 */
public class MyHashSet {
    private LinkedList[] buckets = new LinkedList[10];
    private double loadFactor;

    public double getLoadFactor() {
        return loadFactor;
    }

    public void add(Object obj) {
        if (timeToResize()) {
            resize();
        }
        addElement(obj, buckets);

    }

    private void resize() {
        LinkedList[] buckets = new LinkedList[this.buckets.length * 2];
        for (int i = 0; i < this.buckets.length; i++) {
            buckets[i] = this.buckets[i];
        }
        this.buckets = buckets;
    }

    private boolean timeToResize() {

        return loadFactor > (int) (buckets.length * 0.75);
    }

    public void addElement(Object obj, LinkedList[] buckets) {

        int index = indexCalculation(obj);

        if (buckets[index] != null && !buckets[index].contains(obj)) {

            buckets[index].add(obj);
            loadFactor++;
        } else {
            LinkedList adding = new LinkedList();
            adding.add(obj);
            buckets[index] = adding;
            loadFactor++;
        }

    }

    public boolean contains(Object obj) {
        int index = indexCalculation(obj);

        return (buckets[index] != null) && buckets[index].contains(obj);
    }

    private int indexCalculation(Object obj) {
        return obj.hashCode() % buckets.length;
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
