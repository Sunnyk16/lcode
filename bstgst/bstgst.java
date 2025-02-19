// package bstgst;

// import javax.swing.tree.TreeNode;
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

public class bstgst {
    int sum = 0 ;
    public TreeNode bstToGst(TreeNode root) {
        helper(root);
        return root ;
    }

    public void helper(TreeNode root){
        if(root == null){
            return ;
        }
        helper(root.right);
        sum = sum + root.val;
        root.val = sum ;
        helper(root.left);
    }
    public static void main(String[] args) {
        bstgst obj = new bstgst();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.left.right.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        obj.bstToGst(root);
        System.out.println(root.val);
    }
    
}
