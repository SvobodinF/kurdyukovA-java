package CP2;

import Utils.Debuggable;

import java.util.Scanner;
public class Task9  implements Debuggable {
    public void invoke() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String firstLine = scan.nextLine();
        System.out.print("Введите вторую строку: ");
        String secondLine = scan.nextLine();

        boolean result = firstLine.endsWith(secondLine);

        System.out.println(result);
    }
}