package homeWork7Arrays.arrays;

/**
 * Created by Александр on 31.03.2016.
 */
public class MyLinkedList implements MyList {

    private MyListElement next;


    @Override

    public void add(Object value) {
        if (next == null) {
            next = new MyListElement(value);
        } else {
            next.add(value);
        }
    }

    @Override
    public Object get(int index) {
        if (next == null) {
            return null;
        } else {
            return next.get(index);
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean equals(ImprovedArray other) {
        return false;
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(Object obj) {

    }
}
