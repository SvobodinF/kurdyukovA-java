package Utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Utils {
    public static String matrixToString(int[][] array){
        String result = Arrays.deepToString((array))
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]");

        return result;
    }

    public static void writeToFile(String data, String fileName){
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int square(int number){
        return number * number;
    }

    public static int getDigit(int num, int power) {
        int divisor = (int) Math.pow(10, power - 1);
        return num / divisor % 10;
    }

    public static int getFibonacciByNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacciByNumber(n - 1) + getFibonacciByNumber(n - 2);
        }
    }

    public static Integer CalculateCountExists(String input, char ch){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public static boolean isEven(long number){
        return number % 2 == 0;
    }

    public static int random(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static <T> int arrayValidation(T[] array, int index)
    {
        return index - (array.length * (index / array.length));
    }
}
