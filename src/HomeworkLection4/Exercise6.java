package HomeworkLection4;

import java.util.Arrays;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {
        iterateList();
    }

    private static void iterateList() {
        List<Integer> list1 = Arrays.asList(12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200);

        for (int number : list1) {
            if (number > 150) {
                break;
            }
            if (number % 5 == 0) {
                System.out.println(number);
            }
        }
    }
}
