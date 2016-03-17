package homeWork.hierarhyColors;

/**
 * Created by Александр on 17.03.2016.
 */
public abstract class Color {
    private String color;
    private int consumption;

    public String getColor() {
        return color;
    }

    public int getConsumption() {
        return consumption;
    }

    public Color(String color, int consumption) {
        this.color = color;
        this.consumption = consumption;
    }
}
