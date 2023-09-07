public class SubArraysSum {
    public static void subArrays(int numbers[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i<numbers.length; i++){
            int start = i;

            for(int j = i; j<numbers.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    sum = sum + numbers[k];
                    if(sum>maxSum){
                        maxSum=sum;
                    }
                    if(sum<minSum){
                        minSum=sum;
                    }   
                }                
                
                System.out.println("= "+sum);
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Max Sum is : "+maxSum);
        System.out.println("Min Sum is : "+minSum);
    }
    

    public static void main(String[] args) {

        int numbers[] = {1,-2,6,-1,3};
        subArrays(numbers);     
    }
}
