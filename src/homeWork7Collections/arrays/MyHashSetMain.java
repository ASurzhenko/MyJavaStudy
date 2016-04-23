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
        /*myHashSet.add(89);
        myHashSet.add(1189);
        myHashSet.add(28229);
        myHashSet.add(38229);
        myHashSet.add(48229);
        myHashSet.add(58229);
        myHashSet.add(68229);
        myHashSet.add(78229);
        myHashSet.add(88229);
        myHashSet.add(98229);
        myHashSet.add(23);*/

        System.out.println(myHashSet.toString());

        myHashSet.remove(3);

        System.out.println(myHashSet.toString());
    }
}
