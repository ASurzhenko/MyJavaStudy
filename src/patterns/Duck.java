package patterns;

import patterns.fly.FlyBehavior;
import patterns.quack.Quack;
import patterns.quack.QuackBehavior;

/**
 * Created by User on 15.03.2016.
 */
public abstract class Duck {

    QuackBehavior quackBehavior;

    FlyBehavior flyBehavior;

    public void fly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    public void quack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void setFlyBehavior() {
        flyBehavior.fly();
    }
}
