import java.util.Scanner;
public class temp {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter celcius temperature:");
        double celcius =scanner.nextDouble();

        double fahrenhite = (celcius *9/5) +32;
        System.out.println(celcius + "C =" + fahrenhite + "F" );
        scanner.close();



    }
    
}
