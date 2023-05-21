class Solution {
    public boolean isPowerOfFour(int n) {
        if( n % 4 != 0 && n != 1){
            return false;
        }
        else{
            double res = Math.log(n) / Math.log(4);
            if(res == (int)res ){
                return true;
            }
            return false;
        }

    }
}