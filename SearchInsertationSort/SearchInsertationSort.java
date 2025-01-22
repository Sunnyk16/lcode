

public class SearchInsertationSort {
    
        public int searchInsert(int[] nums, int target) {
            int left = 0, right = nums.length;
            while (left < right) {
                int mid = (left + right) >>> 1;
                if (nums[mid] >= target) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }

        public static void main(String[] args) {
            SearchInsertationSort obj = new SearchInsertationSort();
            int[] nums = { 1, 3, 5, 6 };
            int target = 5;
            System.out.println(obj.searchInsert(nums, target));
        }
    
    
    
}
