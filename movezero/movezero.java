

public class movezero {
    
        public void moveZeroes(int[] nums) {
            int index = 0; // Position to place the next non-zero element
            for (int num : nums) {
                if (num != 0) {
                    nums[index++] = num;
                }
            }
            // Fill the remaining positions with zeros
            while (index < nums.length) {
                nums[index++] = 0;
            }
        }
        public static void main(String[] args) {
            movezero solution = new movezero();
            int[] nums = {0, 1, 0, 3, 12};
            solution.moveZeroes(nums);
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    
    
}
