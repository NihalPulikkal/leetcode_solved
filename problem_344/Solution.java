import java.util.*;

public class Solution {
    public static char[] reverseString(char[] s) {
        int left = 0, right = s.length-1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++; right--;
        }
        return s;
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        System.out.println(Arrays.toString(reverseString(s)));
    }
}
