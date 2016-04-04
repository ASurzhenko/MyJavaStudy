package homeWork9.guessNumber;

/**
 * Created by Александр on 02.04.2016.
 */
public class PersonWhoKeepsTheGame {
    public void start(Think Think, Guess Guess) {
        int assumedNumber = Guess.assumeNumber();
        int result = Think.numberCheck(assumedNumber);

        while (result != 0) {
            System.out.println(assumedNumber);
            assumedNumber = Guess.assumeNumber(result);
            result = Think.numberCheck(assumedNumber);
        }
        System.out.println("You are right! The secret number was: " + assumedNumber);
    }
}
