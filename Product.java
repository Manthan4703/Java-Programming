import java.util.Scanner;

public class Product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();

        System.out.println("Enter value of b : ");
        int b = sc.nextInt();

        int product = a * b;
        System.out.println("The product is :");
        System.out.println(product);

    }   
   
}
