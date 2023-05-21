import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        String concatNum = "";
        for(int i : digits){
            concatNum += i;
        }
        BigInteger addedNum = new BigInteger(concatNum);
        addedNum = addedNum.add(BigInteger.ONE);
        String newNum = addedNum.toString();
        int [] retArray = new int[newNum.length()];
        for(int i = 0; i < newNum.length(); i++){
            retArray[i] = Integer.parseInt(String.valueOf(newNum.charAt(i)));
        }
        return retArray;
    }
}