package Task11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите строку: ");

        String result = vvod.nextLine().replaceAll("[УЕЁЫАОЭЯИЮуеёыаоэяию]", "");
        System.out.println(result);
    }
}