package homeWork9.guessNumber.computer;

import homeWork9.guessNumber.Player;

/**
 * Created by Александр on 29.03.2016.
 */
public class Computer extends Player implements ComputerGuessesFromHuman {


    @Override
    public void guessTheNumber(int key) throws InterruptedException {

        int[] array = new int[100];
        for (int i : array) {
            array[i] = i;
        }


    }
}
