class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups =  new HashMap<>();

        for (String i : strs) {
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String groupedChars = String.valueOf(chars);

            if (!groups.containsKey(groupedChars)) {
                groups.put(groupedChars, new ArrayList<>());
            }

            groups.get(groupedChars).add(i);
        }


        return new ArrayList<List<String>>(groups.values());
    }
}