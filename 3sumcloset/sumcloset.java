// package 3sumcloset;

import java.util.Arrays;

public class sumcloset {
    
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int ans = 1 << 30;
            int n = nums.length;
            for (int i = 0; i < n; ++i) {
                int j = i + 1, k = n - 1;
                while (j < k) {
                    int t = nums[i] + nums[j] + nums[k];
                    if (t == target) {
                        return t;
                    }
                    if (Math.abs(t - target) < Math.abs(ans - target)) {
                        ans = t;
                    }
                    if (t > target) {
                        --k;
                    } else {
                        ++j;
                    }
                }
            }
            return ans;
        }
    
        public static void main(String[] args) {
            sumcloset sc = new sumcloset();
            int[] nums = new int[] { -1, 2, 1, -4 };
            int target = 1;
            System.out.println(sc.threeSumClosest(nums, target));
        }
    
}
