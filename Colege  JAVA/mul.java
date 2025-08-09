import java.util.Scanner;

public class mul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first Number");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second Number");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;
        System.out.println("The product of the two numbers is: " + result);

        scanner.close();

    }
}