import java.util.Scanner;

public class circle {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter the radius of the circke:");
        double radius =scanner.nextDouble();

        double area = 3.14 *radius *radius;
        double circumference =2*3.14*radius;

        System.out.println("the area of the circle is:" +area);
        System.out.println("the circumference of the circle is:" +circumference);

        scanner.close();
    }
}
