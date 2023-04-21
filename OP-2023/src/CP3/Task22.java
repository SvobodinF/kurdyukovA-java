package CP3;

import Utils.*;

import java.util.Scanner;

public class Task22 implements Debuggable {

    public void invoke() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сторону А: ");
        double lenA = scan.nextDouble();
        System.out.println("Введите сторону B: ");
        double lenB = scan.nextDouble();
        System.out.println("Введите сторону C: ");
        double lenC = scan.nextDouble();

        double result = Triangle.getSquare(lenA, lenB, lenC);
        System.out.println("S = " + (result));
    }
}
