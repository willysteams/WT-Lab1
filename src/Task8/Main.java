package Task8;

import Services.Reader.Impl.ConsoleReader;
import Services.Reader.Interface.Reader;
import Services.Writer.Impl.ConsoleWriter;
import Services.Writer.Interface.Writer;
import Task7.ShellSort;

public class Main {
    public static void main(String[] args) {
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();

        writer.WriteLn("Input size of 1:");
        int[] seq1 = inputArray(writer, reader);

        writer.WriteLn("Input size of 2:");
        int[] seq2 = inputArray(writer, reader);


        int[] indexes = SequenceHelper.MergeSequencesIndexes(seq1, seq2);

        PrintArray(writer, indexes);
    }

    private static int[] inputArray(Writer writer, Reader reader) {
        var size = reader.ReadInt();

        var array = new int[size];
        for (int i = 0; i < array.length; i++) {
            writer.WriteLn("Input element " + (i + 1) + ":");
            array[i] = reader.ReadInt();
        }

        return array;
    }

    private static void PrintArray(Writer writer, int[] array) {
        for (int number : array) {
            writer.Write(number + " ");
        }
    }
}
