public class ValidPalindromeString {
    public static void main(String[] args) {
        ValidPalindromeString p = new ValidPalindromeString();
        // String s = "A man, a plan, a canal: Panama";
        String s = " ";
        if (p.palindromeString(s) == true) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }


    public boolean palindromeString(String s) {
        String lowerString = s.toLowerCase();
        String cleanString = lowerString.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = cleanString.length() - 1;
        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}