package guessNumber;

/**
 * Created by User on 01.04.2016.
 */
public class ComputerSecretKeeper implements SecretKeeper{
    private int secretNumber;

    public ComputerSecretKeeper(int from, int to) {
        secretNumber = (int) (Math.random() * (to - from) + from);
        System.out.println("sectet is:" + secretNumber);
    }

    @Override
    public int checkNumber(int probableNumber) {
        return Integer.compare(secretNumber, probableNumber);
    }

}
