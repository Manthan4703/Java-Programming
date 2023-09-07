import java.util.Scanner;

public class DecToBin {
    public static void decToBin(int decNum){
        int Num = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum>0){
            int rem = decNum%2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow ++;
            decNum = decNum /2;
        }
        System.out.println("Binary of "+Num+" = "+binNum);
    }

    public static void main(String args[]) {

    System.out.println("ENTER THE DECIMAL NUMBER");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

        decToBin(num);        
    }
}
