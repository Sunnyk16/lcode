// package MaxArea;

public class MaxArea {
    class Solution {
        public int maxArea(int[] height) {
            int start = 0;
            int end = height.length-1;
             int maxCap = 0;
    
             while(start < end){
                int minheight = Math.min(height[start],height[end]);
                int width =end -start;
    
                int currcap=minheight * width ;
                maxCap =Math.max(maxCap,currcap);
    
                if(height[start] < height[end]){
                    start ++; 
    
                }
                else{
                    end --;
                }
             } 
             return maxCap;
        }
    }
    public static void main(String[] args) {
        // Example usage of maxArea method
        int[] height = {1,8,6,2,5,4,8,3,7};
        Solution sol = new Solution();
        int ans = sol.maxArea(height);
        System.out.println(ans);
    }
    
}
