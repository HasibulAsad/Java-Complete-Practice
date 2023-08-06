import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long number = scanner.nextLong();
        System.out.println("The sum of Digit is : " + sumofDigits(number));

    }

    public static long sumofDigits(long number) {
        long sum = 0;
        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }
}
