

public class jump {
    
        public boolean canJump(int[] nums) {
            int mx = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (mx < i) {
                    return false;
                }
                mx = Math.max(mx, i + nums[i]);
            }
            return true;
        }
        public static void main(String[] args) {
            jump solution = new jump();
            int[] nums = {2, 3, 1, 1, 4,4,3};
            boolean result = solution.canJump(nums);
            System.out.println(result);
        }
    
    
}
