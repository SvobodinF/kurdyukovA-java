package Task8;
import java.util.Scanner;
public class Debug
{
    public static void invoke() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        System.out.println("Введите число: ");
        int b = scan.nextInt();
        System.out.println("Введите число: ");
        int c = scan.nextInt();

        if (a + b <= c && a + c <= b && b + c <= a) {
            System.out.println("Треугольник не существует");
            return;
        }

        double angleA = GetAngle(a, b, c); //=>A
        double angleB = GetAngle(b, a, c); //=>B
        double angleC = GetAngle(c, a, b); //=>C

        double maxAngle = Math.max(Math.max(angleA, angleB), angleC);
        System.out.println("Наибольший внешний угол: " + maxAngle);
    }

    private static double GetAngle(int a, int b, int c){
        double cos = (b * b + c * c - a * a) / (2 * b * c);

        return Math.toDegrees(Math.acos(cos));
    }
}