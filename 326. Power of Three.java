class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 1) {
            return false;
        }
        else if(n % 3 == 0 || n == 1){

            double res = Math.log(n) / Math.log(3);
            if(res == (int)res){
                return true;
            }
            else {
                String s = "" + res;
                String substring = s.substring(s.indexOf(".") + 1, s.indexOf(".") + 5);
                return substring.equals("9999") || substring.equals("0000") ;
            }
        }
        return false;
    }
}