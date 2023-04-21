package Utils;

public class Matrix{
    private int[][] matrix;
    public int[][] getMatrix() {
        return matrix;
    }

    public Matrix(int size) {
        matrix = generate(size, size);
    }

    private int[][] generate(int width, int height) {
        int[][] result = new int[width][height];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 10);
            }
        }

        return result;
    }
}
