package homeWork9.guessNumber;

/**
 * Created by Александр on 28.03.2016.
 */
public abstract class Player {

    protected int numberToGuess;
    protected int tryCounter;

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public void setNumberToGuess(int numberToGuess) {
        this.numberToGuess = numberToGuess;
    }



}
