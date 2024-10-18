
public class isUnivalTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean helper(TreeNode root , int val){
        if(root == null){
            return true ;
        }

        if(root.val != val){
            return false ;
        }

        boolean leftans = helper(root.left,val);
        boolean rightans = helper(root.right,val);
        return leftans && rightans;
    }
    public boolean isUnivalTree(TreeNode root) {
        return helper(root,root.val);
    }

    public static void main(String[] args) {

        isUnivalTree tree = new isUnivalTree();
        TreeNode root = tree.new TreeNode(1);
        root.left = tree.new TreeNode(1);
        root.right = tree.new TreeNode(1);
        root.left.left = tree.new TreeNode(1);
        root.left.right = tree.new TreeNode(1);
        root.right.right = tree.new TreeNode(1);

        System.out.println(tree.isUnivalTree(root)); // should print true
        
    }
    
}
