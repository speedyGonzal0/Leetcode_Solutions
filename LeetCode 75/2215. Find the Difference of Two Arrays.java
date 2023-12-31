class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();

        for (int i : nums1) {
            n1.add(i);
        }

        for (int i : nums2) {
            n2.add(i);
        }

        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>());
        res.add(new ArrayList<>());

        for (Integer i : n1) {
            if (!n2.contains(i)) {
                res.get(0).add(i);
            }
        }

        for (Integer i : n2) {
            if (!n1.contains(i)) {
                res.get(1).add(i);
            }
        }

        return res; 
    }
}