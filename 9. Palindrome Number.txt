class Solution {
    public boolean isPalindrome(int x) {
        
        String s = String.valueOf(x);
        boolean b = false;
        if(s.length() == 1){
            return true;
        }
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) == s.charAt(s.length() - i - 1)){
                b = true;
            }           
            else{
                return false;
            }            
        }
        return b;
    }
}