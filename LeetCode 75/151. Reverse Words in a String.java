class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\s+");

        if (words.length < 2) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int i = words.length - 1;

        while (i > 0) {
            sb.append(words[i]).append(" ");
            i--;
        }

        sb.append(words[i]);
        return sb.toString();
    }
}