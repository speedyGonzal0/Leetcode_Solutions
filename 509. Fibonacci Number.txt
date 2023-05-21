class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n - 1) + fib( n - 2);
        // else{
        //     int prev = 0;
        //     int current = 1;
        //     int sum = 0;
        //     for( int i = 1; i < n; i++ ){
        //         sum = prev + current;
        //         prev = current;
        //         current = sum;
        //     }
        //     return sum;
        // }
    }
}