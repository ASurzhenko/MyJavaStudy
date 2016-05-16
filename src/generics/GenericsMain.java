package generics;

import OOP.inharitance.hierarhy.Employee;
import OOP.inharitance.hierarhy.Manager;
import OOP.inharitance.hierarhy.Person;

import java.util.*;

/**
 * Created by User on 06.05.2016.
 */
public class GenericsMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Manager());

        Employee employee = employees.get(0);
        employee.getPosition();

        Manager manager = new Manager();
        manager.setName("Vasya");
        Employee employee1 = new Employee();

        employee1 = manager;

        employee1.greeting();

        ArrayList<Manager> managers = new ArrayList<>();
        employees.add(new Employee());
        employees.get(0);

        managers.add(new Manager());
        Manager manager1 = managers.get(0);

        employee = manager;
        //employees = managers;

        employees.add(manager);

        fire(employees);
        fire(managers);

        Pair<Person, Person> personPair = new Pair<>(new Person(), new Person());
        Person first = personPair.getFirst();

        Pair<String, Integer> stringPair = new Pair<>("fsf", 100);
        stringPair.getSecond();

        Map<Person, String> personStringMap = new HashMap<>();
        personStringMap.put(manager, "some string");

        copy(employees, new ArrayList<>());

        List<Employee> employees1 = copy(managers);

        Collections.emptyList();
        fire(Collections.singletonList(employee));
        fire(Collections.<Employee>emptyList());
    }



    /*public static void fire1(List<Manager> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " is fired");
        }
    }*/

    public static void fire(List<? extends Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " is fired");
        }
        //employees.add(new Employee());
        Employee employee = employees.get(0);

    }

    public static void addEmployee(List<? super Employee> employees) {
        employees.add(new Employee());
        //Employee employee = employees.get(0);
    }

    public static <T> void copy(List<? extends T> source, List<T> target) {
        target.addAll(source);
    }

    public static <T> List<T> copy(List<? extends T> source) {
        List<T> target = new ArrayList<>();
        target.addAll(source);
        return target;
    }
}