package Task2;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        ArrayList<Integer> info = input.getInfo();
        System.out.println("Сотрудников зашло на предприятие:  " + counter(info));
    }
    private static int counter(ArrayList<Integer> values){
        int count = 0;
        for (int i : values) {
            if (i == 1) {
                count++;
            }
        }
        return count;
    }
}