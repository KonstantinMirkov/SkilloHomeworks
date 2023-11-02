package HomeworkLection7.Part2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FixedCode {
    //fixed code for exercises 2, 3, 4:

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        String filePath = scanner.nextLine();

        try {
            System.out.println("Enter how many times to print the text: ");
            int timesToPrintTheTextToFile = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the text to add: ");
            String textToAdd = scanner.nextLine();

            FileWriter fileWriter = getFileWriter(filePath);

            printToFile(timesToPrintTheTextToFile, textToAdd, fileWriter);

            closeFileWriter(fileWriter);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please, enter a valid number");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static FileWriter getFileWriter(String filePath) throws IOException {
        return new FileWriter(filePath, true);
    }

    private static void printToFile(int timesToPrintTheTextToFile, String textToAdd, FileWriter fileWriter) {
        for (int i = 0; i < timesToPrintTheTextToFile; i++) {
            try {
                fileWriter.write(textToAdd + "\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void closeFileWriter(FileWriter fileWriter) {
        try {
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
