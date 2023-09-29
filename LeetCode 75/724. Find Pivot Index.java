class Solution {
    public int pivotIndex(int[] nums) {
        //        for (int i = 0; i < nums.length; i++) {
//            int leftPointer = 0;
//            int rightPointer = nums.length - 1;
//
//            int leftSum = 0;
//            int rightSum = 0;
//
//            while (leftPointer < i) {
//                leftSum += nums[leftPointer];
//                leftPointer++;
//            }
//
//            while (rightPointer > i) {
//                rightSum += nums[rightPointer];
//                rightPointer--;
//            }
//
//            if (leftSum == rightSum) {
//                return i;
//            }
//        }
//
//        return -1;

        int totalSum = 0;

        for (int i : nums) {
            totalSum += i;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }
}