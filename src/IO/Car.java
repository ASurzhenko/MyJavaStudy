package IO;

import OOP.inharitance.hierarhy.Person;

import java.io.Serializable;

/**
 * Created by User on 19.04.2016.
 */
public class Car implements Serializable {
    private static final long serialVersionUID = -6331112598002137663L;
    private String brand;
    private int year;
    private final Person owner;
    private transient Tenant tenant;

    public Car(String brand, int year, Person owner) {
        System.out.println("in car constructor with three parameters");
        this.brand = brand;
        this.year = year;
        this.owner = owner;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", owner=" + owner +
                ", tenant=" + tenant +
                '}';
    }
}
