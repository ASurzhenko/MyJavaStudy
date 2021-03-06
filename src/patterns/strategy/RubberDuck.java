package patterns.strategy;

import patterns.strategy.fly.FlyNoWay;
import patterns.strategy.quack.Squick;
import patterns.strategy.swim.SwimNoWay;

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
