// package BalanceTree;

import java.util.ArrayList;

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

public class BalanceTree {
    public void inorder(TreeNode root , ArrayList<Integer> list  ){
        if(root == null){
            return ;
        }

        inorder(root.left , list );
        list.add(root.val);
        inorder(root.right , list );
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root , list );
        return BSTMaker(list , 0 , list.size()-1);
    }

    public TreeNode BSTMaker(ArrayList<Integer> list , int start , int end ){
        if(start > end ){
            return null;
        }
        int mid = (start + end )/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = BSTMaker(list , start , mid-1 );
        root.right = BSTMaker(list,mid+1 , end);
        return root ;
    }
    public static void main(String[] args) {
        BalanceTree obj = new BalanceTree();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        TreeNode result = obj.balanceBST(root);
        System.out.println(result.val);
    }
    
}
