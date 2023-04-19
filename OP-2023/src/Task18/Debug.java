package Task18;

import java.util.ArrayList;
import java.util.Scanner;

public class Debug {

    public static void invoke() {
        Input(new ArrayList<>());
    }

    private static void Input(ArrayList<Integer> array){
        System.out.println("Введите элемент массива: ");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        if (number == -1){
            System.out.println(valid(array));
            return;
        }

        array.add(number);
        Input(array);
    }

    private static String valid(ArrayList<Integer> array){
        if (array.size() == 0){
            return "Array is empty";
        }

        ArrayList<Integer> leftSide = new ArrayList<>();
        ArrayList<Integer> rightSide = new ArrayList<>();
        int maxIndex = 0;
        int max = array.get(maxIndex);

        for(int i = 1; i < array.size(); i++){
            if (array.get(i) > max){
                maxIndex = i;
                max = array.get(maxIndex);
            }
        }

        for(int i = 0; i < array.size(); i++){
            if (i < maxIndex){
                leftSide.add(array.get(i));
                continue;
            }

            if (i > maxIndex){
                rightSide.add(array.get(i));
            }
        }

        return "Max number = " + (max) + "\n" + leftSide + "\n" + rightSide;
    }
}
