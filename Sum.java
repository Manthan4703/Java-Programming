import java.util.*;

public class Sum{
    public static void main(String args[]){ 
        
        /*
         Code to Calculate Sum2
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a : ");
        int a = sc.nextInt();

        System.out.println("Enter value of b : ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum is :");
        System.out.println(sum);
    }
}