import java.util.*;
public class SmallestNumberArray {
    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;  //+infinity

        for(int i = 0; i<numbers.length;i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};

        System.out.println("The Smallest Number of the Array is : "+ getSmallest(numbers));

    }
}