package HomeworkLection4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        dayOfTheWeek();
    }

    private static void dayOfTheWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a digit (1-7) to find the day of the week:");
        int userInput = scanner.nextInt();

        String dayOfWeek;

        switch (userInput) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid input. Please enter a digit from 1 to 7";
                break;
        }

        String suffix;
        if (userInput >= 1 && userInput <= 7) {
            if (userInput == 1) {
                suffix = "st";
            } else if (userInput == 2) {
                suffix = "nd";
            } else if (userInput == 3) {
                suffix = "rd";
            } else {
                suffix = "th";
            }

            System.out.println("The " + userInput + suffix + " day of the week is " + dayOfWeek);
        } else {
            System.out.println(dayOfWeek);
        }
    }
}
