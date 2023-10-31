package HomeworkLection6;

public class Exercise3 {
    public static void main(String[] args) {
        String input1 = "abcdef";
        String input2 = "abcde";
        String input3 = "a";

        System.out.println("The middle character of the first string is: " + findMiddleCharacter(input1));
        System.out.println("The middle character of the second string is: " + findMiddleCharacter(input2));
        System.out.println("The middle character of the third string is: " + findMiddleCharacter(input3));
    }

    public static String findMiddleCharacter(String input) {
        int length = input.length();

        if (length == 0) {
            return "String is empty";
        } else if (length % 2 == 0) {
            int middle1 = length / 2 - 1;
            int middle2 = length / 2;
            return input.charAt(middle1) + "" + input.charAt(middle2);
        } else {
            int middle = length / 2;
            return String.valueOf(input.charAt(middle));
        }
    }
}
