package homeWork7Arrays.arrays;

/**
 * Created by Александр on 03.03.2016.
 */
public class ArrayMain {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        ImprovedArray firstArray = new ImprovedArray();
        ImprovedArray secondArray = new ImprovedArray();

        System.out.println("Fill in the first array. Write \"end\" to finish:");
        fillTheArray(scanner, firstArray);

        System.out.println("Enter the index of the element of the first array:");
        printElement(scanner, firstArray);

        System.out.println("Fill in the second array. Write \"end\" to finish:");
        fillTheArray(scanner, secondArray);

        System.out.println("Enter the index of the element of the second array:");
        printElement(scanner, secondArray);

        if (firstArray.equals(secondArray)) {
            System.out.println("The first array equals the second one");
        } else {
            System.out.println("The first array don't equal the second one");
        }

        firstArray.remove("3");
        //firstArray.remove(2);

        System.out.println(firstArray.toString());
        System.out.println(secondArray.toString());
    }

    private static void printElement(Scanner scanner, ImprovedArray improvedArray) {
        int index = scanner.nextInt();
        System.out.println("The element of index " + index + " is " + improvedArray.get(index));
    }

    private static void fillTheArray(Scanner scanner, ImprovedArray improvedArray) {
        String value;
        do {
            value = scanner.next();
            if (value.equals("end")) {
                break;
            }
            improvedArray.add(value);
        } while (!value.equals("end"));*/

        ImprovedArray improvedArray = new ImprovedArray();
        ImprovedArray improvedArray2 = new ImprovedArray();

        improvedArray.add("cat");
        improvedArray2.add("cat");

        System.out.println(improvedArray.equals(improvedArray2));
    }
}
