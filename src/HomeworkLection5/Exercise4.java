package HomeworkLection5;

public class Exercise4 {
    public static void main(String[] args) {
        largestNumberFromArray();
    }

    public static void largestNumberFromArray() {
        int[] numbers = {13, 45, 67, 32, 89, 5, 73, 56};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number in the array is: " + largest);
    }
}
