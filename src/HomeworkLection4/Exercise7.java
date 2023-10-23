package HomeworkLection4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
        reverseList();
    }

    private static void reverseList() {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> reversedList = new ArrayList<>();

        for (int i = list1.size() - 1; i >= 0; i--) {
            reversedList.add(list1.get(i));
        }

        System.out.println(reversedList);
    }
}
