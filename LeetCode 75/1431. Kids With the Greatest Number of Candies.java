class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new LinkedList<>();

        int max = candies[0];

        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }

        for (int i : candies) {
            if (i + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;

        
        
    }
}