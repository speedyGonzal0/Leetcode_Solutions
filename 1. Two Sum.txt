class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indices[] = new int[2];
        boolean found = false;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if( i != j && nums[i] + nums[j] == target){
                    indices[0] = i;
                    indices[1] = j;
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        return indices;
    }
}