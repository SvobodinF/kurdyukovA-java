package CP4;

import Utils.Debuggable;

import java.util.Scanner;

public class Task44 implements Debuggable {
    @Override
    public void invoke() {
        System.out.println(func(getInput("Введите число"), getInput("Введите число")));
    }

    private String getInput(String placeholder){
        Scanner scanner = new Scanner(System.in);
        System.out.println(placeholder);
        return scanner.nextLine();
    }

    private String func(String x, String y){
        return "Sum = " + (Integer.parseInt(x) + Integer.parseInt(y));
    }
}
