import java.util.Scanner;

public class JavaBasics {

    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

    }

    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
        
    }
    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public static int multiply(int num1, int num2){
        int product = num1*num2;
        return product;
    }

    public static int factorial(int num){
        int fact = 1;
        for(int i=1; i<=num;i++){
            fact*=i;
        }


        return fact;
    }

    public static int binomialCoefficient(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int binoCoeff = n_fact/(r_fact*nmr_fact);

        return binoCoeff;
    }

    public static int sum (int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static int sum (int a, int b, int c){
        return a+b+c;
    }
    
    public static boolean isPrime(int n){
        for(int i = 2; i<(n-1); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i = 2; i<= n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void binToDec(int binNum){
        int Num = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of "+Num+" = "+decNum);
    }

    public static void DecToBin(int decNum){
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

    public static float avg(float a,float b,float c){
        return (a+b+c)/3;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);         

        
    }
}