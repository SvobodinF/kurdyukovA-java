package CP4;

import Utils.Debuggable;
import Utils.*;

import java.util.ArrayList;

public class Task47 implements Debuggable {
    @Override
    public void invoke() {
        Matrix matrix = new Matrix(3);

        System.out.println(Utils.matrixToString(Utils.convertInt2D(matrix.getMatrix())));
        System.out.println("==============");
        System.out.println(snail(matrix.getMatrix()));
    }

    private ArrayList<Integer> snail(int[][] array) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = array.length;
        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                result.add(array[rowBegin][i]);
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                result.add(array[i][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    result.add(array[rowEnd][i]);
                }
                rowEnd--;
            }

            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result.add(array[i][colBegin]);
                }
                colBegin++;
            }
        }

        return result;
    }
}
