package homeWork7Collections.arrays;

/**
 * Created by Александр on 13.04.2016.
 */
public class ImprovedArrayMain {
    public static void main(String[] args) {

        ImprovedArray improvedArray = new ImprovedArray();

        improvedArray.add(45);
        improvedArray.add(4);
        improvedArray.add(5);
        improvedArray.add(34);

        for (Object o : improvedArray) {
            System.out.print(o + " ");
        }

        System.out.println();

        improvedArray.remove(3);

        System.out.println(improvedArray.toString());

        System.out.println(improvedArray.get(3));

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("fdsfd");
        myLinkedList.add("fdsf");
        myLinkedList.add(22);

        System.out.println(myLinkedList.get(5));

    }
}
