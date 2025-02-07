// package Validatebst;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val=val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class Validatebst {

    public boolean isValidBST(TreeNode root) {
        
        return helper( root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean helper(TreeNode root,long min,long max){
        if(root==null){
            return true;

        }
        if(root.val<=min || root.val>=max){
            return false;
        }

        boolean leftans=helper(root.left,min,root.val);
        boolean rightans=helper(root.right,root.val,max);


        return leftans && rightans;
    }
    public static void main(String[] args) {
        Validatebst obj = new Validatebst();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        boolean result = obj.isValidBST(root);
        System.out.println(result);
    }
    
}
