
package college;
import java.util.Scanner;
public class max {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter first Number");
        int number1= scanner.nextInt();
        
        System.out.print("Enter second Number");
        int number2= scanner.nextInt();
        
        int max=(number1>number2)? number1:number2;
        System.out.println("the maximum nuber is:"+max);
        
        scanner.close();
    }
}
