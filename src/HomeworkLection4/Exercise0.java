package HomeworkLection4;

import java.util.Scanner;

public class Exercise0 {
    public static void main(String[] args) {
        triangleBuilt();
    }

    private static void triangleBuilt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three angles of the triangle:");

        System.out.print("Angle 1: ");
        double angle1 = scanner.nextDouble();
        System.out.print("Angle 2: ");
        double angle2 = scanner.nextDouble();
        System.out.print("Angle 3: ");
        double angle3 = scanner.nextDouble();

        if (angle1 + angle2 + angle3 == 180) {
            String triangleType = determineTriangleType(angle1, angle2, angle3);
            System.out.println("A triangle can be built, and it is a " + triangleType + " triangle");
        } else {
            System.out.println("A triangle cannot be built with these angles!");
        }
    }

    public static String determineTriangleType(double angle1, double angle2, double angle3) {
        if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            return "equilateral";
        } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            return "right-angled";
        } else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
            return "acute";
        } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
            return "obtuse";
        } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
            return "isosceles";
        } else {
            return "multifaceted";
        }
    }
}
