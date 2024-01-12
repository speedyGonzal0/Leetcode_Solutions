class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int max = sum;

        for (int i : gain) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}