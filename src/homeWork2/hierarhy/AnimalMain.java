package homeWork2.hierarhy;

/**
 * Created by Александр on 14.03.2016.
 */
public class AnimalMain {
    public static void main(String[] args) {


        Pet petCat = new Cat("Murzic");
        Pet petDog = new Dog("Barbos");
        Pet petFish = new Fish("Goldi");
        Pet petHamster = new Hamster("Funtic");
        Wild wildLion = new Lion();
        Animal guideDog = new GuideDog();

        System.out.println(petCat);
        System.out.println(petDog);
        System.out.println(wildLion);

        training((isTrained) guideDog);
        System.out.println(guideDog);

    }

    public static void training(isTrained trained) {
        trained.training();
    }
}
