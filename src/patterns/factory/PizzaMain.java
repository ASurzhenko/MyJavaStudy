package patterns.factory;

import patterns.factory.enums.PizzaType;
import patterns.factory.factory.ChPizzaFactory;
import patterns.factory.factory.NyPizzaFactory;
import patterns.factory.factory.PizzaComponentsFactory;

/**
 * Created by User on 30.05.2016.
 */
public class PizzaMain {
    public static void main(String[] args) {

        String stringPizzaType = args[0];
        PizzaType truePizzaType = PizzaType.of(stringPizzaType);

        System.out.println(truePizzaType.getName());

        PizzaComponentsFactory nyComponentFactory = new NyPizzaComponentFactory();
        PizzaStore nyPizzaStore = new PizzaStore(new NyPizzaFactory(nyComponentFactory));
        nyPizzaStore.order(PizzaType.CHEESE);

        PizzaComponentsFactory chComponentFactory = new ChPizzaComponentFactory();
        PizzaStore chPizzaStore = new PizzaStore(new ChPizzaFactory(chComponentFactory));
        chPizzaStore.order(PizzaType.MEAT);
    }
}
