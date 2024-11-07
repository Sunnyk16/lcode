// package DeepestLeavesum;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
        this.val = x; 
        this.left = null;
        this.right = null;
    }
}
public class DeepestLeavesum {
    class Solution {
        int ans = 0 ;
        public int height(TreeNode root ){
            if(root == null){
                return 0 ;
            }
            int lh = height(root.left );
            int rh = height(root.right);
            return Math.max(lh,rh) +1 ;
        }
        public int deepestLeavesSum(TreeNode root) {
            int h = height(root);
            helper(root , h);
            return ans ;
        }
    
        public void helper(TreeNode root , int height ){
            if(root == null){
                return ;
            }
            if(height == 1){
                ans = ans + root.val;
            }
            helper(root.left , height-1);
            helper(root.right , height-1);
        }
    }

    public static void main(String[] args) {
        DeepestLeavesum obj = new DeepestLeavesum();
        Solution sol = obj.new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        System.out.println(sol.deepestLeavesSum(root));
    }
    
}
