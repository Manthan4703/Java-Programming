import java.util.*;

public class TwoDArray {

    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==key){
                    System.out.println("The key "+ key +" found at ("+i+","+j+")");
                    return true;
                }   
            } 
        }
        return false;

    }

    public static void printTwoDArr(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void printSpiral(int matrix[][]){
        int startRow =0;
        int endRow = matrix.length - 1;
        int startColumn = 0; 
        int endColumn = matrix[0].length - 1;

        while (startRow<=endRow && startColumn<=endColumn) {

            //TOP
            for(int j = startColumn; j<=endColumn; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //RIGHT
            for(int i = startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endColumn]+" ");
            }

            //BOTTOM
            for(int j = endColumn-1; j>=startColumn; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //LEFT
            for(int i = endRow-1; i>=startRow+1; i--){
                if(startColumn==endColumn){
                    break;
                }
                System.out.print(matrix[i][startColumn]+" ");
            }

            startRow++;
            startColumn++;
            endColumn--;
            endRow--;

            
        }
        System.out.println();
    }
    public static int diagSum(int matrix[][]){
        int sum = 0;
        // for(int i=0; i< matrix.length; i++){
        //     for(int j=0 ; j<matrix[0].length; j++){
        //         if(i==j){
        //             sum = sum + matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum = sum + matrix[i][j];
        //         }
        //     }
        // }

        for (int i = 0; i < matrix.length; i++) {
            //PRIMARY DIAGONAL
            sum += matrix[i][i];

            //SECONDARY DIAGONAL
            if(i != matrix.length-1-i)
            sum += matrix[i][matrix.length-1-i];
            
        }
        return sum;
    }

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
