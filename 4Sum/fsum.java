
// package 4Sum;
import java.util.*;

public class fsum {

    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            int n = nums.length;

            // Iterate over the array to pick the first element of the quadruplet
            for (int i = 0; i < n - 3; i++) {
                // Skip duplicate values for the first number to avoid repeating the same
                // quadruplet
                if (i > 0 && nums[i] == nums[i - 1])
                    continue;

                // Iterate over the array to pick the second element of the quadruplet
                for (int j = i + 1; j < n - 2; j++) {
                    // Skip duplicate values for the second number
                    if (j > i + 1 && nums[j] == nums[j - 1])
                        continue;

                    // Use two pointers to find the other two numbers
                    int left = j + 1;
                    int right = n - 1;
                    while (left < right) {
                        // Calculate sum of the current quadruplet
                        long sum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];
                        if (sum == target) {
                            // Found a valid quadruplet
                            res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            // Skip duplicates for the third and fourth numbers
                            while (left < right && nums[left] == nums[left + 1])
                                left++;
                            while (left < right && nums[right] == nums[right - 1])
                                right--;
                            left++;
                            right--;
                        } else if (sum < target) {
                            left++; // We need a larger sum, move the left pointer right
                        } else {
                            right--; // We need a smaller sum, move the right pointer left
                        }
                    }
                }
            }
            return res;
        }
    }
    public static void main(String[] args) {
        // Example usage of fourSum method
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        fsum sol = new fsum();
        Solution solution = sol.new Solution();
        List<List<Integer>> ans = solution.fourSum(nums, target);
        System.out.println(ans);
    }

}
