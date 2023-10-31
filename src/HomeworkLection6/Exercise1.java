package HomeworkLection6;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int smallestNumber = findSmallestNumber(num1, num2, num3);
        System.out.println("The smallest number is: " + smallestNumber);
    }

    public static int findSmallestNumber(int num1, int num2, int num3) {
        int smallestNum = num1;

        if (num2 < smallestNum) {
            smallestNum = num2;
        }

        if (num3 < smallestNum) {
            smallestNum = num3;
        }

        return smallestNum;
    }
}
