package homeWork7Arrays.arrays;

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

        improvedArray.remove(2);

        for (Object o : improvedArray) {
            System.out.print(o + " ");
        }
    }
}
