class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        long res;
        long i = 1;
        while (true){
            res = i * i;
            if(res > x){
                i--;
                break;
            }
            else if(res == x){
                break;
            }
            i++;
        }
        return (int) i;
    }
}