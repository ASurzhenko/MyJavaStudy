package patterns;

import patterns.fly.FlyNoWay;
import patterns.quack.Squick;
import patterns.swim.SwimNoWay;

/**
 * Created by User on 15.03.2016.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehaviour = new Squick();
        flyBehaviour = new FlyNoWay();
        swimBehaviour = new SwimNoWay();
    }

    @Override
    public void display() {
        System.out.println("rubber duck");
    }
}
