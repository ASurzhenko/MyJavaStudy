package homeWork7.hierarhyAnimals;

/**
 * Created by Александр on 13.03.2016.
 */
public class GuideDog {

    boolean isTrained;

    public GuideDog(boolean isTrained) {
        this.isTrained = isTrained;
    }

    public String isTrained() {
        if (isTrained) {
            return "I can take you home";
        }
        return "";
    }
}
