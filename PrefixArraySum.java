public class PrefixArraySum {
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
    

    public static void main(String[] args) {

        int numbers[] = {1,-2,6,-1,3};

        maxsubArrays(numbers);     
    }
}
