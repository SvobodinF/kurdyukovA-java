package Task20;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Debug {
    public static void invoke() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите высоту: ");
        int height = scan.nextInt();
        System.out.println("Введите ширину: ");
        int width = scan.nextInt();

        try (FileWriter writer = new FileWriter("array.txt")) {
            writer.write(generate(width, height));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generate(int wight, int height){
        int[][] result = new int[wight][height];

        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                int ring = Math.min(Math.min(i, j), Math.min(wight - i - 1, height - j - 1));
                result[i][j] = ring + 1;
            }
        }

        return Task1.Debug.formilize(result);
    }
}
