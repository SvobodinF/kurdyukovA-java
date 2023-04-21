package CP2;

import Utils.*;

import java.util.Scanner;
public class Task4 implements Debuggable {
    public void invoke() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        System.out.print("Введите символ: ");

        char ch = scanner.next().charAt(0);
        int result = Utils.CalculateCountExists(input, ch);

        System.out.println("Символ " + ch + " встречается " + result + " раз");
    }
}