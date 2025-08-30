
package college;
import java.util.Scanner;
public class krishnamurti {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;          // extract digit
            sum += factorial(digit);       // add factorial of digit
            num /= 10;                     // remove last digit
        }

        if (sum == original) {
            System.out.println(original + " is a Krishnamurthy number.");
        } else {
            System.out.println(original + " is NOT a Krishnamurthy number.");
        }

        sc.close();
    }
}
        
    

