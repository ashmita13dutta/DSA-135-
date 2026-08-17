import java.util.Arrays;


public class RunningSumArray {


    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 10, 1 };
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }
        System.out.println(Arrays.toString(runningSum));
    }
}