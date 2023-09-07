public class BubbleSort {
    
    public static void bubbleSort(int arr[]){
        
        //i = turns
        for(int i=0; i < arr.length - 1; i++){
            // j = number of comparisons
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j]>arr[j+1]){
                    // swapping elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }
    }
    

    public static void optimizedBubbleSort(int arr[]){
        
        //i = turns
        for(int i=0; i < arr.length - 1; i++){
            int swap = 0;
            //j = number of comparisons
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j]>arr[j+1]){
                    swap++;
                    //swapping elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }                
            }
            if(swap == 0){
                break;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {5,4,1,3,2};
        
        printArr(arr);
        
        optimizedBubbleSort(arr);
        printArr(arr);
                
    }
}
// 