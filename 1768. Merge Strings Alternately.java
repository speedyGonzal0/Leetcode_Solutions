class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder res = new StringBuilder();
        for (i = 0; i < word1.length() && i < word2.length(); i++) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }

        if (i >= word1.length()) {
            res.append(word2.substring(i));
        } else {
            res.append(word1.substring(i));
        }

        return res.toString();
    }
}