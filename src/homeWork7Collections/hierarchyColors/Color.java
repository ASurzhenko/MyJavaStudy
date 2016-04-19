package homeWork7Collections.hierarchyColors;

/**
 * Created by Александр on 17.03.2016.
 */
public abstract class Color {
    private String color;
    private double consumption;

    public String getColor() {
        return color;
    }

    public double getConsumption() {
        return consumption;
    }

    public Color(String color, double consumption) {
        this.color = color;
        this.consumption = consumption;
    }
}
