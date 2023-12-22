class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();

        int[][] dp = new int[t1.length + 1][t2.length + 1];

        for (int i = t1.length - 1; i >= 0; i--) {
            for (int j = t2.length - 1; j >= 0; j--) {
                if (t1[i] == t2[j]) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                }
                else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        return dp[0][0];        
    }
}