package Task5;

import Services.Reader.Impl.ConsoleReader;
import Services.Writer.Impl.ConsoleWriter;

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

        writer.WriteLn(getMinAmountOfElements(array) + " - element to remove");
    }

    public static int getMinAmountOfElements(int[] sequence) {
        int maxIncSequenceLength = 0;
        int currentIncSequenceLength;
        boolean isSequenceInc;

        for (int i = 0; i < sequence.length; i++) {
            isSequenceInc = true;
            currentIncSequenceLength = 1;
            for (int j = i + 1; (j < sequence.length) && isSequenceInc; j++) {
                if (sequence[j - 1] < sequence[j]) {
                    currentIncSequenceLength++;
                } else {
                    isSequenceInc = false;
                }
            }
            maxIncSequenceLength = Math.max(maxIncSequenceLength, currentIncSequenceLength);
        }
        return sequence.length - maxIncSequenceLength;
    }
}
