package homeWork7Arrays.hierarchyAnimals;

/**
 * Created by Александр on 13.03.2016.
 */
public class Dog extends Pet {

    public Dog(String name, boolean isVactinated) {
        super(name, isVactinated);
    }

    @Override
    public String toString() {
        return "Hello, my name is " + name + ", Woof";
    }
}
