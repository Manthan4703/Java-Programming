import java.util.Scanner;

public class Prime {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        System.out.print("ENTER YOUR NUMBER : ");
        int n = sc.nextInt();

        if(n==2){
            System.out.println("2 IS PRIME");
        }
        else{
            boolean isPrime = true;
            for(int i = 2; i<=Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }

            if (isPrime == true){
                System.out.println(n + " IS PRIME");
            }
            else{
                System.out.println(n + " IS NOT PRIME");
            }
        }

    } 
}
