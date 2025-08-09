import java.util.Scanner;
public class simple {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.print("enter prncipal amount:");
        double prncipal = scanner.nextDouble();

        System.out.print("enter rate of interest:");
        double rate = scanner.nextDouble();

        System.out.print("enter time:");
        double time = scanner.nextDouble();

        double simple =(prncipal * rate * time)/100;
        System.out.println("the simple interest is:" +simple);

        scanner.close();

    }
}
