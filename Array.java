// import java.util.Scanner;

public class Array {

    public static void update(int marks[], int nonchangeable){
        nonchangeable = 10;
        for(int i =0; i<marks.length; i++){
            marks[i]= marks[i]+1;
        }
    }

    public static int linearSearch(int numbers[], int key){
        for(int i = 1; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }

        return largest;

    }

    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;  //+infinity

        for(int i = 0; i<numbers.length;i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

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

    public static void reverseArray(int numbers[]){
        int first = 0;
        int last = numbers.length-1;

        while(first < last){
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }

    public static void arrayPairs(int numbers[]){

        for(int i = 0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+")  ");
            }
            System.out.println();
        }
    }

    public static void maxsubArrays(int numbers[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];


        //Calculating prefix array

        prefix[0]= numbers[0];
        for(int i = 1; i<prefix.length; i++){
            prefix[i]=prefix[i-1] + numbers[i];
        }

        for(int i = 0; i<numbers.length; i++){
            int start = i;

            for(int j = i; j<numbers.length; j++){
                int end = j;

                if(start == 0){
                    sum = prefix[end];
                }
                else{
                    sum = prefix[end] - prefix[start - 1];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }                
            }
        }
        System.out.println("Max Sum is : "+maxSum);
    }

    public static void kadanesAlgo(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i<numbers.length; i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Our Max Array Sum is : "+ maxSum);
    }

    public static int TrappingRainwater(int heights[],int width){

        int n = heights.length;

        //calculate left max boundary by array
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for(int i=1; i<n; i++){
            leftMax[i]= Math.max(heights[i], leftMax[i-1]);
        }

        //calculate right max boundary by array
        int rightMax[] = new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i = n - 2; i>=0; i--){
            rightMax[i] = Math.max(heights[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i = 0; i<n; i++){
            //waterlevel = min(maxLeft, maxRight)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            //trappedwater = (waterlevel - barlevel) * width
            trappedWater += (waterlevel - heights[i])  *width;
        }
        
        return trappedWater;
    }

    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        int n = prices.length;

        for(int i = 0; i<n; i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
       System.out.println(buyAndSellStocks(prices)); 
    }
}