package Task9;

import Services.Writer.Impl.ConsoleWriter;
import Task9.Entities.Ball;
import Task9.Entities.Basket;
import Task9.Enums.Color;

public class Main {
    public static void main(String[] args) {
        var writer = ConsoleWriter.getInstance();

        var basket = new Basket();
        basket.addBall(new Ball(Color.BLUE, 1));
        basket.addBall(new Ball(Color.BLUE, 1));
        basket.addBall(new Ball(Color.RED, 2));

        writer.WriteLn("Weight of basket is: " + basket.getWeight());
        writer.WriteLn("Amount of blue balls: " + basket.getBlueBallsCount());
    }
}
