package HomeworkLection6;

public class Exercise6 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 121;
        int num3 = 3443;
        int num4 = 123454321;
        int num5 = 12345;
        int num6 = -5;

        System.out.println(num1 + " is a palindrome: " + isPalindrome(num1));
        System.out.println(num2 + " is a palindrome: " + isPalindrome(num2));
        System.out.println(num3 + " is a palindrome: " + isPalindrome(num3));
        System.out.println(num4 + " is a palindrome: " + isPalindrome(num4));
        System.out.println(num5 + " is a palindrome: " + isPalindrome(num5));
        System.out.println(num6 + " is a palindrome: " + isPalindrome(num6));
    }

    public static boolean isPalindrome(int number) {
            if (number < 0) {
                return false;
            }

            int originalNumber = number;
            int reversedNumber = 0;

            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            return originalNumber == reversedNumber;
    }
}
