// package maxAscendingSum;

public class maxAscendingSum {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int max = nums[0];
            int currmax = nums[0];
    
            for(int i=1 ; i<nums.length;i++){
                if(nums[i-1]<nums[i]){
                    currmax = currmax + nums[i];
                }else {
                    max = Math.max(max , currmax);
                    currmax = nums[i];
                }
                // System.out.println("max : "+max+" currmax : "+currmax);
            }
             max = Math.max(max , currmax);
             return max ;
        }
    }
    public static void main(String[] args) {
        // Example usage of maxAscendingSum method
        int[] nums = {10,20,30,5,10,50};
        Solution sol = new Solution();
        int ans = sol.maxAscendingSum(nums);
        System.out.println(ans);
    }
    
}
