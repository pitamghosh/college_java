
package college;
import java.util.Scanner;
public class natural {
   public static void main(String[]args){
       Scanner scanner =new Scanner(System.in);
       
       System.out.print("Enter a number:");
       int m=scanner.nextInt();
       int i=1;
       while(i<=m){
           System.out.println(i);
           i++;
       }
       scanner.close();
   } 
}
