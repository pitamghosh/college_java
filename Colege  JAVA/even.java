package college;

import java.util.Scanner;
public class even {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter a Number");
        int number= scanner.nextInt();
        
        if(number%2==0){
            System.out.println(number+"It is a even Number");
        }else{
             System.out.println(number+"It is a odd Number");
        }
        scanner.close();
    }
}
