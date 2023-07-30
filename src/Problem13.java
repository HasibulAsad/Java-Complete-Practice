import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        int width,height,area,parimeter;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter width of rectangle : ");
        width = scanner.nextInt();
        System.out.println("Enter height of rectangle : ");
        height = scanner.nextInt();
        area = width*height;
        parimeter = 2 *(width+height);

        System.out.println("Area is : "+area+"\nParimeter is : "+parimeter);


    }
}
