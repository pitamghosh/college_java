package college;
import java.util.Scanner;
public class possitive {
     public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter a Number");
        int number= scanner.nextInt();
        
        if(number>0){
            System.out.println(number+"It is a possitive Number");
        }else if(number<0){
             System.out.println(number+"It is a Negative Number");
        }else{
             System.out.println(number+"It is a zero Number"); 
        }
        scanner.close();
     }
}
