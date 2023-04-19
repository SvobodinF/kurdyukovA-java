package Task16;
import java.util.Scanner;
public class Debug {
    public static void invoke() {
        System.out.println("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int uppReg = 0;
        int lowReg = 0;

        for (int i = 0; i < input.length(); i++) {
            char X = input.charAt(i);
            if (Character.isUpperCase(X)) {
                uppReg++;
            } else if (Character.isLowerCase(X)) {
                lowReg++;
            }
        }

        String result = uppReg > lowReg ? input.toUpperCase() : input.toLowerCase();
        System.out.println(result);
    }
}