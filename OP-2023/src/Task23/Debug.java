package Task23;

import java.util.Scanner;

public class Debug {
    public static void invoke() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Размер ряда: ");
        int length = scan.nextInt();
        System.out.println("Делитель 1: ");
        int del1 = scan.nextInt();
        System.out.println("Делитель 2: ");
        int del2 = scan.nextInt();

        System.out.println("сумма = " + func(length, del1, del2));
    }

    private static Integer func(int length, int del1, int del2){
        int result = 0;

        for (int i = 1; i <= length; i++){
            if (i % del1 == 0 || i % del2 == 0){
                result += i;
            }
        }

        return result;
    }
}
