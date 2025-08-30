
package college;
import java.util.Scanner;
public class odd {
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    
    System.out.print("Enter the starting number:");
    int start=scanner.nextInt();
    
    System.out.print("Enter the ending number:");
    int end=scanner.nextInt();
    
    System.out.println("odd number between"+ start+ "and" +end+ "are:");
    
    for(int i=start;i<=end;i++){
        if(i%2!=0){
            System.out.println(i);
        }
    }
    scanner.close();
}
}
