import java.util.Scanner;

public class pq4 {
    public static float avg(float a,float b,float c){
        return (a+b+c)/3;
    }

    public static boolean isEven(int n){
        if(n%2!=0){
            return false;
        }
        return true;
    }

    public static boolean isPalindrome(int n){
        int num = n;
        int rev = 0;

        while(n>0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n=n/10;
        }
        if(num==rev){
            return true;
        }
        
            return false;
        
    }

    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum = sum + lastDigit;
            n = n/10; 
        }
        return sum;
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the First Number : ");               //Q.1
        // float a = sc.nextFloat();

        // System.out.print("Enter the Second Number : ");
        // float b = sc.nextFloat();

        // System.out.print("Enter the Third Number : ");
        // float c = sc.nextFloat();

        // System.out.print("THE AVERAGE OF "+a+", "+b+" AND "+c+" IS : "+avg(a, b, c));





        // System.out.print("ENTER THE NUMBER : ");
        // int num = sc.nextInt();                                          //Q.2
        // System.out.println(isEven(num));




        // System.out.println("ENTER THE NUMBER : ");
        // int n = sc.nextInt();                                               //Q.3

        // System.out.println(isPalindrome(n));


        // System.out.println(Math.min(23,34));
        // System.out.println(Math.max(23,34));
        // System.out.println(Math.sqrt(9));                                   //Q.4
        // System.out.println(Math.pow(10,3));
        // System.out.println(Math.abs(-8.9));


        // System.out.print("ENTER THE NUMBER : ");
        // int num = sc.nextInt();
        //                                                                         //Q.5
        // System.out.println("SUM OF THE DIGITS OF THE NUMBER IS : "+sumOfDigits(num));
   

        
    }
}
