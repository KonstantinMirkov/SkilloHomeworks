package HomeworkLection4;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of vacation (Beach or Mountain):");
        String vacationType = scanner.nextLine();
        System.out.println("Enter your budget per day per person: ");
        double budgetPerDay = scanner.nextDouble();

        if (vacationType.equals("Beach")) {
            if (budgetPerDay < 50) {
                System.out.println("For a Beach vacation with a budget " + budgetPerDay + " we recommend Bulgaria.");
            } else {
                System.out.println("For a Beach vacation with a budget of " + budgetPerDay + " we recommend Outside Bulgaria.");
            }
        } else if (vacationType.equals("Mountain")) {
            if (budgetPerDay < 30) {
                System.out.println("For a Mountain vacation with a budget " + budgetPerDay + " we recommend Bulgaria.");
            } else {
                System.out.println("For a Mountain vacation with a budget " + budgetPerDay + " we recommend Outside Bulgaria.");
            }
        } else {
            System.out.println("Sorry, we have no information about this type of vacation.");
        }
    }
}
