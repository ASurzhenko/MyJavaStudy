package patterns;

import patterns.fly.Rocket;

/**
 * Created by User on 15.03.2016.
 */
public class DucksMain {
    public static void main(String[] args) {
        Duck justDuck = new RubberDuck();

        justDuck.display();
        justDuck.quack();
        justDuck.fly();

        justDuck.setFlyBehavior(new Rocket());

        justDuck.fly();
    }

    public static void duckWork(Duck[] ducks) {

    }
}
