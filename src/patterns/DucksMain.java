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

        justDuck.setFlyBehaviour(new Rocket());

        justDuck.fly();
        justDuck.swim();
    }

    public static void duckWork(Duck[] ducks) {

    }
}
