
import java.util.ArrayList;
import java.util.List;

class permutation{
    
        private List<List<Integer>> ans = new ArrayList<>();
        private List<Integer> t = new ArrayList<>();
        private boolean[] vis;
        private int[] nums;
    
        public List<List<Integer>> permute(int[] nums) {
            this.nums = nums;
            vis = new boolean[nums.length];
            dfs(0);
            return ans;
        }
    
        private void dfs(int i) {
            if (i == nums.length) {
                ans.add(new ArrayList<>(t));
                return;
            }
            for (int j = 0; j < nums.length; ++j) {
                if (!vis[j]) {
                    vis[j] = true;
                    t.add(nums[j]);
                    dfs(i + 1);
                    t.remove(t.size() - 1);
                    vis[j] = false;
                }
            }
        }
        public static void main(String[] args) {
            int[] nums = {1, 2, 3,4};
            permutation p = new permutation();
            System.out.println(p.permute(nums));
        }
    
}