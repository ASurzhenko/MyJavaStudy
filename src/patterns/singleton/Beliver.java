package patterns.singleton;

/**
 * Created by User on 03.06.2016.
 */
public class Beliver {
    static God god;
    String name;

  /*  public Beliver(God god) {
        Beliver.god = god;
    }*/

    @Override
    public String toString() {
        return "my name is " + name + " I belive in " + god.getName();
    }
}
