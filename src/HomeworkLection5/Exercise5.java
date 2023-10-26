package HomeworkLection5;

import java.util.LinkedList;

public class Exercise5 {
    public static void main(String[] args) {
        reverseLinkedList();
    }

    public static void reverseLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        int size = linkedList.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(size - i - 1));
            linkedList.set(size - i - 1, temp);
        }

        System.out.println(linkedList);
    }
}
