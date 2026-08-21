import java.util.Arrays;


public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        int max = 0;
        int pos = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            System.out.println(i + 1 + " Customer has wealth = " + sum);
            if (sum > max) {
                max = sum;
                pos = i + 1;
            }


        }
        System.out.println("The " + pos + " Customer is the richest with wealth of "
                + max);
    }