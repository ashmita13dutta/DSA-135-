public class ReverseStringRevision {
    public static void main(String[] args) {
        System.out.println(ReverseStringRevision.reverseAString("hello"));
    }


    public static String reverseAString(String a) {
        int left = 0;
        char chars[] = a.toCharArray();
        int right = chars.length - 1;


        while (left <= right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;


            left++;
            right--;
        }
        return new String(chars);


    }
}