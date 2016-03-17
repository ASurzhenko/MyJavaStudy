package homeWork7.hierarchyColors;

/**
 * Created by Александр on 17.03.2016.
 */
public class BlueColor extends Color {

    private String color;
    private double consumption;

    public String getColor() {
        return color;
    }

    public double getConsumption() {
        return consumption;
    }

    public BlueColor(String color, double consumption) {
        this.color = color;
        this.consumption = consumption;
    }


}
