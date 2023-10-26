package HomeworkLection5;

public class Exercise6 {
    public static void main(String[] args) {
        fndSumOfMatrixDiagonal();
    }

    private static void fndSumOfMatrixDiagonal() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int sum = 0;
        int size = matrix.length;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col) {
                    sum += matrix[row][col];
                }
            }
        }

        System.out.println(sum);
    }
}
