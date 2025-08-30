
package college;

import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter electricity units consumed: ");
        int units = scanner.nextInt();

        double bill = 0;

       
        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = (50 * 0.50) + ((units - 50) * 0.75);
        } else if (units <= 250) {
            bill = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } else {
            bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }

      
        double surcharge = bill * 0.20;
        double totalBill = bill + surcharge;

     
        System.out.println("Electricity Bill Details:");
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill (before surcharge): Rs. " + bill);
        System.out.println("Surcharge (20%): Rs. " + surcharge);
        System.out.println("Total Bill: Rs. " + totalBill);

        scanner.close();
    }
}

