public class LargestString {

    public static String largestString(String array[]){
        String largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if(largest.compareTo(array[i]) < 0){
                largest = array[i];
            }  
        }
        return largest;
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        System.out.println(largestString(fruits));
    }
    
}
