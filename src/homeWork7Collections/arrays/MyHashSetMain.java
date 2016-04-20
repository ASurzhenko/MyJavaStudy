package homeWork7Collections.arrays;

/**
 * Created by Александр on 20.04.2016.
 */
public class MyHashSetMain {
    public static void main(String[] args) {

        MyHashSet myHashSet = new MyHashSet();

        myHashSet.add(0);
        myHashSet.add(10);
        myHashSet.add(55);
        myHashSet.add(1430);
        myHashSet.add(140);
        myHashSet.add(11);
        myHashSet.add(89);
        myHashSet.add(189);
        myHashSet.add(8229);


        System.out.println(myHashSet.toString());
        System.out.println(myHashSet.getLoadFactor());

    }
}
