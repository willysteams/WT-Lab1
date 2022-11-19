package Task9.Entities;

import Task9.Enums.Color;
import Task9.Interface.Colorable;
import Task9.Interface.Weightable;

public class Ball implements Weightable, Colorable {
    private final Color color;
    private final int weight;

    public Ball(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
