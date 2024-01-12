class Solution {
    public void moveZeroes(int[] nums) {

        int i  = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                                
                if (temp == 0){
                    nums[i] = 0;
                }
                j++;
            }
            i++;
        }
 
    }
}