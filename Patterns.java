public class Patterns {

    public static void hollowRectangle(int totRows, int totColumns){
        for (int i = 1; i <= totRows; i++){
            for (int j = 1; j <= totColumns; j++){
                if (i == 1 || i == totRows || j == 1 || j == totColumns){
                    System.out.print("* ");
                }                       
                else{
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }    
    }

    public static void invertedRotatedHalfPyramid(int n){
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= n; j++){
                if(j>(n-i)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedRotatedHalfPyramid2(int n){
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int n){
        int line = n;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= n; j++){
                if(j<=line){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            line --;
        }
    }


    public static void invertedHalfPyramid2(int n){
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=(n-i+1);j++){
                System.out.print(j+" ");
            }
            for(int j = 1; j<(i-1); j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }


    public static void floydTriangle(int n){
        int num = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n){
        int num = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void solidRhombus(int n){
        for(int i = 1; i<=5; i++){
            for(int j = (n-i); j>=0; j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=5 ;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void hollowRhombus(int n){
        for(int i = 1; i<=5; i++){
            for(int j = (n-i); j>=0; j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=5 ;j++){
                if(i==1 || j==1 || i==n || j==n){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void diamond(int n){
        //1st half
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j =(n-i); j>=0; j--){
                System.out.print("  ");
            }
            //stars
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        //2nd half
        for(int i = n; i>=1; i--){
            //spaces
            for(int j =(n-i); j>=0; j--){
                System.out.print("  ");
            }
            //stars
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]){
        diamond(7);
    } 
}
