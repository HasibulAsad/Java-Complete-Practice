import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        // swap two number
        int a, b, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        a = s.nextInt();
        System.out.println("Enter second Number : ");
        b = s.nextInt();
        System.out.println("First Number : " + a + "Second Number : " + b);
        temp =a;
        a=b;
        b=temp;
        System.out.println("Swap one : "+a+" Swap tow : "+b);


    }
}
