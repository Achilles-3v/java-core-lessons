package chapter3.stringtasks.splitline;

import java.util.Arrays;

public class SplitLine {
    public static void main(String[] args) {
        String text = "1234567890";
        int n = 3;

        String[] result = splitLine(text, n);
        System.out.println(Arrays.toString(result));
    }

    public static String[] splitLine(String value, int n) {
        int arraySize = (int) Math.ceil(value.length() / (double) n);
        String[] result = new String[arraySize];
        int counter = 0;
        for (int i = 0; i < value.length(); i += n) {
            int endIndex = Math.min(value.length(), i + n);
            String substring = value.substring(i, endIndex);
            result[counter] = substring;
            counter++;
        }
        return result;
    }
}
