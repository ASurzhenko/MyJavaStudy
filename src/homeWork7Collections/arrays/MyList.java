package homeWork7Collections.arrays;

/**
 * Created by Александр on 31.03.2016.
 */
public interface MyList {

    void add(Object value);

    Object get(int index);

    int size();

    boolean equals(ImprovedArray other);

    boolean contains(Object obj);

    void remove(int index);

    void remove(Object obj);
}
