package CP3;

import Utils.*;

import java.util.Scanner;

public class Task31 implements Debuggable {
    @Override
    public void invoke() {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(func(number));
    }

    private String func(int number){
        String str = Integer.toString(Utils.getFibonacciByNumber(number));
        int max = 0;
        char ch = '0';
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int value = Utils.CalculateCountExists(str, c);

            if (value > max){
                max = value;
                ch = c;
                continue;
            }

            if (value == max){
                max = value;
                ch = (int) c > (int) ch ? c : ch;
            }
        }

        return "[(" + max + ", " + ch + ")]";
    }
}
