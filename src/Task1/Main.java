package Task1;

import Services.Reader.Impl.ConsoleReader;
import Services.Writer.Impl.ConsoleWriter;
import Task1.Calculator.TaskCalculator;

public class Main
{
    public static void main(String[] args)
    {
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();
        var calculator = new TaskCalculator();

        writer.WriteLn("Input x:");
        var x = reader.ReadDouble();

        writer.WriteLn("Input y:");
        var y = reader.ReadDouble();

        writer.WriteLn("Result = " + calculator.Calculate(x, y));
    }
}