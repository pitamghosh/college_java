import java.util.Scanner;

public class retr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectraingle:");
        double width = scanner.nextDouble();

        double area=length*width;
        System.out.println("the area of the retrangle is:"+area);

        double perimeter =2*(length+width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        scanner.close();

    }
}
