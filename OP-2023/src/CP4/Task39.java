package CP4;

import Utils.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Task39 implements Debuggable {
    @Override
    public void invoke() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        System.out.println(func(number));
    }

    private int func(int number) {
        int result = 0;
        String str = Integer.toString(number);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (char c : str.toCharArray()) {
            numbers.add(Integer.parseInt(String.valueOf(c)));
        }

        for (int i = 0; i < numbers.size(); i++) {
            int subIndex = i + (i + 1 >= numbers.size() ? 0 : 1);
            int x = numbers.get(i);
            int y = numbers.get(subIndex);

            if (x < y) {
                int c = numbers.get(i);
                numbers.set(i, numbers.get(subIndex));
                numbers.set(subIndex, c);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i) * Math.pow(10, numbers.size() - i - 1);
        }

        if (number == result) {
            result = -1;
        }

        return result;
    }
}
