import java.util.Scanner;

public class NumberReversal {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER : ");
        int n = sc.nextInt();

        System.out.println("REVERSE OF THE NUMBER :");
        int rev = 0;

        while(n>0){
            int lastDigit = n%10;
            rev = (rev * 10) + lastDigit;
            // System.out.print(lastDigit);
            n /= 10;
        }
        
        System.out.println(rev);
         
    }
}
