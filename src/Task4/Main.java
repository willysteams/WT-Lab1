package Task4;

import Services.Reader.Impl.ConsoleReader;
import Services.Writer.Impl.ConsoleWriter;
import Services.Writer.Interface.Writer;

public class Main {
    public static void main(String[] args) {
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();

        writer.WriteLn("Input size:");
        var size = reader.ReadInt();

        var array = new int[size];
        for (int i = 0; i < array.length; i++) {
            writer.WriteLn("Input element " + (i + 1) + ":");
            array[i] = reader.ReadInt();
        }

        outputPrimeIndexes(writer, array);
    }

    private static void outputPrimeIndexes(Writer writer, int[] array) {
        writer.WriteLn("Indexes of prime numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                writer.Write(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
