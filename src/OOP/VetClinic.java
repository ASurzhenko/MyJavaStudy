package OOP;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by User on 26.02.2016.
 */
public class VetClinic {
    public static void main(String[] args) {
        Cat catTom = new Cat("Tom", "Blue", 2015);

        catTom.vaccinate("SACC");

        System.out.println(catTom.getbirthYear());

        String name = catTom.getName();

        String newName = name.replace('T', 'K');

    }
}
