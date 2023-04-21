package CP2;

import Utils.Debuggable;

import java.util.Scanner;
public class Task16 implements Debuggable {
    public void invoke() {
        System.out.println("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int upReg = 0;
        int lowReg = 0;

        for (int i = 0; i < input.length(); i++) {
            char X = input.charAt(i);
            if (Character.isUpperCase(X)) {
                upReg++;
            } else if (Character.isLowerCase(X)) {
                lowReg++;
            }
        }

        String result = upReg > lowReg ? input.toUpperCase() : input.toLowerCase();
        System.out.println(result);
    }
}