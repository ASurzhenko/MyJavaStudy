package homeWork7.hierarhyAnimals;

/**
 * Created by Александр on 13.03.2016.
 */
public abstract class Pet extends Animal {

    String name;
    boolean isVactinated;


    public Pet(String name, boolean isVactinated) {
        this.name = name;
        this.isVactinated = isVactinated;
    }

    @Override
    public String toString() {
        return "Hello, my name is " + name;
    }


}
