package patterns.strategy.swim;

/**
 * Created by Александр on 17.03.2016.
 */
public class Swim implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
