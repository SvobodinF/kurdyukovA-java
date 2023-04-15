package Task6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = input.nextInt();

        String result = valid(num) == true ? "простое" : "не простое";

        System.out.println(num + "- " + result);
    }
    public static boolean valid(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}