import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

//        Test Data:
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//...
//        8 x 10 = 80

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number for table: ");
        int number = s.nextInt();

        System.out.println("Here is your table : ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }


    }
}
