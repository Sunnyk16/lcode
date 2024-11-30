// package duplicatearray;

public class duplicatearray {
    
        public int removeDuplicates(int[] nums) {
            int k = 0;
            for (int x : nums) {
                if (k == 0 || x != nums[k - 1]) {
                    nums[k++] = x;
                }
            }
            return k;
        }
        public static void main(String[] args) {
            duplicatearray da = new duplicatearray();
            int[] nums = new int[] { 1, 1, 2 };
            System.out.println(da.removeDuplicates(nums));
        }
    
    
}
