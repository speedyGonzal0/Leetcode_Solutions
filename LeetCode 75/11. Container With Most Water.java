class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area = Math.min(height[i], height[j]) * (j - i);

        while (i < j) {
            int new_area = Math.min(height[i], height[j]) * (j - i);

            area = Math.max(area, new_area);

            if (height[i] < height[j]) {
                i++;
            }
            else if (height[j] < height[i]) {
                j--;
            }
            else {
                i++;
                j--;
            }
        }

        return area;
    }
}