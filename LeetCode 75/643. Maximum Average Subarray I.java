class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            
            sum += nums[i];

            if (i >= k - 1) {

                maxAvg = Math.max(maxAvg, sum / k);
                sum -= nums[i - k + 1];
            }
        }

        return maxAvg;
    }
}