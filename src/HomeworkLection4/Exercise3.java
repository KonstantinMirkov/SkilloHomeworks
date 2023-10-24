package HomeworkLection4;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        calculateRevenue();
    }

    private static void calculateRevenue() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter unit price:");
        double unitPrice = scanner.nextDouble();

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        double revenue = unitPrice * quantity;
        double discount = 0.0;

        if (quantity >= 100 && quantity <= 120) {
            discount = 0.15 * revenue;
        } else if (quantity > 120) {
            discount = 0.20 * revenue;
        }

        double discountedRevenue = revenue - discount;

        System.out.println("The revenue from sale: " + discountedRevenue + "$");
        System.out.println("Discount: " + discount + " (" + (discount / revenue) * 100 + ")");
    }
}
