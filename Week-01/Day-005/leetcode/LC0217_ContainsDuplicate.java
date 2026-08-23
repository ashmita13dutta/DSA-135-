import java.util.*;


public class ContainsDuplicate {


    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 3, 4 };
        System.out.println(containsDuplicate(nums));
    }


    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            if (set.contains(val)) {
                return true;
            }
            set.add(val);
        }
        return false;
    }