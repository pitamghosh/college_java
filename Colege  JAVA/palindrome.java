
package college;
import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        
        int mainnum=num;
        int reverse=0;
         while(num>0){
             int digit=num%10;
              reverse=reverse*10+digit;
              num/=10;
         }
         if(reverse==mainnum){
             System.out.println(mainnum + " is a Palindrome number.");
         }else{
             System.out.println(mainnum + " is NOT a Palindrome number.");
         }
         sc.close();
    }
}
