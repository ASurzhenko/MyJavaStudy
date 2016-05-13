package generics;

import OOP.inharitance.hierarhy.Person;

import java.util.Comparator;

/**
 * Created by User on 13.05.2016.
 */
public class PersonComparator implements Comparator <Person>{

    @Override
    public int compare(Person o1, Person o2) {
        Person person1 = (Person) o1;
        return 0;
    }
}
