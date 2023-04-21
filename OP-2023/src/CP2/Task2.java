package CP2;

import Utils.Debuggable;
import Utils.Input;
import java.util.ArrayList;
public class Task2 implements Debuggable {
    public void invoke() {
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