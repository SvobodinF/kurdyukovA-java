package CP2;

import Utils.Debuggable;

import java.util.Scanner;
public class Task14 implements Debuggable {
    public void invoke() {
        Scanner scan = new Scanner(System.in);
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Введите число: ");
            int input = scan.nextInt();
            if (i == 0 || input > number[0]) {
                number[2] = number[1];
                number[1] = number[0];
                number[0] = input;
            } else if (i == 1 || input > number[1]) {
                number[2] = number[1];
                number[1] = input;
            } else {
                number[2] = input;
            }
        }
        System.out.println(number[0] + ", " + number[1] + ", " + number[2]);
    }
}