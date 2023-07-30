public class Problem11 {
    public static void main(String[] args) {


//        Write a Java program to print the area and perimeter of a circle.
//                Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586

        double PI = 3.14159265358979323846;
        double radius = 7.5;

        double area = PI * radius * radius;
        double perimeter = 2 * PI *radius;

        System.out.println("Area is = "+area);
        System.out.println("Perimeter is = "+perimeter);

    }
}
