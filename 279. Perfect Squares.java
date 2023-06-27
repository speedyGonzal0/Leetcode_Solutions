class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - (j * j)]);
            }
        }
        return dp[n];
    }
}