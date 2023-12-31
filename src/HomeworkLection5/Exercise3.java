package HomeworkLection5;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        printMatrixElements();
    }

    public static void printMatrixElements() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix: ");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.println("Element at position " + (row + 1) + "," + (col + 1) + ": ");
                matrix[row][col] = scanner.nextInt();
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
