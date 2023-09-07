import java.util.*;

public class CheckPalindrome {


        public static boolean isPalindrome(String str){
            int startChar = 0;
            int endChar = str.length()-1;
            while (startChar<=endChar) {
                if (str.charAt(startChar)!=str.charAt(endChar)) {
                    return false;
                }
                startChar++;
                endChar--;
            }
            return true;
        }
    
        public static boolean isPalindrome2(String str){
            for(int i =0; i<str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-1-i)){
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println(isPalindrome2("racecar"));
         }
    }

