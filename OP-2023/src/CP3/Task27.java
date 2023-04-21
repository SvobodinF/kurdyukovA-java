package CP3;

import Utils.Debuggable;

import java.util.Scanner;

public class Task27 implements Debuggable {
    public enum Direction {
        left,
        right
    }

    public void invoke() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println("Введите смещение");
        int step = scanner.nextInt();
        Scanner input = new Scanner(System.in);
        System.out.println("Движемся вперед? (Y/N)");
        String dir = input.nextLine();
        dir = dir.toLowerCase();

        System.out.println(func(str, step, dir.charAt(0) == 'y' ? Direction.right : Direction.left));
    }

    private String func(String str, Integer step, Direction direction){
        String result = "";

        for (int i = 0; i < str.length(); i++){
            int byteCode = (int)str.charAt(i) + (direction == Direction.left ? -step : step);
            result += (char)byteCode;
        }

        return result;
    }
}
