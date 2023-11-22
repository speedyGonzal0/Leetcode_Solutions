class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (counts.containsKey(nums[i])) {
                counts.replace(nums[i], counts.get(nums[i]) + 1);
            }
            else {
                counts.put(nums[i], 1);
            }
        }


        TreeMap<Integer, HashSet<Integer>> sortedCounts = new TreeMap<>();

        for (Map.Entry<Integer, Integer> i : counts.entrySet()) {
            if (!sortedCounts.containsKey(i.getValue())) {
                sortedCounts.put(i.getValue(), new HashSet<>());
            }
            sortedCounts.get(i.getValue()).add(i.getKey());
        }

        LinkedList<Integer> res = new LinkedList<>();

        while (res.size() < k) {
            res.addAll(sortedCounts.pollLastEntry().getValue());
        }

        int [] returnArray = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            returnArray[i] = res.get(i);
        }

        return returnArray;        
    }
}