// package mergeTrees;
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

public class mergeTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
          
        if(root1==null && root2==null){
          return null;
        }
        else if(root1==null){
          return root2;
        }
        else if(root2==null){
          return root1;
        }

        TreeNode root= new TreeNode(root1.val + root2.val);

        root.left=mergeTrees(root1.left,root2.left);
        root.right=mergeTrees(root1.right,root2.right);

        return root;
      
  }
    public static void main(String[] args) {
        // Example usage
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);
    
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(6);
        root2.right.right = new TreeNode(7);
    
        mergeTrees finder = new mergeTrees();
        TreeNode result = finder.mergeTrees(root1, root2);
        System.out.println("The merged tree is: " + result);
    }
    
}
