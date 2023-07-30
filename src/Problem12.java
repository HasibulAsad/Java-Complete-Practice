import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = s.nextInt();
        System.out.println("Enter second number : ");
        b = s.nextInt();
        System.out.println("Enter third number : ");
        c = s.nextInt();

        int avarage = (a+b+c)/3;

        System.out.println("The avarage of three number is : "+avarage);

    }
}
