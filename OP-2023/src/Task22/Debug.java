package Task22;

import java.util.Scanner;

public class Debug {

    public static void invoke() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сторону А: ");
        double lenA = scan.nextDouble();
        System.out.println("Введите сторону B: ");
        double lenB = scan.nextDouble();
        System.out.println("Введите сторону C: ");
        double lenC = scan.nextDouble();

        double result = Task3.Triangle.getSquare(lenA, lenB, lenC);
        System.out.println("S = " + (result));
    }
}
