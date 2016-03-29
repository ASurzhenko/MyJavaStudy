package homeWork9.guessNumber;

import java.util.Random;

/**
 * Created by Александр on 30.03.2016.
 */
public class PlayerWhoThink {
    public int numberToGuess() {
        Random random = new Random();
        return random.nextInt(101);
    }
}
