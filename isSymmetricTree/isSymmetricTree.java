class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class isSymmetricTree {
    
    public boolean helper(TreeNode root1 , TreeNode root2){
        if(root1 == null || root2 == null){
            return root1 == root2 ;
        }
        if(root1.val == root2.val){
            boolean ans1 = helper(root1.left , root2.right);
            boolean ans2 = helper(root1.right,root2.left);
            return ans1 && ans2 ;
        }else{
            return false ;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true ;
        }
        return helper(root.left , root.right);
    }
    /**
     * The main method to test the isSymmetric method.
     * 
     * This method creates a binary tree with the following structure:
     * 
     *         1
     *        / \
     *       2   2
     *      / \ / \
     *     3  4 4  3
     * 
     * It then creates an instance of the isSymmetricTree class and calls the isSymmetric method
     * to check if the tree is symmetric. The expected output is true.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        root.left.right.left = new TreeNode(5);
        root.right.left.right = new TreeNode(5);
        



        isSymmetricTree tree = new isSymmetricTree();
        System.out.println(tree.isSymmetric(root)); // Output should be true
    }
    
}
