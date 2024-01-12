class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length() > t.length()) {
            return false;
        }

        char[] sl = s.toCharArray();
        char[] tl = t.toCharArray();

        int i = 0;
        int j = 0;

        while (i < sl.length && j < tl.length) {
            if (sl[i] == tl[j]) {
                i++;
            }
            j++;
        }

        return i == sl.length;        
    }
}