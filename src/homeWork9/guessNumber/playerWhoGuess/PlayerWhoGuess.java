package homeWork9.guessNumber.playerWhoGuess;

import homeWork9.guessNumber.Player;

/**
 * Created by Александр on 29.03.2016.
 */
public class PlayerWhoGuess extends Player {

    @Override
    public void guessTheNumber(int key) {
        if (numberToGuess > key) {
            System.out.println("More");
            tryCounter++;
        } else if (numberToGuess < key) {
            System.out.println("Less");
            tryCounter++;
        } else {
            tryCounter++;
            System.out.println("You guessed! My number is " + numberToGuess);
            System.out.println("You guessed from try " + tryCounter);
        }
    }
}
