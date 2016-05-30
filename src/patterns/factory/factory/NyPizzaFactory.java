package patterns.factory.factory;

import patterns.factory.enums.PizzaType;
import patterns.factory.pizza.NewYorkCheesePizza;
import patterns.factory.pizza.NewYorkMeatPizza;
import patterns.factory.pizza.Pizza;
import patterns.factory.pizza.ingredients.cheese.Mozarella;
import patterns.factory.pizza.ingredients.cheese.Parmejano;
import patterns.factory.pizza.ingredients.dough.Thick;
import patterns.factory.pizza.ingredients.dough.Thin;
import patterns.factory.pizza.ingredients.proteins.Meat;

/**
 * Created by User on 30.05.2016.
 */
public class NyPizzaFactory implements PizzaFactory {
    PizzaComponentsFactory pizzaComponentsFactory;

    public NyPizzaFactory(PizzaComponentsFactory pizzaComponentsFactory) {
        this.pizzaComponentsFactory = pizzaComponentsFactory;
    }

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new NewYorkCheesePizza(pizzaComponentsFactory);
                return pizza;
            case MEAT:
                pizza = new NewYorkMeatPizza(pizzaComponentsFactory);
                return pizza;
            default:
                throw new RuntimeException("unexpected pizza type. " +
                        "Expected 'Meat', 'Cheese', but found:" + type);
        }
    }
}
