// package HasPAthSum;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}

public class HasPAthSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.left==null && root.right==null && root.val==targetSum){
            return true;
        }

        boolean ans1=hasPathSum(root.left,targetSum-root.val);
        boolean ans2=hasPathSum(root.right,targetSum-root.val);

        return ans1 || ans2;
        
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        

        HasPAthSum finder = new HasPAthSum();
        int targetSum = 22;
        boolean result = finder.hasPathSum(root, targetSum);
        System.out.println("The tree has a path with sum " + targetSum + ": " + result);

    }
    
}
