package homeWork.hierarhyAnimals;

/**
 * Created by Александр on 13.03.2016.
 */
public abstract class Wild extends Animal {

    boolean isPredator;

    public Wild(boolean isPredaror) {
        this.isPredator = isPredaror;
    }

    public String isPredator() {
        if (isPredator) {
            return "I am a wild animal and I am angry";
        }
        return "I am a wild animal";
    }


}
