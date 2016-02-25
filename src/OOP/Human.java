package OOP;

/**
 * Created by Александр on 25.02.2016.
 */
public class Human {

    static int handsAmount = 2;

    String name;

    public static String sayHello() {
        return "Hello from whole humanity!";
    }

    public String introduce() {
        return "my name is " + name;
    }
}
