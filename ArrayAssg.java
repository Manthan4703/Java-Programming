public class ArrayAssg {

    public static boolean returnTrueIfAnyValueRepeats(int numbers[]) {

        /*
         * Given an integer array nums, return true if any
         * value appears at least twice in the array, and
         * return false if every element is distinct.
         */

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int indexFinder(int nums[], int target) {

        /*
         * There is an integer array nums sorted in ascending order (with distinct
         * values).
         * Prior to being passed to your function, nums is possibly rotated at an
         * unknown
         * pivot index k (1 <= k < nums.length) such that the resulting array is
         * [nums[k],
         * nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
         * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become
         * [4,5,6,7,0,1,2].
         * Given the array nums after the possible rotation and an integer target,
         * return the index
         * oftarget if it is in nums, or -1 if it is not in nums.You must write an
         * algorithm with
         * O(log n) runtime complexity.
         */

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            
            if (nums[mid] > target) {
                end = mid - 1;
            } 
            
            else {
                start = mid + 1;
            }
        }

        return -1;
    }


    public static int buyAndSellStocks(int prices[]){


        /*You  are  given  an  array prices where prices[i] is  the  price  
        of  a  given  stock  on  the ith day.Return the maximum profit you 
        can achieve from this transaction. If you cannot achieve any profit, 
        return 0.  */

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
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

    public static int trappingRainwater(int heights[], int width){

        int n = heights.length;
        int trappedWater = 0; 

        //Making leftMax
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for(int i = 1; i< n; i++){
            leftMax[i] = Math.max(leftMax[i-1], heights[i]);
        }

        //Making rightMax
        int rightMax[] = new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], heights[i]);
        }

        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += (waterlevel - heights[i]) *width;
            
        }

        return trappedWater;




    }

    public static void main(String args[]) {
        int heights[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        int width = 1;

        System.out.println(trappingRainwater(heights, width));
    }
}
