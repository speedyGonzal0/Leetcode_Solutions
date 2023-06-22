class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2){
            return nums.length;
        }
        int left = 1;
        int right = 1;
        while (right < nums.length){
            if (nums[right] != nums[right - 1]) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(nums));
        return left;
    }
}