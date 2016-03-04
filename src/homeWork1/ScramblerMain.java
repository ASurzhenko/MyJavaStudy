package homeWork1;

/**
 * Created by Александр on 04.03.2016.
 */
public class ScramblerMain {
    public static void main(String[] args) {

        String message = "Hello";
        String key = "jfhyd";
        char[] charArrayKey = key.toCharArray();

        Scrambler scrambler = new Scrambler(charArrayKey);

        System.out.println(scrambler.crypt(message));


    }
}
