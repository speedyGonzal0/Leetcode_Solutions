class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < magazine.length() && ransomNote.length() > 0; i++){
            char currentChar = magazine.charAt(i);

            if(ransomNote.contains(currentChar + "")){
                int charIdx = ransomNote.indexOf(currentChar);

                if(charIdx == 0){
                    ransomNote = ransomNote.substring(1);
                }
                else if(charIdx == ransomNote.length() - 1){
                    ransomNote = ransomNote.substring(0, charIdx);
                }
                else{
                    ransomNote = ransomNote.substring(0, charIdx) + ransomNote.substring(charIdx + 1);
                }
            }
        }
        return ransomNote.isEmpty();
    }
}