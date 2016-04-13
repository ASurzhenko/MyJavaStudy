package homeWork7Arrays.arrays;

import java.util.Iterator;

/**
 * Created by Александр on 13.04.2016.
 */
public class ImprovedArrayIterator implements Iterator {

    private ImprovedArray improvedArray;
    private int index;

    public ImprovedArrayIterator(ImprovedArray improvedArray) {
        this.improvedArray = improvedArray;
    }

    @Override
    public void remove() {
        improvedArray.remove(index);
    }

    @Override
    public boolean hasNext() {
        return index < improvedArray.size();
    }

    @Override
    public Object next() {
        Object next = improvedArray.get(index);
        index++;
        return next;
    }
}
