package patterns.swim;

/**
 * Created by Александр on 17.03.2016.
 */
public class SwimNoWay implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("I can't swim");
    }
}
