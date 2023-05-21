class Solution {
    public boolean isPowerOfTwo(int n) {
        String s = "";
        if( n % 2 != 0 && n != 1){
            return false;
        }
        else{
            double res = Math.log(n) / Math.log(2);
            if(res == (int)res ){
                return true;
            }
            else{
                s = res + "";
                if( s.substring( s.indexOf(".") + 1, s.indexOf(".") + 4).equals("000") ){
                    return true;
                }
                
            }
            return false;
        }

    }
}