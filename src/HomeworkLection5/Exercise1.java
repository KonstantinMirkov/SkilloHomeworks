package HomeworkLection5;

public class Exercise1 {
    public static void main(String[] args) {
        arraySum();
    }

    public static void arraySum() {
        int[] numbers = {2, 4, 6, 8, 10};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of the array elements: " + sum);
    }
}
