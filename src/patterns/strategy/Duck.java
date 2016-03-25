package patterns.strategy;

import patterns.strategy.fly.FlyBehaviour;
import patterns.strategy.quack.QuackBehaviour;
import patterns.strategy.swim.SwimBehaviour;

/**
 * Created by User on 15.03.2016.
 */
public abstract class Duck {

    QuackBehaviour quackBehaviour;

    FlyBehaviour flyBehaviour;

    SwimBehaviour swimBehaviour;

    public void fly() {
        flyBehaviour.fly();
    }

    public void swim() {
        swimBehaviour.swim();
    }

    public void quack() {
        quackBehaviour.quack();
    }

    public abstract void display();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

}
