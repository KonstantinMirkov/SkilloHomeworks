package HomeworkLection4;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        eligibleToWork();
    }

    private static void eligibleToWork() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if (age >= 16) {
            System.out.println("You are eligible to work.");
        } else {
            System.out.println("You are not eligible to work.");
        }
    }
}
