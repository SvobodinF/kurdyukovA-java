package CP3;

import Utils.*;

import java.util.Scanner;

public class Task20 implements Debuggable {
    public void invoke() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите высоту: ");
        int height = scan.nextInt();
        System.out.println("Введите ширину: ");
        int width = scan.nextInt();

        Utils.writeToFile(generate(width, height), "array.txt");
    }

    private static String generate(int wight, int height){
        int[][] result = new int[wight][height];

        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                int ring = Math.min(Math.min(i, j), Math.min(wight - i - 1, height - j - 1));
                result[i][j] = ring + 1;
            }
        }

        return Utils.matrixToString(Utils.convertInt2D(result));
    }
}
