public class TwoDArrayAssg {

    public static void printTwoDArr(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();            
        }
    }

    public static int checkForKey(int matrix[][], int key){                   //FOR Q.1
        int num = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {                  
                if(matrix[i][j] == key){
                    num += 1;
                }
            }           
        }
        return num;
    }

    public static int sumOfSecondRow(int matrix[][]){                        //FOR Q.2
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[1][j];                      
        }
        return sum;
    }

    public static void printTranspose(int matrix[][]){
        int transposeMatrix[][] = new int[matrix[0].length][matrix.length];          //FOR Q.3
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
            
        }
        printTwoDArr(transposeMatrix);

    }



    public static void main(String[] args) {
        int arr[][]={ {4,7,8},
                      {8,8,7} };
        
        printTwoDArr(arr);

        System.out.println();

        printTranspose(arr);
        
    }
}
