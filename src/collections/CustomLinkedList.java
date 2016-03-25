package collections;

import patterns.iteraor.CustomLinkedListIterator;

import java.util.Iterator;

/**
 * Created by User on 22.03.2016.
 */
public class CustomLinkedList implements Iterable{

    private ListElement next;

    public int size() {

        if (next == null) {
            return 0;
        } else {
            return next.size();
        }

    }

    public void add(String tom, String grey, Object o) {
        if (next == null) {
            next = new ListElement(o);
        } else {
            next.add(0);
        }
    }

    public Object get(int index) {
        if (next == null) {
            return null;
        } else {
            return next.get(index);
        }
    }


    public Iterator iterator() {
        new CustomLinkedListIterator(next);
    }
}
