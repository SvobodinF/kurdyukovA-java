package Task11;
import java.util.Scanner;
public class Debug {
    public static void invoke() {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите строку: ");

        String result = vvod.nextLine().replaceAll("[УЕЁЫАОЭЯИЮуеёыаоэяию]", "");
        System.out.println(result);
    }
}