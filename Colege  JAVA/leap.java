
package college;
import java.util.Scanner;
public class leap {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter a Year");
        int year= scanner.nextInt();
        
        if(year%400==0 || year%4==0 || year%100!=0){
            System.out.println(year+":It is a leap Year");
        }else{
             System.out.println(year+"It is not a leap year");
        }
        scanner.close();
    }
}
