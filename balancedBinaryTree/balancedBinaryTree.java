// package balancedBinaryTree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class balancedBinaryTree {
    boolean balanceFactor=true;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);

        if(Math.abs(lh-rh)>1){
            balanceFactor=false;
        }
        return Math.max(lh,rh)+1;
    }
    public boolean isBalanced(TreeNode root) {
        int h=height(root);

        return balanceFactor;
        
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);

        balancedBinaryTree tree = new balancedBinaryTree();
        System.out.println("Is the tree balanced? " + tree.isBalanced(root));
    }
    
}
