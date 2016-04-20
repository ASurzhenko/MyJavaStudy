package homeWork7Collections.arrays;

/**
 * Created by Александр on 31.03.2016.
 */
public class MyListElement {

    private Object value;
    private MyListElement next;

    public MyListElement(Object value) {
        this.value = value;
    }



    public void add(Object value) {
        if (next == null) {
            next = new MyListElement(value);
        } else {
            next.add(value);
        }

    }

    public Object get(int index) {

        if (index == 0) {
            return value;
        } else {
            if (next == null) {
                return null;
            }
            return next.get(index - 1);

        }
    }

    @Override
    public String toString() {
        return "MyListElement{" +
                "next=" + next +
                '}';
    }

    public int size() {
        if (next == null) {
            return 1;
        } else {
            return next.size() + 1;
        }
    }

}
