// package combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {

    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> t = new ArrayList<>();
    private int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        dfs(0, target);
        return ans;
    }

    private void dfs(int i, int s) {
        if (s == 0) {
            ans.add(new ArrayList(t));
            return;
        }
        if (i >= candidates.length || s < candidates[i]) {
            return;
        }
        dfs(i + 1, s);
        t.add(candidates[i]);
        dfs(i, s - candidates[i]);
        t.remove(t.size() - 1);
    }
    public static void main(String[] args) {
        combinationSum cs = new combinationSum();
        int[] candidates = new int[] { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> ans = cs.combinationSum(candidates, target);
        for (List<Integer> l : ans) {
            for (int i : l) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
