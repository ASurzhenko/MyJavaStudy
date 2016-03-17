package patterns.fly;

/**
 * Created by User on 15.03.2016.
 */
public class Rocket implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("YAHOOOO! I'm flying on the rocket!!!");
    }
}
