import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//
//        25 != 39
//        25 < 39
//        25 <= 39

        System.out.println("Input first integers : ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.println("input second integers : ");
        int second = scanner.nextInt();

        if (first < second) {
            System.out.println(first + " < " + second);
        } else if (first > second) {
            System.out.println(first + " > " + second);
        } else if (first == second) {
            System.out.println(first + " = " + second);
        }
    }
}
