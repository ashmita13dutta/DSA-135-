import java.util.*;


public class ValidPlaindromeRevision {
    public static void main(String[] args) {
        String sentence = " racecar";
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("[^a-zA-Z0-9]", "");
        char chars[] = sentence.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }


            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Valid Palindrome");
        } else {
            System.out.println("Invalid Palindrome");
        }


    }


}