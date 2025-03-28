

import java.util.ArrayList;
import java.util.List;

public class Generateparanthesis {
    
    private List<String> ans = new ArrayList<>();
    private int n;

    public List<String> generateParenthesis(int n) {
        this.n = n;
        dfs(0, 0, "");
        return ans;
    }

    private void dfs(int l, int r, String t) {
        if (l > n || r > n || l < r) {
            return;
        }
        if (l == n && r == n) {
            ans.add(t);
            return;
        }
        dfs(l + 1, r, t + "(");
        dfs(l, r + 1, t + ")");
    }

    public static void main(String[] args) {
        Generateparanthesis gp = new Generateparanthesis();
        int n = 3;
        System.out.println(gp.generateParenthesis(n));
    }

    
}
