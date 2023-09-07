import java.util.*;

public class StringsAssg {

    public static int lowercaseVowels(String str){
        int count = 0;
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static boolean checkAnagram(String str1, String str2){

        //To not check Separately for Upper Case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length()==str2.length()) {

            //Converting Strings to Char Array            
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //Sorting Both the Arrays
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            if(Arrays.equals(str1charArray,str2charArray)){
                return true;
            }


        }

        return false;        
    }
    public static void main(String[] args) {
        // String str = "My Name is MAnthan";
        // System.out.println(lowercaseVowels(str));

        String str1 = "worth";
        String str2 = "throw";
        System.out.println(checkAnagram(str1, str2));
        
    }
}
