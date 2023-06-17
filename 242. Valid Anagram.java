class Solution {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()){
            return false;
        }

        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);

        for ( int i = 0; i < tChars.length; i++){
            if (sChars[i] != tChars[i]){
                return false;
            }
        }

        return true;
    }
}