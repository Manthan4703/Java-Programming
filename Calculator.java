import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter the Operator (+,-,*,/,%) : ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter The Number 2 : ");
        int b = sc.nextInt();


        switch(operator){
            case '+' : System.out.println(a+b);
                     break;
            case '-' : System.out.println(a-b);
                     break;
            case '*' : System.out.println(a*b);
                     break;
            case '/' : System.out.println(a/b);
                     break;
            case '%' : System.out.println(a%b);
                     break;
            default : System.out.println("Wrong Operator");
        }

    } 
}
