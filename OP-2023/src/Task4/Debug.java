package Task4;

import java.util.Scanner;
public class Debug {
    public static void invoke() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        System.out.print("Введите символ: ");

        char ch = scanner.next().charAt(0);
        int result = CalculateCountExists(input, ch);

        System.out.println("Символ " + ch + " встречается " + result + " раз");
    }

    private static Integer CalculateCountExists(String input, char ch){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}