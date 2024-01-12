class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> occ = new HashMap<>();

        for (int i : arr) {
            if (!occ.containsKey(i)) {
                occ.put(i, 1);
            }
            else {
                occ.replace(i, occ.get(i) + 1);
            }
        }

        HashSet<Integer> uniqOcc = new HashSet<>(occ.values());

        return occ.size() == uniqOcc.size();
    }
}