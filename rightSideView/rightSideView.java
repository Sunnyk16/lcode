// package rightSideView;

import java.util.ArrayList;
import java.util.List;

// import javax.swing.tree.TreeNode;
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

public class rightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        helper(root,ans,0);
        return ans;
        
    }

    public void helper(TreeNode root,List<Integer> ans,int level){

        if(root==null){
            return;
        }

        if(ans.size() == level){
            ans.add(root.val);

        }

        helper(root.right,ans,level+1);
        helper(root.left,ans,level+1);
        
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        rightSideView finder = new rightSideView();
        List<Integer> result = finder.rightSideView(root);
        System.out.println("The right side view of the tree is: " + result);

    }

    
}
