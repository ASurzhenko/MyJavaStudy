package homeWork2.hierarhy;

/**
 * Created by Александр on 13.03.2016.
 */
public class GuideDog extends Animal {

    public static void training(isTrained trained) {
        trained.training();
    }

    @Override
    public String toString() {
        return "I can take you home";
    }
}
