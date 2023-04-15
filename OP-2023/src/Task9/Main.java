package Task9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String firstLine = scan.nextLine();
        System.out.print("Введите вторую строку: ");
        String secondLine = scan.nextLine();

        boolean result = firstLine.endsWith(secondLine);

        System.out.println(result);
    }
}