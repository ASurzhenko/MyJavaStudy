package homeWork9.guessNumber;

/**
 * Created by Александр on 30.03.2016.
 */
public class ComputerThink implements Think{

    private int number;

    public ComputerThink(int from, int to) {
        number = (int) (Math.random() * (to - from) + from);
        System.out.println("I have a secret number, try to guess it:");
    }

    @Override
    public int numberCheck(int probableNumber){
        return Integer.compare(number, probableNumber);
    }
}
