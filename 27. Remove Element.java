class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0, j = nums.length - 1; i <= j; ) {
            if (nums[i] == val && nums[j] != val) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                k++;
                i++;
                j--;
            } else if (nums[i] != val && nums[j] == val) {
                k++;
                i++;
            } else if (nums[i] == val && nums[j] == val) {
                j--;
            } else if (nums[i] != val && nums[j] != val) {
                k++;
                i++;
            }

        }
        return k;
    }
}