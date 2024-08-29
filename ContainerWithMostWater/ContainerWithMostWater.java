
public class ContainerWithMostWater {
    public static class Solution {
        public int maxArea(int[] height) {
            int start = 0;
            int end = height.length - 1;
            int maxCap = 0;

            while (start < end) {
                int minHeight = Math.min(height[start], height[end]); // Use Math.min to find the shorter height
                int width = end - start;

                int currCap = minHeight * width; // Calculate the current capacity
                maxCap = Math.max(maxCap, currCap); // Update the maximum capacity if the current one is greater

                // Move the pointers to try and find a bigger area
                if (height[start] < height[end]) {
                    start++;
                } else {
                    end--;
                }
            }

            return maxCap;
        }
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        Solution s = new Solution();
        System.out.println(s.maxArea(height));
    }    
    
}
