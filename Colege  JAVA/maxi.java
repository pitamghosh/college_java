
package college;
import java.util.Scanner;
public class maxi {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter first Number");
        int number1= scanner.nextInt();
        
        System.out.print("Enter second Number");
        int number2= scanner.nextInt();
        
        System.out.print("Enter third Number");
        int number3= scanner.nextInt();
        
        int max;
        if(number1>number2 && number1>number3){
            max=number1;
        }else if(number2>number3 && number2>number1){
            max=number2;
        }else{
            max=number3;
        }
        
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}
