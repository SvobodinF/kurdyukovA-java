package CP2;

import Utils.Debuggable;

import java.util.Scanner;

public class Task10 implements Debuggable {
    public void invoke() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scan.nextLine().trim();
        System.out.println("Привет, " + formalize(name) + "!!!");
    }

    private static String formalize(String name){
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}