
import java.util.ArrayList;
import java.util.List;

// package BinaryTreePaths;
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


public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans =new ArrayList<>();
        if(root==null){
            return ans;
        }
        else if(root.left==null && root.right==null){
            ans.add(""+ root.val);
        }
        

        List<String>leftans=binaryTreePaths(root.left);
        List<String>rightans=binaryTreePaths(root.right);

        for(String str :leftans){
            ans.add(root.val+"->"+str);

        }

        for(String str :rightans){
            ans.add(root.val+"->"+str);
            
        }

        return ans;
        
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(6);

        BinaryTreePaths tree = new BinaryTreePaths();
        System.out.println(tree.binaryTreePaths(root)); // Output should be ["1->2->5", "1->3"]
    }
    
}
