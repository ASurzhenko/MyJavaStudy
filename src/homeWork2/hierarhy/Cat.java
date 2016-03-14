package homeWork2.hierarhy;

/**
 * Created by Александр on 13.03.2016.
 */
public class Cat extends Pet {


    public Cat(String name, boolean isVactinated) {
        super(name, isVactinated);
    }

    @Override
    public String toString() {
        return "Hello, my name is " + name + ", Meow";
    }

}
