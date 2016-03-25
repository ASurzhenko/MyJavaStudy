package patterns.strategy;

import patterns.strategy.fly.Fly;
import patterns.strategy.quack.Quack;
import patterns.strategy.swim.SwimNoWay;

/**
 * Created by User on 15.03.2016.
 */
public class RedheadDuck extends Duck{

    public RedheadDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new Fly();
        swimBehaviour = new SwimNoWay();
    }

    @Override
    public void display() {
        System.out.println("redhead duck");
    }
}
