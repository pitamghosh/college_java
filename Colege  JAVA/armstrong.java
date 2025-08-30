
package college;
import java.util.Scanner;
public class armstrong {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        
        int original=num;
        int sum=0;
        
         int digit = String.valueOf(num).length();
        
        while(num>0){
            int digits=num%10;
            sum+=Math.pow(digits,digit);
            num/=10;
        }
        if(original==sum){
            System.out.println(original + " is an Armstrong number.");
        }else{
            System.out.println(original + " is NOT an Armstrong number.");
        }
        sc.close();
    }
}
