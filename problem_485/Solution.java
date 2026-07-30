public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int streak = 0, max = 0;
        for (int num: nums) {
            if (num==1) {
                streak++;
                max = Math.max(streak, max);
            } else {
                streak = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 0};

        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
