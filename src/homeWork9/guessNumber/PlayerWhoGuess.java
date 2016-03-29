package homeWork9.guessNumber;

/**
 * Created by Александр on 29.03.2016.
 */
public class PlayerWhoGuess {

    private int tryCounter = 0;

    public void humanGuessTheNumber(int key, int number) {
        if (number > key) {
            System.out.println("More");
            tryCounter++;
        } else if (number < key) {
            System.out.println("Less");
            tryCounter++;
        } else {
            tryCounter++;
            System.out.println("You guessed! My number is " + number);
            System.out.println("You guessed from try " + tryCounter);
        }
    }

    public String computerGuessTheNumber(int key) {
        int[] diapasone = new int[101];
        for (int i = 0; i < 101; i++) {
            diapasone[i] = i;
        }
        int first = 0;
        int last = diapasone.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (key < diapasone[mid])
                last = mid - 1;
            else {
                if (key > diapasone[mid]) {
                    first = mid + 1;
                } else {
                    tryCounter++;
                    return "Your number is " + mid + ". I guessed from try " + tryCounter;
                }
                tryCounter++;
            }
        }
        return "I can't guess!";
    }
}

