package OOP.inharitance;

import OOP.inharitance.hierarhy.Employee;
import OOP.inharitance.hierarhy.Manager;
import OOP.inharitance.hierarhy.Person;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by User on 04.03.2016.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ivan");

        Employee employee = new Employee();
        employee.setPosition("programmer");
        employee.setName("Denis");

        Manager manager = new Manager();
        manager.setPosition("director");
        manager.setName("Igor");
        manager.fire(employee);

        person.getName();

        Person employeeAsPerson = employee;
        //employeeAsPerson = person;

        Person managerAsPerson = manager;

        managerAsPerson.getName();
        employeeAsPerson.getName();

        //employeeAsPerson = person;
        //employeeAsPerson.getPosition();

        //Manager personAsManager = person;

        //Employee employee1 = (Employee) employeeAsPerson;

        if (employeeAsPerson instanceof Employee) {
            System.out.println("he is emloyee");
        } else {
            System.out.println("he is not employee");
        }
        //System.out.println(employee1.getPosition());

        /*person.greeting();
        manager.greeting();
        employee.greeting();*/

        Person somebody = manager;
        somebody.greeting();

        speak(person);
        speak(employeeAsPerson);
        speak(manager);

        /*Employee employee1 = new Employee();
        employee1.setName("Ivan");

        printName(employee1);*/

        System.out.println(person.getName());
        System.out.println(employee.getName());
        System.out.println(manager.getName());

        Object o = new Object();
        o = "SDF";



    }

   /* public static void printName(Person person) {
        System.out.println("name is " + person.name());
    }*/

    public static void speak(Person person) {
        person.greeting();
    }
}
