package guessNumber;

/**
 * Created by User on 01.04.2016.
 */
public class ComputerSecretBreaker implements SecretBreaker {
    private int from;
    private int to;

    public ComputerSecretBreaker(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public int assumeNumber() {
        return (to - from) / 2;
    }

    @Override
    public int assumeNumber(int secretNumberGrater) {
        if (secretNumberGrater > 0) {
            from = assumeNumber();
        } else {
            to = assumeNumber();
        }
        return assumeNumber();
    }
}
