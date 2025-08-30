
package college;
import java.util.Scanner;
public class add {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        
        
    System.out.print("Enter the number:");
    int p=scanner.nextInt();
    
    int i=1;
    int sum=0;
    while(i<=p){
        sum=sum+i;
        i++;
    }
    System.out.println("Sum of first " + p + " natural numbers is: " + sum);
    scanner.close();
    }
}
