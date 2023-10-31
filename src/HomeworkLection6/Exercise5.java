package HomeworkLection6;

public class Exercise5 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 7;

        boolean isNum1Even = isEven(num1);
        boolean isNum2Even = isEven(num2);

        System.out.println(num1 + " is even: " + isNum1Even);
        System.out.println(num2 + " is even: " + isNum2Even);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
