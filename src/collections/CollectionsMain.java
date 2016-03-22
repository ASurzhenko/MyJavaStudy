package collections;

import OOP.Cat;

import java.util.*;

/**
 * Created by User on 18.03.2016.
 */
public class CollectionsMain {
    public static void main(String[] args) {
        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat("tom", "grey", 2015));
        list.add(new Cat("tom", "grey", 2015));
        list.add(new Cat("tom", "grey", 2015));

        System.out.println(list);

        Cat tom = (Cat) list.get(2);

        LinkedList<Cat> linkedList = new LinkedList<>();
        linkedList.add(new Cat("tom", "grey", 2015));
        linkedList.add(new Cat("tom", "grey", 2015));
        linkedList.add(new Cat("tom", "grey", 2015));

        System.out.println(linkedList.get(1));

        printList(list);
        printList(linkedList);

        Collection<Cat> cats = linkedList;

        TreeSet<Cat> sortedCats = new TreeSet<>();

        sortedCats.add(new Cat("tom", "grey", 2015));
        sortedCats.add(new Cat("tom", "grey", 2011));
        sortedCats.add(new Cat("tom", "grey", 2013));
        sortedCats.add(new Cat("Murzic", "grey", 2013));

        System.out.println("Set: ");
        printForEach(sortedCats);
    }

    public static void printForEach(Collection<Cat> collection) {
        for (Cat cat : collection) {
            System.out.println(cat);
        }
    }

    public static void printList(List<Cat> cats) {
        for(int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}
