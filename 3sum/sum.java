// package 3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<>();
            int n = nums.length;
            for (int i = 0; i < n - 2 && nums[i] <= 0; ++i) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int j = i + 1, k = n - 1;
                while (j < k) {
                    int x = nums[i] + nums[j] + nums[k];
                    if (x < 0) {
                        ++j;
                    } else if (x > 0) {
                        --k;
                    } else {
                        ans.add(List.of(nums[i], nums[j++], nums[k--]));
                        while (j < k && nums[j] == nums[j - 1]) {
                            ++j;
                        }
                        while (j < k && nums[k] == nums[k + 1]) {
                            --k;
                        }
                    }
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        sum s = new sum();
        Solution sol = s.new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(sol.threeSum(nums));
    }
    
}