package homeWork7Collections.arrays;

import java.util.Iterator;

/**
 * Created by Александр on 03.03.2016.
 */
public class ImprovedArray implements MyList, Iterable {

    private Object[] array = new Object[10];
    private int elementsCounter = 0;

    public Object[] getArray() {
        return array;
    }

    @Override
    public void add(Object value) { //fills in the elements one by another
        if (elementsCounter == array.length) {
            makeLargerArray();
        }

        array[elementsCounter] = value;
        elementsCounter++;
    }

    public void makeLargerArray() {
        Object[] array = new Object[this.array.length * 2];
        for (int i = 0; i < this.array.length; i++) {
            array[i] = this.array[i];
        }
        this.array = array;
    }

    @Override
    public Object get(int index) { //returns the element on index

        try {
            return array[index];
        } catch (IndexOutOfBoundsException e) {
            throw new MyOutOfIndexException("size: " + size() + " index: " + index);
        }
    }

    @Override
    public int size() { //this is the counter of the elements

        return elementsCounter;
    }

    @Override
    public boolean equals(ImprovedArray other) {
        if (elementsCounter != other.elementsCounter) {
            return false;
        } else {
            for (int i = 0; i < elementsCounter; i++) {
                if (!array[i].equals(other.array[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() { //returns string without null

        String goodString = "";
        for (int i = 0; i < elementsCounter; i++) {
            if (array[i] == null) {
                continue;
            }
            goodString = goodString + array[i] + " ";
        }
        return goodString;
    }

    @Override
    public boolean contains(Object obj) {

        for (int i = 0; i < elementsCounter; i++) {
            if (this.array[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(int index) {
        Object[] array = new Object[elementsCounter];
        for (int i = 0; i < elementsCounter; i++) {
            if (i == index) {
                continue;
            }
            array[i] = this.array[i];
        }
        this.array = array;
    }

    @Override
    public void remove(Object obj) {
        Object[] array = new Object[elementsCounter];
        for (int i = 0; i < elementsCounter; i++) {
            if (this.array[i].equals(obj)) {
                continue;
            }
            array[i] = this.array[i];
        }
        this.array = array;
    }

    @Override
    public Iterator iterator() {
        return new ImprovedArrayIterator(this);
    }

    public void addElementByIndex(Object element, int index) {
        array[index] = element;
    }
}
