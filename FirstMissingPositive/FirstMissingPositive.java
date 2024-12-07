// package FirstMissingPositive;

public class FirstMissingPositive {
    
        public int firstMissingPositive(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n; ++i) {
                while (nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                    swap(nums, i, nums[i] - 1);
                }
            }
            for (int i = 0; i < n; ++i) {
                if (i + 1 != nums[i]) {
                    return i + 1;
                }
            }
            return n + 1;
        }
    
        private void swap(int[] nums, int i, int j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }

        public static void main(String[] args) {
            int[] nums = {3,4,-1,1};
            FirstMissingPositive fmp = new FirstMissingPositive();
            System.out.println(fmp.firstMissingPositive(nums));
        }
    
    
}
