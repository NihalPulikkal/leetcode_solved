public class Solution {
    public static int maximumWealth(int[][] accounts) {
        int maxSaving = 0;
        for (int[] customer : accounts) {
            int sum = 0;
            for (int saving : customer) {
                sum += saving;
            }
            if (sum > maxSaving) {
                maxSaving = sum;
            }
        }
        return maxSaving;
    }

    public static void main(String[] args) {
        // accounts = [[1,5],[7,3],[3,5]]
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };

        System.out.println(maximumWealth(accounts));
    }
}
