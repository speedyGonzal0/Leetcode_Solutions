class Solution {
    public int singleNumber(int[] nums) {
//        Map<Integer, Integer> numCounts = new HashMap<Integer, Integer>();
//
//        for (int num : nums) {
//            if (!numCounts.containsKey(num)) {
//                numCounts.put(num, 1);
//            } else {
//                numCounts.put(num, numCounts.get(num) + 1);
//            }
//        }
//
//        for(Map.Entry<Integer, Integer> entry: numCounts.entrySet()) {
//            if(entry.getValue() == 1) {
//                return entry.getKey();
//            }
//        }
//        return 1;

        int res = 0;
        for (int i = 0; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}