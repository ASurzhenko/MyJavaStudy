package homeWork7Collections.cryptographyTask;

/**
 * Created by Александр on 01.03.2016.
 */
public class Cryptography {

    public static String cryptStringWithCharKey(String message, char key) {

        char[] messageArray = message.toCharArray();

        char[] cryptedMessageArray = new char[messageArray.length];

        for (int i = 0; i < messageArray.length; i++) {
            cryptedMessageArray[i] = (char) (messageArray[i] ^ key);

        }

        String cryptedString = String.copyValueOf(cryptedMessageArray);

        return cryptedString;
    }

}
