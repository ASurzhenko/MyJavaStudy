package homeWork7Collections.arrays;

import java.util.Collection;

/**
 * Created by Александр on 26.04.2016.
 */
public class FloatCollection {

    public float sum(Collection<Float> collection) {
        float sum = 0;
        for (Float o : collection) {
            sum += o;
        }

        return sum;
    }

}
