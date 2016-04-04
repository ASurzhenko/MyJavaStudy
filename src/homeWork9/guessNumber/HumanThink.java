package homeWork9.guessNumber;

/**
 * Created by Александр on 05.04.2016.
 */
public class HumanThink implements Think {

    private int number;
    private int from;
    private int to;

    public HumanThink(int from, int to, int number) {
        this.from = from;
        this.to = to;
        this.number = number;
    }

    @Override
    public int numberCheck(int probableNumber) {
        return Integer.compare(number, probableNumber);
    }
}
