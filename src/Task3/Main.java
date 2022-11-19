package Task3;

import Services.Reader.Impl.ConsoleReader;
import Services.Writer.Impl.ConsoleWriter;
import Services.Writer.Interface.Writer;
import Task3.Calculator.TaskCalculator;
import Task3.DoubleIterator.DoubleIterator;

public class Main {
    public static void main(String[] args) {
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();

        writer.WriteLn("Input a:");
        var a = reader.ReadDouble();

        writer.WriteLn("Input b:");
        var b = reader.ReadDouble();

        writer.WriteLn("Input h:");
        var h = reader.ReadDouble();

        outputFunctionTable(writer, a, b, h);
    }

    private static void outputFunctionTable(Writer writer, double a, double b, double h) {
        var range = new DoubleIterator(a, b, h);
        var calculator = new TaskCalculator();
        for (var number: range) {
            writer.WriteLn(number + " | " + calculator.Calculate(number));
        }
    }
}
