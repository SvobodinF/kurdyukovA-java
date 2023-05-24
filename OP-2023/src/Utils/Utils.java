package Utils;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Utils {
    public static <T> String matrixToString(T[][] arrays){
        String result = Arrays.deepToString((arrays))
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]");

        return result;
    }

    public static Integer[][] convertInt2D(int[][] arrays){
        return Stream.of(arrays)
                .map(array -> IntStream.of(array).boxed().toArray(Integer[]::new))
                .toArray(Integer[][]::new);
    }

    public static String matrixToLine(int[][] array){
        String result = Arrays.deepToString((array))
                .replace("], ", "]")
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

    public static <T> int arrayValidation(ArrayList<T> array, int index)
    {
        return index - (array.size() * (index / array.size()));
    }

    public static Integer[][] listTo2DArray(ArrayList<Integer> array, int width, int height){
        if(array.size() != width*height)
            return new Integer[0][];

        Integer[][] result = new Integer[width][height];

        for(int i=0;i<array.size();i++)
            result[i/height][i%height] = array.get(i);

        return result;
    }
}
