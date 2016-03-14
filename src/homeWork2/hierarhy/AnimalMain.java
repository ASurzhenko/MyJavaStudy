package homeWork2.hierarhy;

/**
 * Created by Александр on 14.03.2016.
 */
public class AnimalMain {
    public static void main(String[] args) {


        Pet cat = new Cat("Murzic", true);
        Pet dog = new Dog("Barbos", true);
        Pet fish = new Fish("Goldi", false);
        Pet hamster = new Hamster("Funtic", true);

        Wild giraffe = new Giraffe(false);
        Wild lion = new Lion(true);
        Wild wolf = new Wolf(true);
        Wild crocodile = new Crocodile(true);

        GuideDog guideDog = new GuideDog(true);

        System.out.println("Cat: " + cat);
        System.out.println("Dog: " + dog);
        System.out.println("Fish: " + fish);
        System.out.println("Hamster: " + hamster);
        System.out.println("Giraffe: " + giraffe + ", " + giraffe.isPredator());
        System.out.println("Lion: " + lion + ", " + lion.isPredator());
        System.out.println("Wolf: " + wolf + ", " + wolf.isPredator());
        System.out.println("Crocodile: " + crocodile + ", " + crocodile.isPredator());
        System.out.println("Guide-dog: " + guideDog.isTrained());
    }
}
