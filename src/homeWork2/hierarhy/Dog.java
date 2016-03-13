package homeWork2.hierarhy;

/**
 * Created by Александр on 13.03.2016.
 */
public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Hello, my name is " + name + " Woof";
    }
}
