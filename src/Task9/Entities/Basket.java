package Task9.Entities;

import Task9.Enums.Color;
import Task9.Interface.Colorable;
import Task9.Interface.Weightable;

import java.util.ArrayList;
import java.util.List;

public class Basket implements Weightable {
    private final List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public List<Ball> getBalls() {
        return balls;
    }

    @Override
    public int getWeight() {
        int weight = 0;
        for (Weightable ball : balls) {
            weight += ball.getWeight();
        }

        return weight;
    }

    public int getBlueBallsCount() {
        int amount = 0;
        for (Colorable ball : this.getBalls()) {
            if (ball.getColor() == Color.BLUE) amount++;
        }

        return amount;
    }
}
