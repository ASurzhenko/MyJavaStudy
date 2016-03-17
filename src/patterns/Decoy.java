package patterns;

import patterns.fly.FlyNoWay;
import patterns.quack.Quack;
import patterns.swim.SwimNoWay;

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
