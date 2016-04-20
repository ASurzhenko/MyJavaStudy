package homeWork7Collections.arrays;

import exceptions.MyOwnOutOfIndexException;

/**
 * Created by Александр on 31.03.2016.
 */
public class MyLinkedList implements MyList {

    private MyListElement next;

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "next=" + next +
                '}';
    }

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
            throw new MyOutOfIndexException("size: " + size() + " index: " + index);
        } else {
            try {
                return next.get(index);
            }catch (IndexOutOfBoundsException e) {
                throw new MyOwnOutOfIndexException("size: " + size() + " index: " + index);
            }
        }
    }

    @Override
    public int size() {
        if (next == null) {
            return 0;
        } else {
            return next.size();
        }
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
