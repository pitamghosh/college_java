
package college;
import java.util.Scanner;
public class factor {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
    System.out.print("Enter the number:");
    int r=sc.nextInt();
    
    System.out.println("Factor of"+r+ "are:");
    
    for(int i=1;i<=r;i++){
        if(r%i==0){
            System.out.println(i+"");
        }
    }
    sc.close();
    }
}

