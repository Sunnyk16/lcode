// package swapcolour;

public class swapcolour {
    
        public void sortColors(int[] nums) {
            int i = -1, j = nums.length, k = 0;
            while (k < j) {
                if (nums[k] == 0) {
                    swap(nums, ++i, k++);
                } else if (nums[k] == 2) {
                    swap(nums, --j, k);
                } else {
                    ++k;
                }
            }
        }
    
        private void swap(int[] nums, int i, int j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    
        public static void main(String[] args) {
            int[] nums = {2,0,2,1,1,0};
            swapcolour s = new swapcolour();
            s.sortColors(nums);
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    
    
}
