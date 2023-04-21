package CP2;

import Utils.Debuggable;

import java.util.Scanner;
public class Task11 implements Debuggable {
    public void invoke() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");

        String result = input.nextLine().replaceAll("[УЕЁЫАОЭЯИЮуеёыаоэяию]", "");
        System.out.println(result);
    }
}