import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");
        char[] chararray = scanner.nextLine().toCharArray();
        System.out.println("Reverse Array : ");
        for (int i = chararray.length - 1; i >= 0; i--) {
            System.out.print(chararray[i]);
        }
        System.out.println("\n");
    }
}
