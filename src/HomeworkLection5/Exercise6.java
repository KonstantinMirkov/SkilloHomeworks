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
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }

        System.out.println(sum);
    }
}
