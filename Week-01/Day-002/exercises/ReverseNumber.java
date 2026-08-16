public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1230;

        int rev = 0;
        if (n == 0) {
            System.out.print(0);
        }
        while (n != 0) {
            int digit = n % 10;
            System.err.print(digit);
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println();
    }
}
