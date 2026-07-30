public class Solution {
    public static String reversePrefix(String word, char ch) {
        int end = word.indexOf(ch);
        
        if(end == -1) {
            return word;
        }
        char[] chArr = word.toCharArray();
        int left = 0, right = end;
        while (left < right) {
            char temp = chArr[left];
            chArr[left] = chArr[right];
            chArr[right] = temp;
            left++; right--;
        }
        return new String(chArr);
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        System.out.println(reversePrefix(word, ch));
    }
}