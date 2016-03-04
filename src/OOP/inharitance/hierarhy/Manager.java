package OOP.inharitance.hierarhy;

import OOP.inharitance.hierarhy.Employee;

/**
 * Created by User on 04.03.2016.
 */
public class Manager extends Employee {

    public void fire(Employee employee) {
        System.out.println(employee.position + " " + employee.getName() + " fired by " + position + " " + getName());

    }

    public void greeting() {
        System.out.println("Hello, I'm a manager, my name is " + getName());
    }

}
