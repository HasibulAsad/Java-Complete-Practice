import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {

//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5

        Scanner s = new Scanner(System.in);
        int a, b;

        System.out.println("Enter first number : ");
        a = s.nextInt();
        System.out.println("Enter second number : ");
        b = s.nextInt();

        System.out.println(a + " + " + b + " = " + a + b);
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + a * b);
        System.out.println(a + " / " + b + " = " + a / b);
        System.out.println(a + " mod " + b + " = " + a % b);
    }
}
