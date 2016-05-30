package patterns.factory.factory;

import patterns.factory.enums.PizzaType;
import patterns.factory.pizza.Pizza;

/**
 * Created by User on 30.05.2016.
 */
public interface PizzaFactory {
    Pizza createPizza(PizzaType type);
}
