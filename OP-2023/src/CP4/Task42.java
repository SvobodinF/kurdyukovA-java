package CP4;

import Utils.Debuggable;

public class Task42 implements Debuggable {
    @Override
    public void invoke() {
        int[][] intervals= {
                {1, 2},
                {6, 10},
                {11, 15}
        };

        System.out.println(getLength(intervals));
    }

    private int getLength(int[][] ints){
        int result = 0;

        for (int i = 0; i < ints.length; i++){
            result += ints[i][1] - ints[i][0];
        }

        return result;
    }
}
