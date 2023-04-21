package CP3;

import Utils.Debuggable;

import java.util.Arrays;

public class Task34 implements Debuggable {
    int[] array = {56, 65, 74, 100, 99, 68, 86, 180, 90};

    @Override
    public void invoke() {
        int[] result = new int[array.length];
        int[] sums = new int[array.length];

        for (int i = 0; i < sums.length; i++){
            sums[i] = numberSum(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            int index = getMinIndex(sums);
            result[i] = array[index];
            sums[index] = 999;
        }

        System.out.println(Arrays.toString(result));
    }

    private Integer numberSum(int number){
        String num = Integer.toString(number);
        char[] chars = num.toCharArray();
        int result = 0;

        for (int i = 0; i < chars.length; i++){
            result += Character.getNumericValue(chars[i]);
        }

        return result;
    }

    public int getMinIndex(int[] ints) {
        int index = 0;
        int min = ints[index];
        for (int i = 1; i < ints.length; i++) {
            if(ints[i]<min){
                min = ints[i];
                index = i;
            }
        }
        return index;
    }
}
