import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {


//        Test Data:
//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125

        Scanner s = new Scanner(System.in);
        int a, b;

        System.out.println("Enter first number : ");
        a = s.nextInt();
        System.out.println("Enter second number : ");
        b = s.nextInt();

        System.out.println(a + " * " + b+" = " + a * b);


    }
}
