import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            isPrime = false;
        }
        if (num == 2) {
            isPrime = true;
        }
        if (num % 2 == 0) {
            isPrime = false;
        } else {
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
        }

        if (isPrime) {
            System.out.printf("%d is a prime number.\n", num);
        } else {
            System.out.printf("%d is NOT a prime number.\n", num);
        }

        sc.close();
    }
}
