public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 1221;
        int og = n;
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (rev == og) {
            System.out.println("it is a palindrome number");
        } else {
            System.out.println("its not a palindrome");
        }

    }
}
