public class main {
    public static void hollowRectangle(int totRows, int totColumns)
    {
        for (int i = 1; i <= totRows; i++){
            for (int j = 1; j <= totColumns; j++)
            {
                if (i == 1 || i == totRows || j == 1 || j == totColumns)           
                    System.out.print("*");           
                else
                    System.out.print(" ");           
            }
            System.out.println();
        }
      
    }
      
    // Driver program for above function
    public static void main(String args[])
    {
        hollowRectangle(4,5);
    }
}
