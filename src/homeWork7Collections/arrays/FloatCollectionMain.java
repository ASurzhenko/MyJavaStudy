package homeWork7Collections.arrays;

import java.util.ArrayList;

/**
 * Created by Александр on 27.04.2016.
 */
public class FloatCollectionMain {
    public static void main(String[] args) {

        FloatCollection floatCollection = new FloatCollection();

        ArrayList<Float> list = new ArrayList<Float>();
        list.add(0.4f);
        list.add(0.4f);
        list.add(0.4f);
        list.add(0.4f);

        System.out.println(floatCollection.sum(list));
    }
}
