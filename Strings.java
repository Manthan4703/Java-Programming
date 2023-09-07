import java.util.*;

public class Strings {

    public static void printCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static boolean isPalindrome(String str) {
        int startChar = 0;
        int endChar = str.length() - 1;
        while (startChar <= endChar) {
            if (str.charAt(startChar) != str.charAt(endChar)) {
                return false;
            }
            startChar++;
            endChar--;
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float pathDistance(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {

            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            }

            else if (path.charAt(i) == 'E') {
                x++;
            }

            else if (path.charAt(i) == 'W') {
                x--;
            }

            else {
                System.out.println("CHECK THE STRING!!!");
                break;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        float distance = (float) Math.sqrt(X2 + Y2);

        return distance;
    }

    public static String subString(String str, int si, int ei) {
        String substr = "";

        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }

        return substr;
    }

    public static String toUpperCase(String str) {

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
