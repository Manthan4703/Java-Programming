public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;
        
        while(start <= end){
            int mid = (start + end)/2;

            //compare mid and key

            if(numbers[mid]==key){
                return mid;
            }

            if(numbers[mid]>key){           //left
                end = mid - 1;
            }

            else{
                start = mid + 1;            //right
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = {2,4,6,8,10,12,14};
        int key = 11;
        int index = binarySearch(numbers, key);


        if(index == -1){
            System.out.println("NUMBER NOT FOUND !!!");
        }
        
        else{
            System.out.println("INDEX OF THE KEY IS "+index);
        
        }
        
    }
}
