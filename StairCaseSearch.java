public class StairCaseSearch {
    // Considering The Top Right Cell as the Starting Point
    public static boolean stairCaseSearch(int matrix[][], int key){

        int row = 0;
        int column = matrix[0].length-1;

        while(row<matrix.length && column >=0){
            if(matrix[row][column]==key){
                System.out.println("The key "+ key +" found at ("+row+","+column+")");
                return true;
            }
            else if(matrix[row][column] < key){
                row++;
            }
            else{
                column--;
            }
        }
            System.out.println("The key "+ key +" not found !!!");
            return false;
    }

    //Considering The Bottom Left Cell as the Starting Point
    public static boolean stairCaseSearch2(int matrix[][], int key){
        int row = matrix.length -1;
        int column = 0;

        while(row>=0 && column<matrix[0].length){
            if(matrix[row][column]==key){
                System.out.println("The key "+ key +" found at ("+row+","+column+")");
                return true;
            }

            else if(matrix[row][column]>key){
                row--;
            }
            else{
                column++;
            }
        }
        System.out.println("The key "+ key +" not found !!!");
        return false;
    }



    public static void main(String[] args) {
        int matrix[][] ={{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}};
        int key = 35;

        stairCaseSearch(matrix, key);
        stairCaseSearch2(matrix, key);
        
    }
}
