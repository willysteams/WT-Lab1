package Task2;

import Services.Reader.Impl.ConsoleReader;
import Services.Writer.Impl.ConsoleWriter;
import Task2.Impl.FullArea;
import Task2.Impl.RectangularArea;
import Task2.Interface.Area;

public class Main {
    public static void main(String[] args) {
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();
        Area taskArea = new FullArea(
                new RectangularArea(-4, 0, 8, 5),
                new RectangularArea(-6, -3, 12, 3)
        );

        writer.WriteLn("Input x:");
        var x = reader.ReadDouble();

        writer.WriteLn("Input y:");
        var y = reader.ReadDouble();

        writer.WriteLn("Point " + (taskArea.Contains(x, y) ? "in" : "not in") + " area");
    }
}
