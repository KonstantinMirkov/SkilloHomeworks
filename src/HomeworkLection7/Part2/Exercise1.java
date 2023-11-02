package HomeworkLection7.Part2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            System.out.println("Result of division: " + num1 / num2);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
