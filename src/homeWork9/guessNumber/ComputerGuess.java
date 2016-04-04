package homeWork9.guessNumber;

/**
 * Created by Александр on 29.03.2016.
 */
public class ComputerGuess implements Guess{
    private int from;
    private int to;

    public ComputerGuess(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public int assumeNumber() {
        return (to + from) / 2;
    }

    @Override
    public int assumeNumber(int numberGreater){
        if(numberGreater > 0){
            from = assumeNumber();
        }else {
            to = assumeNumber();
        }
        return assumeNumber();
    }
}

