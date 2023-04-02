import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLoader {

    public static int[] loadArrayFromStringSeq(String input) {
        // Assume string has been stripped of outer brackets
        if(input.length() == 0) return new int[0];

        // Split the string into values
        String[] values = input.split(",");
        int[] intList = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            int v = Integer.parseInt(values[i].replaceAll("\\[", "").replaceAll("]", "").trim());
            intList[i] = v;
        }

        return intList;
    }

    public static int[] loadArrayFromString(String input) {
        // Remove outer brackets
        input = input.substring(1, input.length() - 1);

        return loadArrayFromStringSeq(input);
    }

    public static int[][] loadNestedArrayFromString(String input) {

        // Remove outer brackets
        input = input.substring(1, input.length() - 1);

        // Split the string into inner arrays
        String[] innerArrays = input.replaceAll(" ", "").split("],\\[");
        int[][] nestedArray = new int[innerArrays.length][];

        for (int i = 0; i < innerArrays.length; i++) {
            nestedArray[i] = loadArrayFromStringSeq(innerArrays[i]);
        }

        return nestedArray;
    }

    public static String a2s(int[] a){
        String s = "[";
        for (int i = 0; i < a.length; i++) {
            if (i > 0){
                s += ", ";
            }
            s += a[i];
        } return s + ']';
    }
}