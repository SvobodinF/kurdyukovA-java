package CP3;

import Utils.Debuggable;
import Utils.Utils;

import java.util.Scanner;

public class Task28 implements Debuggable {
    @Override
    public void invoke() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number < 0 || number > 100000){
            return;
        }

        System.out.println(func(number));
    }

    private String func(int number){
        int index = 1;
        int x = Utils.square(index + 1);
        int y = Utils.square(index);

        while (x - y != number){
            index++;
            x = Utils.square(index + 1);
            y = Utils.square(index);
        }

        return number + " = " + x + "-" + y;
    }
}
