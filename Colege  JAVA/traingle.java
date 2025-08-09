import java.util.Scanner;
public class traingle {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter the base of the triangle:");
        double base =scanner.nextDouble();

        System.out.print("Enter the hight of the tringle:");
        double height =scanner.nextDouble();

        double area = (base * height)/2;
        System.out.println("The area of the tringle is:" +area);

        scanner.close();


    }
}
