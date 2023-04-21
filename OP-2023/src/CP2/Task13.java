package CP2;

import java.util.Scanner;

public class Task13 {
    public static void invoke() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите начало ряда: ");
        int start = input.nextInt();
        System.out.print("Введите шаг: ");
        int step = input.nextInt();
        System.out.print("Введите количество шагов: ");
        int numStep = input.nextInt();

        for (int i = 0; i < numStep; i++) {
            int num = start + i * step;
            System.out.print(num + " ");
        }
    }
}