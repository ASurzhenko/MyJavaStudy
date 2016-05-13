package collections;

import OOP.Cat;

import java.util.*;

/**
 * Created by User on 18.03.2016.
 */
public class CollectionsMain {
    public static void main(String[] args) {
        HashSet<Cat> set = new HashSet<>();

        Cat cat1 = new Cat("tom", "grey", 2015);
        set.add(cat1);

        Cat cat2 = new Cat("tom", "grey", 2015);

        System.out.println("equals " + cat1.equals(cat2));
        System.out.println("hash 1: " + cat1.hashCode());
        System.out.println("hash 2: " + cat2.hashCode());

        System.out.println("set1 in set: " + set.contains(cat1));
        System.out.println("set1 in set: " + set.contains(cat2));

        ArrayList<Cat> list = new ArrayList();
        list.add(cat1);
        System.out.println("cat2 in list: " + list.contains(cat2));

        //cat1.setName("Barsik");
        System.out.println("hash for barsik: " + cat1.hashCode());

        System.out.println("Barsik in set: " + set.contains(cat1));

        set.add(new Cat("Murzik", "black", 2010));
        set.add(new Cat("Barsik", "white", 2011));
        set.add(new Cat("Murzik", "grey", 2010));
        set.add(new Cat("1", "grey", 2010));
        set.add(new Cat("2", "grey", 2010));
        set.add(new Cat("3", "grey", 2010));

        for (Cat cat : set) {
            System.out.println(cat);
        }

    }

    private static void lists() {
        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat("tom", "grey", 2015));
        list.add(new Cat("tom", "grey", 2015));
        list.add(new Cat("tom", "grey", 2015));

        System.out.println(list);

        Cat tom = list.get(2);

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
        sortedCats.add(new Cat("Murzik", "grey", 2013));

        System.out.println("Set: ");
        printForEach(sortedCats);
    }

    public static void printForEach(Collection<Cat> collection) {
        for (Cat cat : collection) {
            System.out.println(cat);
        }
    }

    public static void printList(List<Cat> cats) {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}
