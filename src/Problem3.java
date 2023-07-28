import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        int a ,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = s.nextInt();
        System.out.println("Enter second number : ");
        b = s.nextInt();

        int sum = a/b;
        System.out.println(sum);
    }
}
