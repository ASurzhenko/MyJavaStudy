package patterns;

import patterns.fly.Fly;
import patterns.quack.Quack;
import patterns.swim.SwimNoWay;

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
