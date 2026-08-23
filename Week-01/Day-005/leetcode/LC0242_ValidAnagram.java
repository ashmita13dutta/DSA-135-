import java.util.*;


public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(validAnagram("rat", "tar"));
    }


    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            int[] count = new int[256];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i)]++;
                count[t.charAt(i)]--;
            }
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }


            return true;
        }
    }
}