package homeWork1;

/**
 * Created by Александр on 03.03.2016.
 */
public class ImprovedArray {

    private Object[] array = new Object[10];
    private int elementsCounter = 0;

    public void add(String value) { //fills in the elements one by another
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

    public Object get(int index) { //returns the element on index

        return array[index];
    }

    public int size() { //this is the counter of the elements

        return elementsCounter;
    }

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

    public String toString() { //returns string without null

        String goodString = "Our good string: ";
        for (int i = 0; i < elementsCounter; i++) {
            goodString = goodString + array[i] + " ";
        }
        return goodString;
    }

    public boolean contains(Object obj) {

        for (int i = 0; i < elementsCounter; i++) {
            if (this.array[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
