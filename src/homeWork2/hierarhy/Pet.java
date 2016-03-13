package homeWork2.hierarhy;

/**
 * Created by Александр on 13.03.2016.
 */
public abstract class Pet extends Animal  {

    String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello, my name is " + name;
    }

}
