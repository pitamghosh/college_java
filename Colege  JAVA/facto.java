
package college;
import java.util.Scanner;
public class facto {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        
        long fac=1;
        
        for(int i=1;i<=num;i++){
            fac *=i;
        }
        System.out.println("Factorial of " + num + " is: " + fac);
        sc.close();
    }
}
