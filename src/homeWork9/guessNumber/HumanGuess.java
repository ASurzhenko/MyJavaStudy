package homeWork9.guessNumber;

import java.util.Scanner;

/**
 * Created by Александр on 04.04.2016.
 */
public class HumanGuess implements Guess {
    private int from;
    private int to;

    Scanner scanner = new Scanner(System.in);

    public HumanGuess(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public int assumeNumber() {

        return scanner.nextInt();

    }

    @Override
    public int assumeNumber(int numberGreater) {
        int assumeNumber;
        if (numberGreater > 0) {
            System.out.println("The secret number is grater");
            assumeNumber = scanner.nextInt();

        } else {
            System.out.println("The secret number is less");
            assumeNumber = scanner.nextInt();
        }
        return assumeNumber;
    }
}

