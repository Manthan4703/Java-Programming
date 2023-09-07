public class TrappingRainWater {
    public static int trappingRainwater(int heights[],int width){

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
    

    public static void main(String[] args) {
        int numbers[] = {4,2,0,6,3,2,5};
        int width = 1;
       System.out.println("TRAPPED RAINWATER IS = "+trappingRainwater(numbers, width)); 
    }
}
