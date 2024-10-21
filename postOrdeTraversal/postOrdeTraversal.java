
import java.util.ArrayList;
import java.util.List;

// package postOrdeTraversal;
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



public class postOrdeTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        

        helper(root,list);
        return list ;
        
    }

    public void helper(TreeNode root,List<Integer> list){
        if(root==null){
            return ;
        }

        helper(root.left,list);
        helper(root.right,list);

        list.add(root.val);
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        postOrdeTraversal tree = new postOrdeTraversal();
        System.out.println(tree.postorderTraversal(root)); // Output should be [4,5,2,3,1]
    }
    
}
