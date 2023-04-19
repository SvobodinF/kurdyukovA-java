package Task10;
import java.util.Scanner;

public class Debug {
    public static void invoke() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scan.nextLine().trim();
        System.out.println("Привет, " + Formalize(name) + "!!!");
    }

    private static String Formalize(String name){
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}