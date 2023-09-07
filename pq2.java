import java.util.Scanner;

public class pq2 {
    public static void main(String args[]) {

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter The Number : ");
        // int num = sc.nextInt();

        // if(num > 0){                                                 //Q.1
        //     System.out.println("IT IS POSITIVE");
        // }
        // else if (num < 0){
        //     System.out.println("IT IS NEGATIVE");
        // }
        // else{
        //     System.out.println("THE NUMBER IS 0");
        // }



        // double temp = 103.5;
        // if(temp>100){
        //     System.out.println("FEVER");
        // }                                                                // Q.2
        // else{
        //     System.out.println("NO FEVER");
        // }


            // Scanner sc = new Scanner(System.in);

            // System.out.print("Enter The Number of the Day(1-7) : ");
            // int num = sc.nextInt();

            // switch(num){
            //     case 1 : System.out.println("MONDAY");
            //              break;
            //     case 2 : System.out.println("TUESDAY");
            //              break;
            //     case 3 : System.out.println("WEDNESDAY");
            //              break;                                                   // Q.3
            //     case 4 : System.out.println("THURSDAY");
            //              break;
            //     case 5 : System.out.println("FRIDAY");
            //              break;
            //     case 6 : System.out.println("SATURDAY");
            //              break;
            //     case 7 : System.out.println("SUNDAY");
            //              break;
            //     default : System.out.println("Invalid Number !!!");
            // }



            Scanner sc = new Scanner(System.in);

            System.out.print("Enter The Year : ");
            int year = sc.nextInt();

            if(year % 4 == 0){ 
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        System.out.println("IT IS A LEAP YEAR");
                    }
                    else{                                                               //Q.5
                        System.out.println("IT'S NOT A LEAP YEAR");
                    }
                }
                else{
                    System.out.println("IT IS A LEAP YEAR");
                }                                                
                
            }
            else{
                System.out.println("IT'S NOT A LEAP YEAR");
            }




    }
}
