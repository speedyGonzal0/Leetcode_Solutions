class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        
        int nearest = (int) Math.round( (double)purchaseAmount / 10) * 10;
        return 100 - nearest;   
    }
}