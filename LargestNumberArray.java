import java.util.*;

public class LargestNumberArray {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};

        System.out.println("The Largest Number of the Array is : "+ getLargest(numbers));

    }
}
