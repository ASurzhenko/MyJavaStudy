package patterns.strategy;

import patterns.strategy.fly.FlyNoWay;
import patterns.strategy.quack.Quack;
import patterns.strategy.swim.SwimNoWay;

/**
 * Created by User on 15.03.2016.
 */
public class Decoy extends Duck {

    public Decoy() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
        swimBehaviour = new SwimNoWay();
    }

    @Override
    public void display() {
        System.out.println("decoy");
    }


}
