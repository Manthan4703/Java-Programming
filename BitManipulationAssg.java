import java.util.Scanner;

public class BitManipulationAssg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("ENTER NUMBER A : ");
        // int a = sc.nextInt();
        // System.out.print("ENTER NUMBER B : ");
        // int b = sc.nextInt();
        // System.out.println("BEFORE SWAPPING : ");
        // System.out.println("A = "+a+" and B = "+b);
        // a = a^b;
        // b = a^b;
        // a = a^b;
        // System.out.println("AFTER SWAPPING : ");
        // System.out.println("A = "+a+" and B = "+b);

        // System.out.print("ENTER THE NUMBER : ");
        // int num = sc.nextInt();

        // System.out.println(num+" + 1 = "+(-(~num)));

        for(char ch='A';ch<='Z';ch++) {
            System.out.print((char)(ch|' '));
        }

        //WE HAVE USED HERE ASCII TABLE 'A' = 65, 'B' = 66 -------- 'Z' = 90
        //AND 'a' = 97, 'b' = 99,--------------'z' = 122
        //Here difference is of 32 hence we have put empty space " " which has ascii no. of 32

    }
}
